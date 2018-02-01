package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/1.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "jsp/index";
    }
}
