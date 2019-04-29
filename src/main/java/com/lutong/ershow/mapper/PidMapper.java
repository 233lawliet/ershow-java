package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Pid;
import com.lutong.ershow.utils.TimeFormat;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface PidMapper {
    int insert(Pid record);

    //获取所有的pid
    List<Pid> getPids(Pid pid);
    List<Pid> getPidsByBuyer(Integer buyerId);



    Integer getCountByDay(TimeFormat timeFormat);
    Integer getOrderTimes(TimeFormat timeFormat);


    //排行榜   用户

    List<HashMap<String,Object>> getPidTimesThree();
    List<HashMap<String,Object>> getPidPricesThree();
    List<HashMap<String,Object>> getOrderPriceThree();
    List<HashMap<String,Object>> getCommentsThree();


    //排行榜  商品

    List<HashMap<String,Object>> getPidThree();
    List<HashMap<String,Object>> getPidTimeThree();



}