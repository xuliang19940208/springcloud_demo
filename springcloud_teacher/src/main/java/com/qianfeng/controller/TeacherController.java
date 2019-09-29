package com.qianfeng.controller;

import com.qianfeng.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author xuliang
 * @Date 2019-9-29
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private IStuService stuService;
    /**
     * 查询老师的所有的学生
     * @return
     */
    @RequestMapping("/queryTeacherStudent")
    @ResponseBody
    public String queryTeacherStudent() {

        String result = stuService.list();
        //调用学生微服务，查询所有学生
        return "result:" + result;
    }


}
