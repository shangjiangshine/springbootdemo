package com.shineyoung.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ShineYoung on 2018/11/13.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    // logback
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
    /**
     * 访问webapp/WEB-INF/jsp/login.jsp文件
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        logger.debug("记录debug日志");
        logger.info("访问了index方法");
        logger.error("记录error错误日志");
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
