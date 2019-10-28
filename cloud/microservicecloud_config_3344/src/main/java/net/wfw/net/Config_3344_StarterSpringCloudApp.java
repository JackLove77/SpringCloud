package net.wfw.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 阿迪
 * @projectName cloud
 * @title Config_3344_StarterSpringCloudApp
 * @date 2019/10/28 11:46
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StarterSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StarterSpringCloudApp.class,args);
    }
}

