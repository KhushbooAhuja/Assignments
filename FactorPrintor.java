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
public class FactorPrintor {
    public static void printFactors(int number){
        if(number<1) {
            System.out.print("Invalid Value");
            return; // add to "break" out of the method
        }
        // for(int i=1; i<=number; i++){
        for(int i=1; i<=number/2; i++){ // optimize to loop just half of the number
            if(number%i==0) System.out.print(i + " ");
        }
        System.out.print(number); // print last value
    }
    public static void main(String args[]){
        FactorPrintor.printFactors(6);
    }
}