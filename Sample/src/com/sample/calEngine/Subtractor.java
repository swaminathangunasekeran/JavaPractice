package com.sample.calEngine;

public class Subtractor extends CalculateBase implements MathProcessing {

    public Subtractor(){

    }

    public Subtractor(double leftVal,double righVal){
        super(leftVal,righVal);
    }

    @Override
    public void calculate() {
        double result = getLeftVal() - getRightVal();
        setResult(result);
    }

    @Override
    public String getKeyword() {
        return "subtract";
    }

    @Override
    public char getSymbol() {
        return '-';
    }

    @Override
    public double doCalculations(double leftval, double rightVal) {
        setLeftVal(leftval);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
