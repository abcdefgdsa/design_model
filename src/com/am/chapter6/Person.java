package com.am.chapter6;

public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "要开始穿衣服了！");
    }
}
