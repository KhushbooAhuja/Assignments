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
public class MinutesToYearsDaysCalculator {
   public static void printYearsAndDays(long minutes){
       if(minutes<0){
            System.out.println("Invalid Value");
       }
        else
            {
               long year = minutes / (60*24*365);
               long remyear = minutes % (60*24*365);
               long days = remyear/(60*24);
               System.out.println(minutes + " min" + " = " + year + " y" + " and " + days + " d");
                
            }
   }
   public static void main(String args[]){
       MinutesToYearsDaysCalculator.printYearsAndDays(525600);
   }
}

