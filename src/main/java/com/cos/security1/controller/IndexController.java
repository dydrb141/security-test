package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YongKyu.Han
 * @since 2020-12-08
 */
@Controller //view를 리턴
public class IndexController {

    @GetMapping({"", "/"})
    public String index() {
        return "index";
    }

    @GetMapping("user")
    public String user() {
        return "user";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("manager")
    public String manager() {
        return "manager";
    }

    @GetMapping("login")
    public String login() {
        return "loginForm";
    }

    @GetMapping("join")
    public String join() {
        return "join";
    }

    @GetMapping("joinProc")
    public @ResponseBody String joinProc() {
        return "회원가입 완료됨";
    }

}
