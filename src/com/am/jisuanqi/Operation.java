package com.am.jisuanqi;

import java.util.Scanner;

public class Operation {
    public static Double getResult(Double var1, Double var2, String operation) {
        double result = 0d;

        switch (operation) {
            case "+":
                result = var1 + var2;
                break;
            case "-":
                result = var1 - var2;
                break;
            case "*":
                result = var1 * var2;
                break;
            case "/":
                if (var2 == 0) {
                    System.out.println("(抛出异常)运算符不合法");
                }
                result = var1 / var2;
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个参数：");
        double var1 = sc.nextDouble();
        System.out.println("请输入运算符：");
        String operation = sc.next();
        System.out.println("请输入第二个参数：");
        double var2 = sc.nextDouble();
        try {
            Double result = Operation.getResult(var1, var2, operation);
            System.out.println("结果为：" + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


