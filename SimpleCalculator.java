/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet;

/**
 *
 * @author khusboo
 */
public class SimpleCalculator {
    private double firstNumber=0;
    private double secondNumber=0;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        // if(secondNumber==0) return 0;
        // return firstNumber/secondNumber;
        return (secondNumber==0) ? 0 : firstNumber/secondNumber; // ternary operator
    }
    public static void main(String args[]){
        SimpleCalculator object = new SimpleCalculator();
        object.setFirstNumber(5);
        System.out.println(object.getFirstNumber());
        
         SimpleCalculator object1 = new SimpleCalculator();
        object1.setSecondNumber(10);
        System.out.println(object.getSecondNumber());
        
    }
}
