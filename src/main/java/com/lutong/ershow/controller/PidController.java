package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Pid;
import com.lutong.ershow.bean.User;
import com.lutong.ershow.service.PidService;
import com.lutong.ershow.utils.TableFormat;
import com.lutong.ershow.utils.TimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ResponseBody
    @RequestMapping("getPidsByBuyer")
    public List<Pid> getPidsByBuyer(Integer buyerid){
        return  pidService.getPidsByBuyer(buyerid);
    }

    @ResponseBody
    @RequestMapping("getCountByDay")
    public ArrayList<TableFormat> getCountByDay(){
        return  TableFormat.tranToTableFormat(pidService.getCountByDay());
    }



    //排行榜

    @ResponseBody
    @RequestMapping("getPidTimesThree")
    public List<HashMap<String,Object>> getPidTimesThree(){
        return  pidService.getPidTimesThree();
    }
    @ResponseBody
    @RequestMapping("getPidPricesThree")
    public List<HashMap<String,Object>> getPidPricesThree(){
        return  pidService.getPidPricesThree();
    }
    @ResponseBody
    @RequestMapping("getOrderPriceThree")
    public List<HashMap<String,Object>> getOrderPriceThree(){
        return  pidService.getOrderPriceThree();
    }
    @ResponseBody
    @RequestMapping("getCommentsThree")
    public List<HashMap<String,Object>> getCommentsThree(){
        return  pidService.getCommentsThree();
    }


    @ResponseBody
    @RequestMapping("getPidThree")
    public List<HashMap<String,Object>> getPidThree(){
        return  pidService.getPidThree();
    }
    @ResponseBody
    @RequestMapping("getPidTimeThree")
    public List<HashMap<String,Object>> getPidTimeThree(){
        return  pidService.getPidTimeThree();
    }


}
