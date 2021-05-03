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
public class TeenNumberChecker {
 public static boolean hasTeen(int parameters1, int parameters2, int parameters3)
 {
     if((parameters1>=13 && parameters1<=19)||(parameters2>=13 && parameters2<=19)||(parameters3>=13 && parameters3<=19)){
         return true;
     }
     else
        return false;
 }
 public static boolean isTeen(int para1){
     if(para1>=13 && para1<=19){
         return true;
     }
     else
        return false;
 }
 public static void main(String args[]){
     TeenNumberChecker.hasTeen(9, 19, 13);
     TeenNumberChecker.isTeen(14);
 }
}