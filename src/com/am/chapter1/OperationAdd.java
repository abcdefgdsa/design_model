package com.am.chapter1;

public class OperationAdd extends Operation {

    @Override
    public Double getResult() {
        return getVar1() + getVar2();
    }
}
