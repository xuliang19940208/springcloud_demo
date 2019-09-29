package com.qianfeng.springcloud_class;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.qianfeng")
@EnableEurekaClient//项目启动自启
public class SpringcloudClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClassApplication.class, args);
    }

    //
    @Bean//添加创建对象
    @LoadBalanced//负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
