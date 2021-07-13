package com.hp.stringclass;

public class StringDemo01 {

    public static void main(String[] args) {
          String s1 = "abc";
          String s2="abc";
        System.out.println(s1==s2);//true
        //原因：以上为什么会是true？ 因为s2重用了s1的对象
            s1=s1+"!";
        System.out.println(s1==s2);//false
        //原因：以上为什么是false 因为1 根本不相等  2）深层的原因，是对象被修改了
        String s3 = "a"+"bc";
        System.out.println(s2==s3);//true
        //原因  字符串的链接  就等于没连接
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4==s2); //false
        //原因：s2是常量池中的 字符串  ， 而 newStirng 是类 勒种哟自己的地址

        System.out.println(s4);
        System.out.println(s4==s5);//false
        //原因：s4 和 s5 是不同的对象
        System.out.println(s5);//true
        System.out.println(s2);//true
                       //比较的是内存地址 比较的是2者知否相同



    }
}
