package com.lutong.ershow.controller;

import com.lutong.ershow.bean.Type;
import com.lutong.ershow.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lutong
 * @date 4/9/2019 - 9:11 AM
 */
@Controller
public class TypeController {

    @Autowired
    TypeService typeService;


    @ResponseBody
    @RequestMapping("getTypes")
    public List<Type> getTypes(){
        return typeService.getTypes();
    }
}
