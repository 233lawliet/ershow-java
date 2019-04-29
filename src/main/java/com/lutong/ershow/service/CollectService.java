package com.lutong.ershow.service;

import com.lutong.ershow.bean.Collect;
import com.lutong.ershow.mapper.CollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lutong
 * @date 4/24/2019 - 10:14 AM
 */

@Service
public class CollectService   {


    @Autowired
    CollectMapper collectMapper;


    public Integer insert(Collect record) {
        return collectMapper.insert(record);
    }

    public List<Collect> getCollect(Long userid) {
        return collectMapper.getCollect(userid);
    }

    public Integer deleteCollect(Collect collect) {
        return collectMapper.deleteCollect(collect);
    }
}
