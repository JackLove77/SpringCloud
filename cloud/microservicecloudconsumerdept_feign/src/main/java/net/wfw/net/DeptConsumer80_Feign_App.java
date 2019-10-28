package net.wfw.net;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptConsumer80_App
 * @date 2019/10/17 10:51
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"net.wfw.net"})
@ComponentScan("net.wfw.net")
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
