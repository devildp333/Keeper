package com.keeper.model.types;

/*
 * Created by GoodforGod on 20.03.2017.
 */

/**
 * Default Comment
 */
public enum RouteType {
    EMPTY(0),
    COMMON(1),
    COMPLEX(2);

    private final int value;

    RouteType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
