package com.hdm.demojenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: IndexController
 * @description:
 * @author: huangdaming
 * @Date: 2020-05-10 16:54
 */
@RestController
public class IndexController {

    @GetMapping("/index1")
    public String index1() {
        return "index1";
    }


    @GetMapping("index2")
    public String index2() {
        return "index2";
    }
}
