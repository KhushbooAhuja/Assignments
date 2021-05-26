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
import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
            // scanner.nextLine(); // not really needed because we don't need to print an alert for invalid number
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
    public static void main(String args[]){
       InputCalculator.inputThenPrintSumAndAverage();
    }
}
