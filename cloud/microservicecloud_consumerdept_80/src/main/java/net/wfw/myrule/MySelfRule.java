package net.wfw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 阿迪
 * @projectName cloud
 * @title MySelfRule
 * @date 2019/10/21 14:35
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){

        //return new RandomRule();//ribbon默认算法是轮询，自定义变成随机
        return new RandomCustom();//轮询 每个调5次 自定义的

    }


}
