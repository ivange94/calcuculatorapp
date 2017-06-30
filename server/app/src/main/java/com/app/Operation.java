package com.app;

public class Operation {

    private String operator;
    private Double operand1;
    private Double operand2;

    public Operation() {}

    public Operation(String operator, Double operand1, Double operand2) {
        setOperator(operator);
        setOperand1(operand1);
        setOperand2(operand2);
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Double getOperand1() {
        return operand1;
    }

    public void setOperand1(Double operand1) {
        this.operand1 = operand1;
    }

    public Double getOperand2() {
        return operand2;
    }

    public void setOperand2(Double operand2) {
        this.operand2 = operand2;
    }

    public Result compute() {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Unrecognized operator: " + operator);
        }
        return new Result(result);
    }
}
