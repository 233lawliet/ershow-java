package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Pid;
import org.springframework.stereotype.Repository;

@Repository
public interface PidMapper {
    int insert(Pid record);

}