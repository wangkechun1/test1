package com.besttest.task.day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EndWithIgnoreCase {
    public static boolean endWithIgnoreCase(String str,String prefix){

        return StartWithIgnoreCase.startWithIgnoreCase(str,prefix,str.length()-prefix.length());
    }
    @Test
    public void test1(){
        String s = "abcdefg";
        String prefix = "efg";
        boolean result = endWithIgnoreCase(s,prefix);
        System.out.println(result);
        Assert.assertEquals(result,true);
    }
    @Test
    public void test2(){
        String s = "abcdefg";
        String prefix = "cefg";
        boolean result = endWithIgnoreCase(s,prefix);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
    @Test
    public void test3(){
        String s = "abcdefg";
        String prefix = "efg_";
        boolean result = endWithIgnoreCase(s,prefix);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
}