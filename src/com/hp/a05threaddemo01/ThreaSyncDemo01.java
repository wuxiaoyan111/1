package com.hp.a05threaddemo01;
//多个线程同时操作一个资源诞生 安全问题
//多个 巡航护抢票
public class ThreaSyncDemo01 {
    public static void main(String[] args) {
Tickets tickets = new Tickets();
Thread t1 =new Thread(){
    public  void run(){
        while (true){
            int ticket = tickets.getTicket();
            Thread.yield();
            System.out.println("线程拿了"+ticket);


        }

    }

};
     Thread t2 =new Thread(){
        public  void run(){
            while (true){
                int ticket = tickets.getTicket();
                Thread.yield();
                System.out.println("线程拿了"+ticket);


            }

        }

    };
     t1.start();t2.start();
    }
}
class Tickets{
    private int ticket=3;

    public int getTicket(){
        if (ticket==0){

            System.out.println("没票了");

            throw  new RuntimeException("票没了亲");
        }
//  Thread.yield();//线程的让一让
        return ticket--;
    }
}