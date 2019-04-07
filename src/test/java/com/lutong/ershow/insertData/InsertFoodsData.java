package com.lutong.ershow.insertData;

import com.lutong.ershow.bean.Foods;
import com.lutong.ershow.controller.FoodsController;
import com.lutong.ershow.mapper.FoodsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Scanner;

/**
 * @author lutong
 * @date 4/4/2019 - 5:10 PM
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertFoodsData {

    @Autowired
    FoodsMapper foodsMapper;

    @Test
    public void  Test(){


            Foods foods =new Foods();

            foods.setFoodsname("笔记本");
            foods.setFoodsinfo("这是一本十分厚重的笔记本");
            foods.setStartprice(5000.23);
            foods.setHours(20);
            foods.setPlace("11教");
            foods.setTypeid(1);
            foods.setStarttime(new Date());

            foodsMapper.insert(foods);


    }
}
