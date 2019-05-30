package com.besttest.task.day01;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class FlowerNumber {
    public static boolean flowerNumber(int num){

        int sd;
        int td;
        int hd;
        for (int i = 100; i < 1000; i++) {
            sd = num/100;
            td = (num-sd*100)/10;
            hd = num % 10;
            if (num != Math.pow(sd,3)+ Math.pow(td,3)+Math.pow(hd,3)){
                return false;
            }
        }
        return true;
    }
    @Test
    public void test1(){
        boolean result = flowerNumber(153);
        System.out.println(result);
        Assert.assertEquals(result,true);
    }
    @Test
    public void test2(){
        boolean result = flowerNumber(222);
        System.out.println(result);
        Assert.assertEquals(result,false);
    }
    @Test
    public void test3(){
        boolean result = flowerNumber(370);
        System.out.println(result);
        Assert.assertEquals(result,true);
    }
}