package com.lutong.ershow.utils;

import java.util.ArrayList;

/**
 * @author lutong
 * @date 4/27/2019 - 6:27 PM
 */
public class TableFormat {
    private String y;
    private Integer a;
    private Integer b;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }


    public static ArrayList<TableFormat> tranToTableFormat(ArrayList<TimeFormat> timeFormats){
        ArrayList<TableFormat> result=new ArrayList<TableFormat>();
        for(int i=0;i<timeFormats.size();i++){
            TableFormat tableFormat=new TableFormat();
            tableFormat.setY(timeFormats.get(i).getMonth().toString()+"月 "+timeFormats.get(i).getDay().toString()+"日");
            tableFormat.setA(timeFormats.get(i).getPidTimes());
            tableFormat.setB(timeFormats.get(i).getSellTimes());
            result.add(tableFormat);
        }
        return  result;
    }


    @Override
    public String toString() {
        return "TableFormat{" +
                "y='" + y + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
