package com.lutong.ershow.service;

import com.lutong.ershow.bean.Type;
import com.lutong.ershow.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lutong
 * @date 4/9/2019 - 8:48 AM
 */

@Service
public class TypeService  {

    @Autowired
    TypeMapper typeMapper;

    public int insert(Type record) {
        return typeMapper.insert(record);
    }

    public List<Type> getTypes() {
        return typeMapper.getTypes();
    }
}
