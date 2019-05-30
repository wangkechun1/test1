package com.besttest.task.day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearch {

    /**
     *
     * @param arr :有序数组
     * @param value：查找值
     * @return：查找值的索引，若不存在，返回-1
     */
    public static int getIndex(int[] arr,int value){
        //定义最小索引
        int min = 0;
        //定义最大索引
        int max = arr.length-1;
        //定义中间索引
        int mid = (max + min)/2 ;
        //中间值！= 要查找的值，循环查找
        while(arr[mid] != value) {
            //判断中间值<要查找的值，最小索引改变
            if (arr[mid] < value){
                min++;
            }
            //判断中间值>要查找的值，最大索引改变
            if (arr[mid] > value){
                max--;
            }
            //无论是否比中间值大，中间索引改变
            mid = (max + min) / 2;
            //如果最小索引>最大索引，则返回-1
            if (min > max){
                return -1;
            }
        }
        return mid;
    }

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }

        }
        return arr;
    }
    @Test
    public void test1(){
        int[] arr = {33,22,11,44,3,7,4};
        arr = bubbleSort(arr);
        int index = getIndex(arr,11);
        System.out.println(index);
        Assert.assertEquals(index,3);
    }
    @Test
    public void test2(){
        int[] arr = {33,22,11,44,3,7,4};
        arr = bubbleSort(arr);
        int index = getIndex(arr,55);
        System.out.println(index);
        Assert.assertEquals(index,-1);
    }
    @Test
    public void test3(){
        int[] arr = {33,22,11,44,3,7,4};
        arr = bubbleSort(arr);
        int index = getIndex(arr,3);
        System.out.println(index);
        Assert.assertEquals(index,0);
    }
}