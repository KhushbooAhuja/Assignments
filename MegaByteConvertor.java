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
public class MegaByteConvertor {
 public static void printMegaBytesAndKiloBytes(int kiloBytes){
     if(kiloBytes<0){
         System.out.println("Invalid Value");
     }
     else
     {
         int megabytes = kiloBytes / 1024;
         int myRemainder = kiloBytes % 1024;
         System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + myRemainder + " KB");
     }
 }
 public static void main(String args[]){
     MegaByteConvertor.printMegaBytesAndKiloBytes(2500);
 }
}
