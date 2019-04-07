package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Type;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeMapper {
    int insert(Type record);

    int insertSelective(Type record);
}