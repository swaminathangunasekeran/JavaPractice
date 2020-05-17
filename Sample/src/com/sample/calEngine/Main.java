package com.sample.calEngine;

public class Main {


    public static void main(String[] args) {
        double [] leftVals = {10.0d,20.0d,30.0d,40.0d};
        double[] rightVals = {5.0d,10.0d,15.0d,20.0d};
        char[] opcode  = {'a','s','d','m'};
        double[] results = new double[opcode.length];
        // double val1 = 100.0d;
        // double val2 = 50.0d;
        // char opcode = 'd';
     /*       System.out.println("==== USE CALCULATE BASE ====");
            useCalculateBase();
            System.out.println("==== USE MATH BASE BASE ====");
            useMathBase();
            System.out.println("==== USE Calculate Helper ====");
            useCalculateHelper();*/
            System.out.println("==== USE Dynamic Helper ====");
            useDynamicHelper();




    }


    static void useDynamicHelper(){
        MathProcessing[] mathProcessings = {new Adder(),new Subtractor()};
        DynamicHandler helper = new DynamicHandler(new MathProcessing[]{
                new Adder(),new Subtractor()
        }
        );
        String [] statements = {"add 10.0d 20.0d","subtract 20.0d 10.0d"};

        for(String statement:statements){
            try{
                String output = helper.process(statement);
                System.out.println(output);
            }catch (Exception e){
                System.out.println("Exception:"+e.getMessage());
                System.out.println("Cause :"+e.getCause());
            }

        }
    }

    static void useMathBase(){
        MathEquation[] mathEquation =  new MathEquation[4];
        mathEquation[0]= new MathEquation('a',10.0d,20.0d);
        mathEquation[1]= new MathEquation('s',10.0d,20.0d);
        mathEquation[2]= new MathEquation('d',10.0d,20.0d);
        mathEquation[3]= new MathEquation('m',10.0d,20.0d);


        for(MathEquation equation:mathEquation){
            equation.execute();
            System.out.println("RESULT = "+equation.getResult());
        }

    }

    static void useCalculateHelper(){

        String [] statements = {"add 10.0d 20.0d","subtract 20.0d 10.0d"};
        CalculateHelper calculateHelper =  new CalculateHelper();
        for(String statement:statements){
            try {
                calculateHelper.process(statement);
                System.out.println("CALCULATE HELPER "+calculateHelper.toString());
            }catch (InvalidStatementExceptions e){
                System.out.println(e.getMessage());
                if(e.getCause() != null){
                    System.out.println("Original EXCEPTION "+e.getCause().getMessage());
                }
            }

        }
    }

    static void useCalculateBase(){
        CalculateBase[] calculateBase = {new Adder(100.0d,150.0d),new Subtractor(150.0d,100.0d)};

        for(CalculateBase result : calculateBase){
            result.calculate();
            System.out.println("RESULT = "+result.getResult());

        }
    }


    public static MathEquation create(double leftVal, double rightVal,char opcode){
            MathEquation mathEquation = new MathEquation();
            mathEquation.setLeftVal(leftVal);
           mathEquation.setRightVal(rightVal);
            mathEquation.setOpcode(opcode);
            return mathEquation;
    }




}
