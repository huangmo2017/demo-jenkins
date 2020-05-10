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

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
