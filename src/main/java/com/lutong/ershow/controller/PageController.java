package com.lutong.ershow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lutong
 * @date 4/3/2019 - 8:59 PM
 */

@Controller
public class PageController {

    @RequestMapping("")
    public String index(){
        return "index";
    }
    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("foodsOthers")
    public String foodsOthers(){
        return "foodsOthers";
    }

    @RequestMapping("userPage")
    public String user(){
        return "user";
    }


    @RequestMapping("pidPage")
    public String pid(){
        return "pid";
    }
}
