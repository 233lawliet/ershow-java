package com.lutong.ershow.controller;

import ch.qos.logback.classic.gaffer.PropertyUtil;
import com.lutong.ershow.utils.FtpUtil;
import com.lutong.ershow.utils.PropertiesUtil;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/**
 * 商品信息页面跳转控制类
 * @author a柴大队长
 * @createtime 2017年8月20日10:34:55
 */
@Controller
public class ImageUploadController {

    private Logger logger =Logger.getLogger("ImageUploadController.class");

    /**
     * @createtime 2017年8月20日17:15:41
     * @param request
     * @param file
     * @return 上传成功返回“success”，上传失败返回“error”
     * @throws IOException
     */




    @ResponseBody
    @RequestMapping("upload")
    public String upload(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        request.setCharacterEncoding("UTF-8");
        logger.info("执行图片上传");
        if(!file.isEmpty()) {

            logger.info("成功获取照片");
            String fileName = file.getOriginalFilename();
            String type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            logger.info("图片初始名称为：" + fileName + " 类型为：" + type);
            if (type != null) {
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径



                    /*//上传
                    String username= (String) PropertiesUtil.getProiperty("ftp.usernmae");
                    String password= (String)PropertiesUtil.getProiperty("ftp.password");
                    String address= (String) PropertiesUtil.getProiperty("ftp.address");
                    Integer port = (Integer) PropertiesUtil.getProiperty("ftp.port");
                    String path = (String) PropertiesUtil.getProiperty("ftp.path");*/

                    String username= "vsftpuser";
                    String password= "123456";
                    String address= "maoerfei.cn";
                    Integer port = 21;
                    String path = "ershow";

                    System.out.println(password);

                    InputStream in=file.getInputStream();
                    boolean test = FtpUtil.uploadFile(address, username, password, port, path, fileName,in);
                    System.out.println(test);

                    logger.info("文件成功上传到指定目录下");
                    return fileName;
                }else {
                    logger.info("不是我们想要的文件类型,请按要求重新上传");
                    return "error";
                }
            }else {
                logger.info("文件类型为空");
                return "error";
            }
        }else {
            logger.info("没有找到相对应的文件");
            return "error";
        }

    }
}