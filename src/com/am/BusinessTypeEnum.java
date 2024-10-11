package com.am;

public enum BusinessTypeEnum {
    Putting(1),
    Take(2),
    Check(3),
    Backing(4),
    Wasting(5),
    ReturnWithdrawal(6),
    Default(-1)
    ;
    private final Integer value;

    BusinessTypeEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static BusinessTypeEnum findBusinessType(int value) {
        for (BusinessTypeEnum type : values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return Default;
    }
}