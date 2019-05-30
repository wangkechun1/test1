package com.besttest.task.day01;

import org.testng.annotations.Test;

public class ToTitle {
    public static String toTitle(String s){
        if (Character.isUpperCase(s.charAt(0))){
            return s;
        }else {
            return (new StringBuffer()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

    @Test
    public void test1(){
        String s = "hello";
        String result = toTitle(s);
        System.out.println(result);
    }
}