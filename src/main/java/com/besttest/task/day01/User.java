package com.besttest.task.day01;

public class User {
    private String name;
    public int age;
    public static String address;
    public User(){
    }
    public User(String name){
        this.name = name;
    }
    public User(String name,int age,String address){
        this.name = name;
        this.age = age;
        User.address = address;
    }
    public String getString(){
        return ("name:"+this.name+"age:"+this.age+"address:"+User.address);
    }
    public static void getAge(int age){
        int age1 = age+100;
    }

    public static void main(String[] args) {
        User user = new User("wangkc",18,"China");
        User.getAge(15);
        String result = user.getString();
        System.out.println(result);
        System.out.println(user.age);
    }
}