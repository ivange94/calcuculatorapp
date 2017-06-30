package com.app;

public class Result {

    private double value;

    public Result(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public boolean equals(Object obj) {
        final Result result = (Result) obj;
        return this.value == result.value;
    }
}
