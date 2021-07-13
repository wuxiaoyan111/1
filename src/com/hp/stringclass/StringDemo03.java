package com.hp.stringclass;
//string类的常用API
public class StringDemo03 {
    public static void main(String[] args) {
         
               //0 123456712345
          String str = "thinking java";//Java编程思想
               //查询10 的字符是什么
        char c = str.charAt(10);
        str.length();//注意 ： length（）是一个方法  数组的长度是属性
             int length = str.length();
        System.out.println("length = " + length);
         char[] chars = str.toCharArray();//应用点：应用在 对数
         int x = chars.length;//数组不带 原括号
        System.out.println("x = " + x);
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }
          //查找给定的字符串的位置
        //如：查找in的位置  查找出来的是第一次出现的位置
        int i = str.indexOf("in");
        System.out.println("i = " + i);
        //从指定的位置进行检索
        int i1 = str.indexOf("in",3);
        //也可以检索最后一次的位置
        System.out.println("i1 = " + i1);
        int i2 = str.lastIndexOf("in");
        System.out.println("i2 = " + i2);

        String str1 = "thinking java";//Java编程思想
        //判断是否以什么字符开头，以什么字符结尾
        boolean th = str1.startsWith("th");
        System.out.println("th = " + th);
        boolean va =   str1.endsWith("va");
        System.out.println("va = " + va);

         String str2 = "www.oracle.com";
         //String substring (int beginIndex ,int endIndex)截取字符串
        //含头 不含尾
        String substring = str2.substring(4,10);
        System.out.println("substring = " + substring);
//  一下子截取末尾
         String substring1= str2.substring(4);
        System.out.println("substring1 = " + substring1);
          String str3 = "吴 笑 研";
          String trim = str3.trim();
        System.out.println("trim = " + trim);//trim是只能删除字符串2变得空格 不能书暗处重点的
           String m = "ABC";
          String m1 =  m.toLowerCase();
        System.out.println("m1 = " + m1);
           String n = "abc";
           String n1 = n.toUpperCase();
        System.out.println("n1 = " + n1);
        System.out.println(m.equals(n));//fasle
        System.out.println(m.equalsIgnoreCase(n));//true  忽略大小写 验证码专用
        

     //吧数字转换成字符串
        int  u =110;
        String s = String.valueOf(u);
        System.out.println("s+1 = " + s+1);
             //split() 分割数组
        String nn = "wuxiaoyan.avi";
      String[] split =   nn.split("\\.");
        for (String s1 : split) {
            System.out.println("s1 = " + s1);
        }
      //练习{“username“：”tangseng” "age" :"500"}
           //数据替换

        String mm ="tmd,我爱你";// 甜蜜的
       String mmstr =  mm.replaceAll("[a-z]","甜蜜的");
        System.out.println("mmstr = " + mmstr);
        System.out.println(mm);

         //数据包含
        String mmo ="我想吴笑研";

        boolean jj = mmo.contains("wxy");
        System.out.println("jj = " + jj);//False



        //练习   写一个private方法 需要传一个string的网址参数 ，返回处理后的数据
        //假定 大数据获取了 很多网址 我想要 www ---  com之间的内容
        //有以下 几类网址



    }
    
}
