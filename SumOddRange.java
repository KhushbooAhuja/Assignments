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
public class SumOddRange {
   public static boolean isOdd(int number){
        if (number <= 0) {
            return false;
        }
        
        return number % 2 != 0;
        
    }
 public static int sumOdd(int start, int end){
     if(start<0 || end <0 || end < start){
         return -1;
     }
     else{
         int sum=0;
         for(int i=start;i<=end;i++){
             if(isOdd(i)){
                 sum = sum+i;
             }
             
         }
         return sum;
     }
 }
 public static void main(String args[]){
     SumOddRange.sumOdd(1,10);
 }
}
