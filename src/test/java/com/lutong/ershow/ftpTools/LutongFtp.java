package com.lutong.ershow.ftpTools;


import org.apache.commons.net.ftp.FTPClient;


import java.io.*;
import java.net.SocketException;

/**
 * @author lutong
 * @date 4/17/2019 - 9:34 AM
 */
public class LutongFtp {


    public static void main(String[] args) {
            String ftpHost = "maoerfei.cn";
            String ftpUserName = "vsftpuser";
            String ftpPassword = "123456";
            int ftpPort = 21;
            String ftpPath = "ershow";
            String localPath = "F:\\11.txt";
            String fileName = "11.txt";

            //上传一个文件
            try{
                FileInputStream in=new FileInputStream(new File(localPath));
                boolean test = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, fileName,in);
                System.out.println(test);
            } catch (FileNotFoundException e){
                e.printStackTrace();
                System.out.println(e);
            }

            //在FTP服务器上生成一个文件，并将一个字符串写入到该文件中

            /*try {
                InputStream input = new ByteArrayInputStream("test ftp jyf".getBytes("GBK"));
                boolean flag = FtpUtil.uploadFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, fileName,input);;
                System.out.println(flag);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }*/

            //下载一个文件
            //FtpUtil.downloadFtpFile(ftpHost, ftpUserName, ftpPassword, ftpPort, ftpPath, localPath, fileName);
        }



}
