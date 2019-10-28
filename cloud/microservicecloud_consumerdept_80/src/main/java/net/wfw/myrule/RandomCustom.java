package net.wfw.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author 阿迪
 * @projectName cloud
 * @title RandomCustom
 * @date 2019/10/21 16:23
 */
public class RandomCustom extends AbstractLoadBalancerRule {

    //total=0  当total==5后   我们指针才能往下走
    //index=0  当前对外提供服务的服务器地址
    //total需要重置为零，但是已经达到过一个5次 我们的index=1
    //分析  我们5次  但是微服务 只有三个（8001，8002，8003） 所以得得改成三次 一旦满足三次  就进行下一个微服务的调用 以此类推


    private int total = 0;//调用次数   需求是 每个 调用5次
    private int currentIndex = 0;//微服务（8001/8002/8003）

    public Server choose(ILoadBalancer lb, Object key) {

        if (lb == null) {

            return null;

        }

        Server server = null;


        while (server == null) {

            if (Thread.interrupted()) {

                return null;

            }

            List<Server> upList = lb.getReachableServers();//现在活着的对外暴露的服务
            List<Server> allList = lb.getAllServers();//获取所有的服务

            int serverCount = allList.size();

            if (serverCount == 0) {


                return null;

            }


//            int index = chooseRandomInt(serverCount);
//            server = upList.get(index);


//            private int total = 0;//调用次数   需求是 每个 调用5次
//            private int currentIndex = 0;//微服务（8001/8002/8003）
            if (total < 5) {

                server = upList.get(currentIndex);
                total++;

            } else {
                total = 0;
                currentIndex++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }

            }


            if (server == null) {


                Thread.yield();//线程中断一会

                continue;

            }


            if (server.isAlive()) {

                return (server);

            }


            server = null;

            Thread.yield();

        }


        return server;


    }


    protected int chooseRandomInt(int serverCount) {

        return ThreadLocalRandom.current().nextInt(serverCount);

    }


    @Override

    public Server choose(Object key) {

        return choose(getLoadBalancer(), key);

    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
