package com.qianfeng.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author xuliang
 * @Date 2019-9-27
 */
@Controller
@RequestMapping("/stu")
public class StuController {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        System.out.println("查询了所有的学生的信息");
        return "学生列表" + port;
    }
}
