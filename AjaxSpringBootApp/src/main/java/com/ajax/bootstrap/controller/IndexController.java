package com.ajax.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/index")
    public String getIndex() {
        return "index";
    }
}
