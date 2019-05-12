package com.minliu.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {

    @GetMapping("hello")
    public Map<String,String> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("info", "Hello");
        return map;

    }

    @GetMapping("hi")
    public Map<String,String> sayHi(){
        Map<String, String> map = new HashMap<>();
        map.put("info", "Hi");
        return map;

    }
}
