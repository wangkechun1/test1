package com.besttest.task.day01;

import org.testng.annotations.Test;

import java.math.BigDecimal;

public class BigDecimalTest {

    //加运算，输入都为String类型数值
    public BigDecimal add(Object s1,Object s2){
        BigDecimal sum=null;
        try {
            BigDecimal num1 = new BigDecimal(String.valueOf(s1));
            BigDecimal num2 = new BigDecimal(String.valueOf(s2));
            sum = num1.add(num2);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("输入字符串有误");
        }
        return sum;
    }
    //减运算
    public BigDecimal delete(Object a,Object b){
        BigDecimal sum = null;
        try {
            BigDecimal num1 = new BigDecimal(String.valueOf(a));
            BigDecimal num2 = new BigDecimal(String.valueOf(b));
            sum = num1.subtract(num2);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("输入数值有误");
        }
        return sum;
    }
    //乘法运算multipy()
    public BigDecimal multipy(Object a,Object b){
        BigDecimal sum = null;
        try {
            BigDecimal num1 = new BigDecimal(String.valueOf(a));
            BigDecimal num2 = new BigDecimal(String.valueOf(b));
            sum = num1.multiply(num2);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("输入数值有误");
        }
        return sum;
    }
    //除法运算divide()
    public BigDecimal divide(Object a,Object b){
        BigDecimal sum = null;
        try {
            BigDecimal num1 = new BigDecimal(String.valueOf(a));
            BigDecimal num2 = new BigDecimal(String.valueOf(b));
            sum = num1.divide(num2);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("输入数值有误");
        }
        return sum;
    }


    public static void main(String[] args) {
        BigDecimalTest bigDecimal = new BigDecimalTest();
        BigDecimal result1 = bigDecimal.add(new BigDecimal("400000000000.0909"),new BigDecimal("909909988899.00"));
        System.out.println(result1);
        result1 = bigDecimal.add(4000.099898,1009494.389283444);
        System.out.println(result1);
        result1 =  bigDecimal.add("333334444.33333","0990993039.999999999");
        System.out.println(result1);
        Integer.valueOf(1);
    }
    //减法测试
    @Test
    public void deleteTest(){
        BigDecimalTest bigDecimalTest = new BigDecimalTest();
        BigDecimal result1 = bigDecimalTest.delete(999999999.0000,090900.09090099);
        BigDecimal result2 = bigDecimalTest.delete("99989.99888777","76766666.99");
        BigDecimal result3 = bigDecimalTest.delete("989988.878",900000.00);
        System.out.println("result1:"+result1+"  result2:"+result2+"  result3"+result3);
    }
    //乘法测试
    @Test
    public void multipyTest(){
        BigDecimalTest bigDecimalTest = new BigDecimalTest();
        BigDecimal result1 = bigDecimalTest.multipy(999999999.0000,090900.09090099);
        BigDecimal result2 = bigDecimalTest.multipy("99989.99888777","76766666.99");
        BigDecimal result3 = bigDecimalTest.multipy("989988.878",900000.00);
        BigDecimal result4 = bigDecimalTest.multipy("99988889",990900.90);
        BigDecimal result5 = bigDecimalTest.multipy("adb","888");
        System.out.println("result1:"+result1+"  result2:"+result2+"  result3:"+result3
        +"  result4:"+result4+"   result5:"+result5);
        System.out.println(new BigDecimal("123").abs());
    }
    @Test
    public void test2(){
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i2 == i1);//结果：false

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);//结果：true
    }
}