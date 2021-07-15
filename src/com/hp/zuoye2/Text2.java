package com.hp.zuoye2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Text2 {
//    public static void main(String[] args) {
//        Date date=new Date();
//        String partten="yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        String a = sdf.format(date);
//        System.out.println("a = " + a);
//
//    }

    public static void main(String[] args) {
        Date date = new Date();
        String partten = "yyyy-MM-dd HH :mm:ss";
        SimpleDateFormat aa = new SimpleDateFormat(partten);
        String  a= aa.format(date);
        System.out.println("a = " + a);
    }

}
