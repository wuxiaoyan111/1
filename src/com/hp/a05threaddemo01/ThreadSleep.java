package com.hp.a05threaddemo01;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <30 ; i++) {
            Thread.sleep(2);

            System.out.println("访问中国电信"+i+"次");
            
        }
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println("name = " + name);
        Long id = thread.getId();//线程的唯一id
        System.out.println("id = " + id);
        boolean daemon = thread.isDaemon();//是否是守护线程
        System.out.println("daemon = " + daemon);
        int priority = thread.getPriority();

        System.out.println("priority = " + priority);
        boolean alive = thread.isAlive();//线程死了吗
        System.out.println("alive = " + alive);
        
        
    }
    
    
}
