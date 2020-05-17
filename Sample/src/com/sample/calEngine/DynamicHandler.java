package com.sample.calEngine;

import java.util.zip.DeflaterOutputStream;

public class DynamicHandler{

    private MathProcessing[] handlers;
    public DynamicHandler(MathProcessing[] handler){

            this.handlers = handler;
    }

    public String process(String statement) throws InvalidStatementExceptions {
        String [] parts = statement.split(" ");
        String keyword = parts[0];
        MathProcessing theHandeler =  null;
        for(MathProcessing handler:this.handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyword())){
                theHandeler = handler;
            }
        }
        if(theHandeler == null) {
            throw new InvalidStatementExceptions("Handler not added",statement);
        }
        double leftVal = Double.parseDouble(parts[1]);
        double rightVal = Double.parseDouble(parts[2]);
        double result = theHandeler.doCalculations(leftVal,rightVal);
        StringBuilder sb = new StringBuilder();
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandeler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
        // return null;

    }
}
