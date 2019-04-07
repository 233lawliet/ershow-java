package com.lutong.ershow.service;


import com.lutong.ershow.bean.FoodsOthers;
import com.lutong.ershow.mapper.FoodsOthersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lutong
 * @date 4/4/2019 - 10:00 PM
 */
@Service
public class FoodsOthersService  {
    @Autowired
    FoodsOthersMapper foodsOthersMapper;

    public int insert(FoodsOthers record) {
       return foodsOthersMapper.insert(record);
    }

    public int insertSelective(FoodsOthers record) {
        return foodsOthersMapper.insertSelective(record);
    }


    //根据id(foodsOthers只用了id)获取指定的foodsOther
    public FoodsOthers getFoodsOthers(FoodsOthers foodsOthers){
        return  foodsOthersMapper.getFoodsOthers(foodsOthers);
    }

    //增加观看次数
    public int addViews(FoodsOthers foodsOthers){

        //由传递过来的foodsOthers(id)获取数据库中的foodsOthers
        FoodsOthers  result=foodsOthersMapper.getFoodsOthers(foodsOthers);
        result.setViews(result.getViews()+1);
        return foodsOthersMapper.addViews(result);
    }
    //增加竞价次数
    public int addPids(FoodsOthers foodsOthers){
        FoodsOthers  result=foodsOthersMapper.getFoodsOthers(foodsOthers);
        result.setPids(result.getPids()+1);
        return foodsOthersMapper.addPids(result);
    }
    //增加楼高次数
    public int addComments(FoodsOthers foodsOthers){
        FoodsOthers  result=foodsOthersMapper.getFoodsOthers(foodsOthers);
        result.setComments(result.getComments()+1);
        return foodsOthersMapper.addComments(result);
    }
}
