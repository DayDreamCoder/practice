package com.minliu.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liumin
 * @date: 2019/5/12 14:10
 * @version: JDK1.8
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public Map<String,String> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("info", "Hello");
        return map;

    }
}
