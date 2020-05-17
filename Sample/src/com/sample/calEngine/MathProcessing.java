package com.sample.calEngine;

public interface MathProcessing {

        String seperator = "";
        String getKeyword();
        char getSymbol();
        double doCalculations(double leftval ,double rightVal);
}
