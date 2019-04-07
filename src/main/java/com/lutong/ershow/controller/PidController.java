package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Pid;
import com.lutong.ershow.bean.User;
import com.lutong.ershow.service.PidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lutong
 * @date 4/6/2019 - 6:14 PM
 */

@Controller
public class PidController {


    @Autowired
    PidService pidService;


    //进行竞拍:
    //订单修改+竞拍次数1+竞拍记录
    @ResponseBody
    @RequestMapping("pid")
    public int pid(Pid pid, User user){
        return pidService.insert(pid,user);
    }

    @ResponseBody
    @RequestMapping("getPids")
    public List<Pid> getPids(int foodsId){
        return  pidService.getPids(foodsId);
    }

}
