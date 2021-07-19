package com.hp.a05threaddemo01;
//创建线程的第二种方式，继承 用实现
public class ThreadDemo02 {
    public static void main(String[] args) {
        Runnable xicai = new xicai();
        Runnable shaoshui = new shaoshui();

        Thread xicaiThread = new Thread(xicai);
        Thread shaoshuiThread = new Thread(shaoshui);

        xicaiThread.start();
        shaoshuiThread.start();
    }

}
class xicai implements  Runnable{
      public void  run(){
          for (int i = 0; i <1000 ; i++) {
              System.out.println("洗了菜"+i);
          }

      }


}
class shaoshui implements  Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("烧水" + i);
        }

    }

}
