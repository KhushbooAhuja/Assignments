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
public class EqualityPrinter {
    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0|| c<0){
            System.out.println("Invalid Value");
        }
        else if(a==b && b==c && a==c){
            System.out.println("All numbers are equal");
        }
        else if(a!=b && b!=c && c!=a){
            System.out.println("All numbers are different");
        }
        else
        {
            System.out.println("Neither all are equal or different");
        }
    }
    public static void main(String args[]){
        EqualityPrinter.printEqual(1,1,2);
    }
}

