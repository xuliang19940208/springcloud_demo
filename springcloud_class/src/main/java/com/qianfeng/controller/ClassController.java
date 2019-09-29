package com.qianfeng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xuliang
 * @Date 2019-9-29
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/queryClassStudent")
    @ResponseBody
    public String qureyClassStudent(){
        System.out.println("查询班级的所有学生信息");
        //通过班级号查询所有车学生id

        //通过学生id查询对应的学生信息 -- 调用学生微服务
        String result = restTemplate.getForObject("http://web-student/stu/list",String.class);
        System.out.println("调用学生微服务的范围结果" + result);
        return "result:" + result;
    }

}
