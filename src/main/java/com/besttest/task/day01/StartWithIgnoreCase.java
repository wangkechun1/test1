package com.besttest.task.day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StartWithIgnoreCase {
    public static boolean startWithIgnoreCase(String str,String prefix,int toffset){

        String s = str;
        //原始字符串转为char数组
        char[] ta = s.toCharArray();
        //原始字符串长度
        int length_ta = s.length();
        //搜索字符串转为char数组
        String pf = prefix;
        char[] pa = pf.toCharArray();
        //搜索字符串长度
        int length_pa = pf.length();
        int index = 0;
        int to = toffset;
        //判断toffset如果为负值或者初始查找位置+查找字符串长度之和超出原始字符串长度直接返回false
        if (toffset < 0 || toffset > length_ta - length_pa){
            return false;
        }
        //挨个字符判断是否相等
        while (--length_pa >= 0){
            if (!String.valueOf(ta[to++]).equalsIgnoreCase(String.valueOf(pa[index++]))){
                return false;
            }
        }
        return true;
    }
    public static boolean startWithIgnoreCase(String str,String prefix){
        return startWithIgnoreCase(str,prefix,0);
    }
    @Test
    public void test1(){
        String s = "abcdef";
        String prefix = "Abf";
        boolean result = startWithIgnoreCase(s,prefix,0);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
    @Test
    public void test2(){
        String s = "abcdef";
        String prefix = "abc";
        boolean result = startWithIgnoreCase(s,prefix,1);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
    @Test
    public void test3(){
        String s = "abcdef";
        String prefix = "abce";
        boolean result = startWithIgnoreCase(s,prefix);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
    @Test
    public void test4(){
        String s = "abcdef";
        String prefix = "abc";
        boolean result = startWithIgnoreCase(s,prefix);
        System.out.println(result);
        Assert.assertEquals(result,true);
    }

}