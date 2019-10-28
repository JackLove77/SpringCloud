package net.wfw.net.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阿迪
 * @projectName cloud
 * @title ConfigClientRest
 * @date 2019/10/28 14:57
 */
@RestController//验证项目是否从git上拉取了配置
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.server-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        String str = "applicationName: "+ applicationName + "\t eurekaServers: " + eurekaServers + "\t port: " + port;
        System.out.println("====================str:"+str);
        return str;
    }
}