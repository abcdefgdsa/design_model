package com.am.chapter1;

public class OperationDiv extends Operation {

    @Override
    public Double getResult()  {
        if(getVar2()==0){
            System.out.println("除数不能为0");
        }
        return getVar1() / getVar2();
    }
}
