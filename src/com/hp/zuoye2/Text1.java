package com.hp.zuoye2;

import java.util.Date;

public class Text1 {
//    public static void main(String[] args) {
//        Date data = new Date();
//        System.out.println("data = " + data);
//        long time = data.getTime();
//        time=time+1000*60*60*24*3L;
//        data.setTime(time);
//        System.out.println("date = " + data);


    public static void main(String[] args) {
        Date  data = new Date();
        System.out.println("data = " + data);
           Long time = data.getTime();
           time = time+1000*60*60*24*3L;
           data.setTime(time);
        System.out.println("time = " + time);
    }

    }


