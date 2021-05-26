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
public class SharedDigit {
   public static boolean hasSharedDigit(int x,int y) {
		if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
			return false;
		}else {
		 return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
		}
	}
   public static void main(String args[]){
       SharedDigit.hasSharedDigit(2, 4);
   }
}
