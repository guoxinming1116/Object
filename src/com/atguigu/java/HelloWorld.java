package com.atguigu.java;

import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("helloworld!!");

        newList();

        Date date = new Date();



    }

    public static void newList() {
        ArrayList list1 = new ArrayList();
        list1.add(1, "李四");
    }
}
