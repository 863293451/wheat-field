package com.jk.controlelr.test;


import com.jk.pojo.test.boos;
import com.jk.service.test.ItestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("file")
public class testController {


    @Autowired
    private ItestService itestService;


    // 简单访问 , 访问方法，走页面
    @RequestMapping("/ss")
    @ResponseBody
    public String getMassage() {
        return "abcd11w2312342wqasdasd123";
    }

    // 使用 mybits  服务
    // 查询
    @RequestMapping("/getListboos")
    @ResponseBody
    public  List<boos> getListboos() {
        List<boos> boosList = itestService.getListboos();
        return boosList;
    }
}