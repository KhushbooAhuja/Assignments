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
public class PerfectNumber {
   public static boolean isPerfectNumber(int number) {
 
    int sumOfProperDivisors = 0;
 
    for (int i = 1;i < number;i++)
        if (number % i == 0)
            sumOfProperDivisors += i;
 
    return sumOfProperDivisors == number && number > 1;
 
}
   public static void main(String args[]){
       PerfectNumber.isPerfectNumber(6);
   }
}