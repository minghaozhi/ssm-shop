package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/1.
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
    @RequestMapping(value = "/{model}/{pageName}", method = RequestMethod.GET)
    public String toPage(@PathVariable("model") String model, @PathVariable("pageName") String pageName) {


        return model + "/" + pageName;
    }
}
