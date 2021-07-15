package com.hp.zuoye3;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);


        }

        System.out.println("list = " + list);

        List<Integer> subList = list.subList(3,7);
        System.out.println("subList = " + subList);

        for (int i = 0; i < subList.size(); i++) {
            subList.set(i,subList.get(i)*10);

        }
        System.out.println("子集扩大三倍="+subList);
        System.out.println("list = " + list);

        list.subList(7,10).clear();
        System.out.println("删除7-9后的集合="+list);

    }



}
