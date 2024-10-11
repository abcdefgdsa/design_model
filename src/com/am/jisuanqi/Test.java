package com.am.jisuanqi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个参数：");
        double var1 = sc.nextDouble();
        System.out.println("请输入运算符：");
        String operation = sc.next();
        System.out.println("请输入第二个参数：");
        double var2 = sc.nextDouble();
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
                    System.out.println("运算符不合法");
                    return;
                }
                result = var1 / var2;
                break;
        }
        System.out.println("结果为：" + result);

    }
}
