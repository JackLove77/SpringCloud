package net.wfw.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 阿迪
 * @title Zuul_9527_StartSpringCloudApp
 * @date 2019/10/24 14:50
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class,args);
    }
}
