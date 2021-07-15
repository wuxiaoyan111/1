package com.hp.dataandcollection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   企业开发中（Java，bigdata ） 日期
 * 日期类的层是 有一个long值 学名UTC时间
 *1970年1月1日00:00:00 年开始 计算时间元年
 *
 * 日期类 有两个包  SQL/util，我们用util包下的日期
 * */
public class DataDemo01 {
    public static void main(String[] args) {


        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);  //data为什么会输出Wed Jul 14 09:47:46 CST 2021
    //原因  tostring()被改写 。。。 可以重新 改为我没自己的时间 
        Long time = date.getTime();
        System.out.println("time = " + time);//1626227366960（等于2021-07-14）
      //  date.setTime(31626227366960L);
        //System.out.println("date = " + date);
     //练习题:查看10天之后是哪一天
          time += 1000*60*60*24*10L;
                 date.setTime(time);
        System.out.println("date = " + date);
        //修改日期显示的格式
        String pattern ="yyyy-MM-dd HH:mm:ss";
        String pattern1 ="yyyy-MM-dd HH:mm:ss";
        String pattern2 ="yyyy-MM-dd";


       SimpleDateFormat sdf = new SimpleDateFormat(pattern2);
       String chinaDatestr = sdf.format(date);
        System.out.println("chinaDatestr = " + chinaDatestr);
       //字符串转日期
        String dataStr ="2018-09-12 23:13:45";
        try {
            Date  parse =  sdf.parse(dataStr);
            System.out.println("parse = " + parse);
        } catch (ParseException e) {
            System.out.println("你的日期字符串可能不是一个日期，你用心填写一下");
            e.printStackTrace();
        }


    }    


}
