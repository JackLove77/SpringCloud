package net.wfw.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptProvider8001_App
 * @date 2019/10/28 15:42
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//服务发现
public class DeptProvider8001_Config_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Config_App.class,args);
    }
}
