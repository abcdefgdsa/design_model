package com.am.chapter6;

public class DecorateTest {
    public static void main(String[] args) {
        Person person = new Person("小帅");
        HeatCloth heatCloth = new HeatCloth();
        TshirtCloth tshirtCloth = new TshirtCloth();
        BullCloth bullCloth = new BullCloth();

        heatCloth.setPerson(person);
        tshirtCloth.setPerson(heatCloth);
        bullCloth.setPerson(tshirtCloth);
        bullCloth.show();
    }
}
