package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeMapper {
    int insert(Type record);

    List<Type> getTypes();
}