package com.hp.a05threaddemo01;
//线程创建的最好用 的 匿名内部类
//线程创建的方式3
public class ThreadDemo03 {
    public static void main(String[] args) {
        new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("洗了菜" + i);
                }
            }


        }.start();
        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    System.out.println("烧水=" + i);
                }
            }



        }.start();
    }

 //测试自己的电脑能开多少个线程？
}
