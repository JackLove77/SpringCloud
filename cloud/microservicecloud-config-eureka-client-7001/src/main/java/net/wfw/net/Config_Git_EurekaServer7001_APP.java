package net.wfw.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 阿迪
 * @projectName cloud
 * @title Config_Git_EurekaServer7001_APP
 * @date 2019/10/28 15:32
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServer7001_APP {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServer7001_APP.class,args);
    }

}
