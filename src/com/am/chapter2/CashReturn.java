package com.am.chapter2;

public class CashReturn extends CashSuper {
    private Double condition = 0D;
    private Double moneyReturn = 0D;

    public CashReturn(Double condition, Double moneyReturn) {
        this.condition = condition;
        this.moneyReturn = moneyReturn;
    }

    public Double getCondition() {
        return condition;
    }

    public void setCondition(Double condition) {
        this.condition = condition;
    }

    public Double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(Double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    @Override
    public Double acceptCash(Double money) {
        if (money >= condition) {
            return money - moneyReturn;
        }
        return money;
    }
}
