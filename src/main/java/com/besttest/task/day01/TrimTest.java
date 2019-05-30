package com.besttest.task.day01;

public class TrimTest {
    /*
    第一个参数为指定的左右两侧要干掉的字符，
    第二个参数为字符串
     */
    public static String trimTest(String character,String str){
        int len = str.length();
        int st = 0;
        char[] val = str.toCharArray();
        while (st < len && character.charAt(0)==val[st]){
            st++;
        }
        while (st < len && character.charAt(0)==val[len-1]){
            len--;
        }
        String result = (st>0 || len < str.length())?str.substring(st,len):str;
        return result;
    }

    public static void main(String[] args) {
        String index = "*";
        String str = "***abcdef**";
        String result = trimTest(index,str);
        System.out.println(result);
    }
}