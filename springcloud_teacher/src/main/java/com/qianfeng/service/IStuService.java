package com.qianfeng.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xuliang
 * @Date 2019-9-29
 */
@FeignClient("web-student")
public interface IStuService {

    @RequestMapping("/stu/list")
    String list();
}
