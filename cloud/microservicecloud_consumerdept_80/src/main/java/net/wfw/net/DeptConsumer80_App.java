package net.wfw.net;

import net.wfw.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptConsumer80_App
 * @date 2019/10/17 10:51
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
