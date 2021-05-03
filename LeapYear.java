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
public class LeapYear {
 public static boolean isLeapYear(int year)
 {
     if(year>=1 && year <=9999){
         if((year%400==0) || (year%100!=0 && year%4==0))
             return true;
     }    
     else
        return false;
    return false;
 }
 public static void main(String args[]){
     LeapYear.isLeapYear(1800);
 }
}
