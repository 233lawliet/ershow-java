package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.Pid;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PidMapper {
    int insert(Pid record);

    //获取所有的pid
    List<Pid> getPids(Pid pid);
}