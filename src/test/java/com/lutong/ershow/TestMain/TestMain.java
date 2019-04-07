package com.lutong.ershow.TestMain;

import com.lutong.ershow.bean.Foods;

import java.util.Date;
import java.util.Random;

/**
 * @author lutong
 * @date 4/4/2019 - 9:29 PM
 */
public class TestMain {


    public static void main(String[] args) {
        Foods foods=new Foods();
        foods.setStarttime(new Date());
        foods.setHours(12);

        System.out.println(foods.getStarttime().compareTo(foods.getEndTime()));

    }
}
