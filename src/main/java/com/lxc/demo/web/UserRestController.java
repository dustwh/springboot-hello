package com.lxc.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    @GetMapping("/rest")
    public String getJson() {
        return "ok";
    }
}
