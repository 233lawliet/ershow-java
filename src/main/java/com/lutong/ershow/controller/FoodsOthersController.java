package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Foods;
import com.lutong.ershow.bean.FoodsOthers;
import com.lutong.ershow.service.FoodsOthersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lutong
 * @date 4/5/2019 - 4:59 PM
 */
@Controller
public class FoodsOthersController {

    @Autowired
    FoodsOthersService foodsOthersService;



    //添加楼的评论
    @ResponseBody
    @RequestMapping("addComments")
    public int addsComments(FoodsOthers foodsOthers){
        foodsOthersService.addComments(foodsOthers);
        return 1;
    }

    //添加查看的次数
    @ResponseBody
    @RequestMapping("addViews")
    public int addsView(FoodsOthers foodsOthers){
       return foodsOthersService.addViews(foodsOthers);

    }

    //竞价的次数
    @ResponseBody
    @RequestMapping("addPids")
    public int addsPids(FoodsOthers foodsOthers){
        return foodsOthersService.addPids(foodsOthers);

    }

}
