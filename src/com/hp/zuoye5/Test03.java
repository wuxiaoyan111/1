package com.hp.zuoye5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}
//通过Thread来重写run()方法
class MyThread extends  Thread{
    //修改日期格式
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //重写run方法
    public void  run(){
        while (true){
            Date date = new Date();
            //格式化
            String str = simpleDateFormat.format(date);
            System.out.println(str);
            try {
                //每隔一秒输出一次
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
