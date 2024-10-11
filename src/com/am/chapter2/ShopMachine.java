package com.am.chapter2;

import java.math.BigDecimal;
import java.util.List;

public class ShopMachine {
    private Double total = 0D;

    private static final List<String> conpon = List.of("正常收费", "打八折", "打七折", "打五折");

    public void inputGood(BigDecimal singlePrice, Integer number, Integer conponType) {
        double price = 0;
        switch (conponType) {
            case 0:
                price = singlePrice.multiply(BigDecimal.valueOf(number)).doubleValue();
                break;
            case 1:
                price = singlePrice.multiply(BigDecimal.valueOf(number)).doubleValue() * 0.8;
            case 2:
                price = singlePrice.multiply(BigDecimal.valueOf(number)).doubleValue() * 0.7;
            case 3:
                price = singlePrice.multiply(BigDecimal.valueOf(number)).doubleValue() * 0.5;
        }

        total = total + price;
    }
}
