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
public class FirstLastDigitSum {
 
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
 
        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
    public static void main(String args[]){
        FirstLastDigitSum.sumFirstAndLastDigit(20);
    }
}
