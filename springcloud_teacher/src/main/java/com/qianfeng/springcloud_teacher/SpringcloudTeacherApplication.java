package com.qianfeng.springcloud_teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.qianfeng")//扫描com.qianfeng下的所有包
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.qianfeng")
public class SpringcloudTeacherApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTeacherApplication.class, args);
    }

}
