package com.sample.calEngine;

public class InvalidStatementExceptions extends Exception {
    public InvalidStatementExceptions(String reason, String statement){
            super(reason + " : " + statement);
    }

    public InvalidStatementExceptions(String reason, String statement, Throwable cause){
        super(reason + " : " + statement,cause);
    }


}
