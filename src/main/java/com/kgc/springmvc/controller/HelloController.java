package com.kgc.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 86182
 */
@Controller
public class HelloController {

    @RequestMapping("/query.do")
    @ResponseBody
    public Map<String,Object> query()
    {
        System.out.println("query-controller");
        Map<String,Object> ouput = new HashMap<>();
        ouput.put("xxxx","aaa");
        return ouput;
    }

}
