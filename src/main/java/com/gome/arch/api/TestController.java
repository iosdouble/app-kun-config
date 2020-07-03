package com.gome.arch.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/7/3 7:09 PM
 * @Created by nihui
 */
@RestController
public class TestController {
    @GetMapping("/get")
    public String hello(){
        return "hello world";
    }
}
