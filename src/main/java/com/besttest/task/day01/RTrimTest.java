package com.besttest.task.day01;

public class RTrimTest {
    /*
    删除右空格
     */
    public static String rTrim(String s){
        char[] val = s.toCharArray();
        int len = s.length();
        int index = 0;
        while (len>0 && val[len-1]<=' '){
            len--;
        }
        String result = len<s.length()?s.substring(0,len):s;
        return result;
    }

    public static void main(String[] args) {
        String s = "    abcdef    ";
        String result = rTrim(s);
        System.out.println(result);
    }
}