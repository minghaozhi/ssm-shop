package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/5.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
