package net.wfw.net.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 阿迪
 * @projectName cloud
 * @title ConfigBean
 * @date 2019/10/17 10:41
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced//Spring cloud Ribbon 是基于NetFlix Ribbon 实现的一套客户端  负载均衡的工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
