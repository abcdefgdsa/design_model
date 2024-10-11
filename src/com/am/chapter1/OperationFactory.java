package com.am.chapter1;

/**
 * 简单工厂模式
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationMinus();
                break;
            case "*":
                oper = new OperationMulti();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }

    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("/");
        operate.setVar1(10);
        operate.setVar2(2);
        Double result = operate.getResult();
        System.out.println(result);
    }
}
