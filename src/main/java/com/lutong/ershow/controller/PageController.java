package com.lutong.ershow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lutong
 * @date 4/3/2019 - 8:59 PM
 */

@Controller
public class PageController {

    @RequestMapping("")
    public String index(){
        return "login";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @RequestMapping("index")
    public String index2(){
        return "index";
    }

    @PostMapping("loginCheck")
    public String loginCheck(String username,String password){
        System.out.println("执行了这里"+username+password);
        if(username.equals("admin")&&password.equals("123456")){
            return "index";
        }else{
            return "login";
        }
    }




    @RequestMapping("table")
    public String table(){
        return "table";
    }



    @RequestMapping("table2")
    public String table2(){
        return "table2";
    }

    @RequestMapping("table3")
    public String table3(){
        return "table4";
    }











}
