package com.hp.zuoye3;

import java.util.*;

/*创建一个List集合，并存放10个随机数，然后排序该集合
 * 后输出*/
public class Demo7 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            list.add(random.nextInt(30));
        }
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}