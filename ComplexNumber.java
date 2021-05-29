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
public class ComplexNumber {
    private double real;
    private double imaginary;
 
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
 
    public double getReal() {
        return this.real;
    }
 
    public double getImaginary() {
        return this.imaginary;
    }
 
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
 
    public void add(ComplexNumber complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }
 
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
 
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
    public static void main(String args[]){
        ComplexNumber object = new ComplexNumber(2.0,4.0);
        object.subtract(4.0, 8.0);
    }
}
