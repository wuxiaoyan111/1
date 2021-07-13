package com.hp.stringclass;

public class StringBuilderDemo01 {
    /**
     * StringBuilder(线程不安全，速度很快）StringBuffer(线程安全，速度稍微慢) 解决 字符串频繁修改问题
     * 意思是把String升级了
     * String 类 重点 重用性
     * StringBuilder/Buffer  倾向于  对字符串的修改
     * 当用到字符大量  追加、修改、删除的时候 就是用StringBuilder/Buffer
     * Stringuffer 的优点 ：内部有个 可变的字符数组，速度快 内部消耗小
     * 在公司实际开发汇总，字符串的增删改 要用StringBuilder， StringBuffer
     */
    public static void main(String[] args) {
        String str = "好好学习";
        StringBuilder sb = new StringBuilder(str);
          //追加
        sb.append(",为了一份优质工作");
        System.out.println("sb = " + sb);
        //2.修改  好好学习 改为  改变世界
             sb.replace(10,19,"为了改变世界");
        System.out.println("sb = " + sb);
         //3.删除
        sb.deleteCharAt(3);//删除指定的字符 
        System.out.println("sb = " + sb);
        //3.1 删除字符的区间  很常用，比如说www.goods.baidu.com
          sb.delete(2,5);
        System.out.println("sb = " + sb);
        //3.2删除全部
        sb.delete(0,sb.length());
        System.out.println("sb = " + sb);
     //4.插入 增加
       sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //反转
       sb.reverse();
        System.out.println(sb);
    }


}
