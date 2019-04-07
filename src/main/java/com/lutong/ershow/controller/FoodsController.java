package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Foods;
import com.lutong.ershow.bean.User;
import com.lutong.ershow.service.FoodsService;
import org.apache.ibatis.annotations.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


/**
 * @author lutong
 * @date 4/4/2019 - 8:57 AM
 */

@Controller
public class FoodsController {

    @Autowired
    FoodsService foodsService;
    Logger logger= (Logger) LoggerFactory.getLogger("FoodsController.class");

    //獲取所有的商品
    @ResponseBody
    @RequestMapping("allFoods")
    public List<Foods> getAllFoods(User user){

        return  foodsService.getAllFoods();
    }





    //增加商品  三表增加  foods foodsOthers  foodsOrder
    @ResponseBody
    @RequestMapping("insertFoods")
    public int insertFoods(Foods foods,User user){
        return     foodsService.insert(foods,user);
    }



}
