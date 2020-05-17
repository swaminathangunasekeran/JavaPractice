package com.sample.calEngine;

public class CalculateHelper {
    private static final char ADD_SYMBOL ='+',SUB_SYMBOL ='-';
    MathCommand mathCommand;
    double leftvalue;
    double rightValue;
    double result;

    public void process(String statement) throws InvalidStatementExceptions {
        // add 1.0 2.0
        String[] parts = statement.split(" ");
        if(parts.length > 3)
            throw new InvalidStatementExceptions("Invalid statement",statement);
        try{
            leftvalue = Double.parseDouble(parts[1]);
            rightValue = Double.parseDouble(parts[2]);
        }catch (NumberFormatException e){
            throw new InvalidStatementExceptions("Invaid input",statement,e);
        }

        setCommandFromString(parts[0]);
        CalculateBase calculateBase = null;
        switch (mathCommand){
            case Add:
                calculateBase = new Adder(leftvalue,rightValue);
                break;
            case Subtract:
                calculateBase = new Subtractor(leftvalue,rightValue);
                break;
        }
        calculateBase.calculate();
        result = calculateBase.getResult();
        // System.out.println("RESULTS calculateBase === "+calculateBase.getResult());
    }

    public void setCommandFromString(String commandFromString){

        if(commandFromString.equalsIgnoreCase(MathCommand.Add.toString())){
                mathCommand = MathCommand.Add;
//            Adder adder = new Adder(leftvalue,rightValue);
//            adder.calculate();
        }
        if(commandFromString.equalsIgnoreCase(MathCommand.Subtract.toString())){
                mathCommand = MathCommand.Subtract;
//            Subtractor subtractor =  new Subtractor(leftvalue,rightValue);
//            subtractor.calculate();
        }

    }

    @Override
    public String toString(){

        char symbol = ' ';
        switch (mathCommand){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUB_SYMBOL;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(leftvalue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }
}
