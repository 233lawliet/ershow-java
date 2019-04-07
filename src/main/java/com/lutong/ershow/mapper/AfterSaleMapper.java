package com.lutong.ershow.mapper;

import com.lutong.ershow.bean.AfterSale;
import org.springframework.stereotype.Repository;

@Repository
public interface AfterSaleMapper {
    int insert(AfterSale record);

    int insertSelective(AfterSale record);
}