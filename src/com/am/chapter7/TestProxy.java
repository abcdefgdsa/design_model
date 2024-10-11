package com.am.chapter7;

public class TestProxy {
    public static void main(String[] args) {
        Proxy me = new Proxy(new SchoolGirl("baobao", 18));
        me.sendDrink();
        me.sendFlower();
        me.sendSmell();
    }
}
