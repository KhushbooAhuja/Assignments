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
public class NumberPalindrome 
{
    public static boolean isPalindrome(int number) 
    {
        if (number < 0) 
        {
            number *= -1;
        }
        
        int reverse = 0;
        int stored = number;
        while (stored > 0) 
        {
            // extract the lest-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit
            stored /= 10;   // same as number = number / 10;
        }
 
        if (number == reverse) 
        {
            return true;
        } else 
            {
            return false; 
            }
 
    }
 public static void main(String args[]){
     NumberPalindrome.isPalindrome(12121);
 }
}
