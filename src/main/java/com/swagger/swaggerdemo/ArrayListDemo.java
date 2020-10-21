package com.swagger.swaggerdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main (String [] s){

        List<String>  list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list.size());
    }
}
