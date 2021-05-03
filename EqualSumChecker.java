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
public class EqualSumChecker {
 public static boolean hasEqualSum(int num1, int num2, int num3)
 {
     if(num1+num2 == num3){
         return true;
     }
     else
        return false;
 }
 public static void main(String args[]){
     EqualSumChecker.hasEqualSum(2, 2, 4);
 }
}
