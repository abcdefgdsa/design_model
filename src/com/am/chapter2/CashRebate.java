package com.am.chapter2;

public class CashRebate extends CashSuper {

    private Double rate = 0D;

    public CashRebate(Double rate) {
        this.rate = rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public Double acceptCash(Double money) {
        return money * rate;
    }
}
