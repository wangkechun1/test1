package com.besttest.task.day01;

public class BubbleSort {
    /**
     * 冒泡排序
     * @param args
     */
    public static void main(String[] args) {
        int[] li = {2,4,2,1,44,22,11};
        for (int i = 0; i < li.length-1; i++) {
            for (int j = 0; j < li.length-i-1; j++) {
                if (li[j]> li[j+1]){
                    int temp = li[j];
                    li[j] = li[j+1];
                    li[j+1] = temp;
                }
            }
        }
        for (int i:li) {
            System.out.println(i);
        }
    }
}