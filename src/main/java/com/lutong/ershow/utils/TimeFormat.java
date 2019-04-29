package com.lutong.ershow.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author lutong
 * @date 4/27/2019 - 5:07 PM
 */
public class TimeFormat {
    private Integer year;
    private Integer month;
    private Integer day;


    private Integer pidTimes;
    private Integer sellTimes;

    public Integer getPidTimes() {
        return pidTimes;
    }

    public void setPidTimes(Integer pidTimes) {
        this.pidTimes = pidTimes;
    }

    public Integer getSellTimes() {
        return sellTimes;
    }

    public void setSellTimes(Integer sellTimes) {
        this.sellTimes = sellTimes;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "TimeFormat{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", pidTimes=" + pidTimes +
                ", sellTimes=" + sellTimes +
                '}';
    }


    public static  ArrayList<TimeFormat>  getFormat() {
        ArrayList<TimeFormat> result = new ArrayList<TimeFormat>();
        for (int i = 0; i < 7; i++) {
            String format = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            Date date = new Date(new Date().getTime() - i * 24 * 60 * 60 * 1000);


            TimeFormat temp = new TimeFormat();
            temp.setYear(Integer.parseInt(simpleDateFormat.format(date).substring(0, 4)));
            temp.setMonth(Integer.parseInt(simpleDateFormat.format(date).substring(5, 7)));
            temp.setDay(Integer.parseInt(simpleDateFormat.format(date).substring(8, 10)));
            temp.setPidTimes(0);
            temp.setSellTimes(0);
            result.add(temp);
        }
        return result;
    }
}
