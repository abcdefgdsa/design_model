package com.am.chapter7;

public class Proxy {
    private SchoolGirl mm;

    public Proxy(SchoolGirl mm) {
        this.mm = mm;
    }

    public void sendFlower() {
        System.out.println("给" + mm.getName() + "送花");
    }

    public void sendDrink() {
        System.out.println("给" + mm.getName() + "送奶茶");
    }

    public void sendSmell() {
        System.out.println("给" + mm.getName() + "送香水");
    }
}
