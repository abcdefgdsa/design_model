package com.am;


import java.util.HashMap;
import java.util.Map;

public class NoUseTest {
    static Map<Integer, Integer> drugStockNumMap = new HashMap<>();

    public static void main(String[] args) {
        drugStockNumMap.put(1, 10);
        drugStockNumMap.put(2, 20);
        drugStockNumMap.put(3, 30);
        System.out.println(drugStockNumMap);

        plusStockNum(1, 1);
        plusStockNum(2, 2);
        plusStockNum(3, 3);
        plusStockNum(4, 40);

        System.out.println(drugStockNumMap);


        minusStockNum(4,10);
        minusStockNum(5,10);
        System.out.println(drugStockNumMap);




    }

    public static void plusStockNum(Integer drugId, Integer stockNum) {
        drugStockNumMap.compute(drugId, (k, remainNum) -> remainNum == null ? stockNum : remainNum + stockNum);

    }

    public static void minusStockNum(Integer drugId, Integer stockNum) {
        if(!drugStockNumMap.containsKey(drugId)){
            throw new RuntimeException("该药品没有库存");
        }
        drugStockNumMap.compute(drugId, (k, remainNum) -> {
            if (remainNum < stockNum){
                throw new RuntimeException("该药品库存不足");
            }
            return remainNum-stockNum;
        });
    }
}
