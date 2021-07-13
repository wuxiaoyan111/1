package com.hp.stringclass;
//sb 对性能的影响
public class StringBuilderDemo02 {
    public static void main(String[] args) {
          String str = "a";
          StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i <50 ; i++) {
              sb.append(str);
            System.out.println("sb = " + sb);
        }
    }
}
