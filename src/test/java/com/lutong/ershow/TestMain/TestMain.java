package com.lutong.ershow.TestMain;

import com.lutong.ershow.bean.Foods;
import com.lutong.ershow.utils.PropertiesUtil;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;

/**
 * @author lutong
 * @date 4/4/2019 - 9:29 PM
 */
public class TestMain {


    public static void main(String[] args) throws FileNotFoundException {
        //上传
        String username= (String) PropertiesUtil.getProiperty("ftp.usernmae");
        String password= (String)PropertiesUtil.getProiperty("ftp.password");
        String address= (String) PropertiesUtil.getProiperty("ftp.address");
        Integer port = (Integer) PropertiesUtil.getProiperty("ftp.port");
        String path = (String) PropertiesUtil.getProiperty("ftp.path");


        System.out.println(ClassUtils.getDefaultClassLoader().getResource("").getPath());

    }
}
