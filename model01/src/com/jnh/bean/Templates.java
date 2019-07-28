package com.jnh.bean;

import java.util.ArrayList;

/**
 * @author jnh
 * @date 2019/7/27 - 17:00
 */
public class Templates {
    public static void main(String[] args){
        System.out.println();
        System.out.println();
        for(int a=0;a<7;a++){
            System.out.println("123");
        }
        int a = 6;
        System.out.println("a = " + a);
        System.out.println(a);
        String[] arr = new String[]{"1","21","3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Object o : list) {
            
        }
    }
    public void method(){
        int a = 0;

    }

}
