package com.dubla2.demo.entity;

import java.io.Serializable;
import java.util.Arrays;

public class Ecuation implements Serializable {
    double operand1;
    double operand2;

    String operation;

    public Ecuation(){

    }
    public Ecuation(double operand1, double operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

   public double calculateResult(){
        double result=0;
        if (operation.equals("sum")){
             result= operand1+operand2;
        }
        else if (operation.equals("diff")){
            result=operand1-operand2;
        }

        else if (operation.equals("mult")){
            result=operand1*operand2;
        }

        else if (operation.equals("div")){
                if (operand2==0){
                    result=0;
                }
            result=operand1/operand2;
        }

        return result;
   }

    @Override
    public String toString() {
//        return "Ecuation{" +
//                "operand1=" + operand1 +
//                ", operand2=" + operand2 +
//                ", operation='" + operation + '\'' +
//                ", result=" + this.calculateResult() +
//                '}';
        return "Ecuatia: "+operand1+" "+operation+" "+operand2+" = "+this.calculateResult();
    }
}