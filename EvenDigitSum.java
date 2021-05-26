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
public class EvenDigitSum {
 
    public static int getEvenDigitSum (int number){
 
        if (number <0) return -1;
 
        int sum = 0;
        int remainder = 0;
        while (number > 0){
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder:0;
            number /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        EvenDigitSum.getEvenDigitSum(10);
    }
}