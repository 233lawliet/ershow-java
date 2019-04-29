package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Collect;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CollectMapper {
    int insert(Collect record);


    List<Collect> getCollect(Long userid);

    Integer deleteCollect(Collect collect);
}