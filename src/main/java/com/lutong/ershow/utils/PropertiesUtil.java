package com.lutong.ershow.utils;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;

import java.util.Properties;

/**
 * @author lutong
 * @date 4/18/2019 - 8:35 PM
 */
public class PropertiesUtil {
    public static Object getProiperty(String key){
        YamlPropertiesFactoryBean  yamlPropertiesFactoryBean=new YamlPropertiesFactoryBean();
        yamlPropertiesFactoryBean.setResources(new ClassPathResource("application.yml"));
        Properties properties = yamlPropertiesFactoryBean.getObject();
        return  properties.get(key);
    }
}
