package com.am.chapter2;

public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300减100":
                cashSuper = new CashReturn(300D, 100D);
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper;
    }

    public static void main(String[] args) {
        CashSuper cashAccept = CashFactory.createCashAccept("满300减100");
        Double result = cashAccept.acceptCash(300D);
        System.out.println("购买的价格为：" + result);
    }
}
