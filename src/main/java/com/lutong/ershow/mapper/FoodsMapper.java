package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Foods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodsMapper {

    //插入商品
    int insert(Foods record);
    //获取所有的商品
    List<Foods> getAllFoods();

    Foods getFoodsById(int id);

    //获取所有的商品
    List<Foods> getFoodsByName(String name);

}