package com.jnh.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

//这是单行注释
public class Customer {

    private static FileInputStream fis;

    public Customer() {
    }



    public static final int number = 0;
    public int a = 1;
    public static void main(String[] args){
          System.out.println("Hello World！");


        StringBuilder db = new StringBuilder();

        ArrayList list1 = new ArrayList();
        list1.add(3,"3");

    }
    /*
    * 多行注释
    *
    * */
    public void method(){

    }

    public int getA() {
        return a;

    }

    public void setA(int a) {
        this.a = a;
    }

    public static int getNumber() {
        return number;
    }

    public   static void  file(){
        try {
            fis = new FileInputStream("hello.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }





}
