package com.atguigu.java;

import com.atguigu.bean.Student;

import java.util.ArrayList;

public class testTemplate {

    //5.prsf
    private static final Student stu = new Student();
    //psf psfi psfs
    public static final int NUM=1;
    public static final String Str="nihao";
    
    /**
     *自定义pric
     */
    private int asd  = 1;

    //1.psvm
    public static void main(String[] args) {
        //2.sout
        System.out.println("hello!");
        //soutp soutm soutv xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("testTemplate.main");
        int num = 10;
        System.out.println("num = " + num);
        int num2 = 20;
        System.out.println(num2);

       int[] arr = new int[]{1,2,3};
        //3.fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i);
        }
        //iter itar list.fori list.forr
        for (int i : arr) {
            System.out.println(i);
        }

        ArrayList list = new ArrayList();
        list.add(120);
        list.add(321);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //4.ifn
        if (list == null) {
            System.out.println("null");
        }
        //inn list.not list.nn
        if (list != null) {
            System.out.println("is null");
        }



    }

    public void method(){

    }
}
