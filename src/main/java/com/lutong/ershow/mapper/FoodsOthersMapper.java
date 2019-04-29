package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.FoodsOthers;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodsOthersMapper {
    int insert(FoodsOthers record);

    int insertSelective(FoodsOthers record);

    //增加评论，观看，竞价的次数
    int addComments(FoodsOthers foodsOthers);
    int addPids(FoodsOthers foodsOthers);
    int addViews(FoodsOthers foodsOthers);

    //根据id获取foodsOthers
    public FoodsOthers getFoodsOthers(FoodsOthers foodsOthers);



    //获取所有的view, comments,pids

    public Integer getSumViews();
    public Integer getSumComments();
    public Integer getSumPids();
}