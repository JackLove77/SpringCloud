package net.wfw.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 阿迪
 * @projectName cloud
 * @title DeptProvider8001_App
 * @date 2019/10/17 10:35
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
