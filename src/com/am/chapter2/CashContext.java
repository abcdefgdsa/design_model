package com.am.chapter2;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type){
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
    }

    public Double getResult(Double money){
        return cashSuper.acceptCash(money);
    }


    public static void main(String[] args) {
        CashContext context = new CashContext("打八折");
        Double result = context.getResult(100D);
        System.out.println(result);

    }
}
