package com.besttest.task.day01;

import org.testng.annotations.Test;

public class LTrimTest {
    //去掉左空格
    public static String lTrim(){
        String s = "     ddabc   ";
        char[] strs =s.toCharArray();
        int index = 0;
        while (index<s.length()&& strs[index] <= ' '){
            index++;
        }
        String result = index>0?s.substring(index):s;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String result = lTrim();
        System.out.println(result);
    }

    @Test
    public void test2(){
        String s1= "abcdef";
        System.out.println(s1.substring(0,2));
        s1.trim();
    }
}