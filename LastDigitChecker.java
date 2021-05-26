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
public class LastDigitChecker {
    public static boolean isValid(int num){
        return (num > 9) && (num < 1001);
    }
 
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }
    public static void main(String args[]){
        LastDigitChecker.hasSameLastDigit(5, 5, 5);
    }
}