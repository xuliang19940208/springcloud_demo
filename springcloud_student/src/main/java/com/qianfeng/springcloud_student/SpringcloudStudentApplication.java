package com.qianfeng.springcloud_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com.qianfeng")
@EnableEurekaClient
public class SpringcloudStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStudentApplication.class, args);
    }

}
