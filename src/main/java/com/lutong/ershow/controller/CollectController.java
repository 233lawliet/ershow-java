package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Collect;
import com.lutong.ershow.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lutong
 * @date 4/24/2019 - 10:17 AM
 */



@Controller
public class CollectController {

    @Autowired
    CollectService collectService;

    @ResponseBody
    @RequestMapping("insertCollect")
    public  Integer insertCollect(Collect c){
        return  collectService.insert(c);
    }


    @ResponseBody
    @RequestMapping("deleteCollect")
    public Integer deleteCollect(Collect collect){
        return collectService.deleteCollect(collect);
    }

    @ResponseBody
    @RequestMapping("getCollect")
    public List<Collect> getCollect(Long userid) {
        return collectService.getCollect(userid);
    }
}
