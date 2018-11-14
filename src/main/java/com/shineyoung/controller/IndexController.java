package com.shineyoung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ShineYoung on 2018/11/13.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    /**
     * 访问webapp/WEB-INF/jsp/login.jsp文件
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    /**
     * 初始化登陆界面
     * @return
     */
    @RequestMapping(value = "/login_view", method = RequestMethod.GET)
    public String login_view() {
        return "login";
    }
}
