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
public class GreatestCommonDivisor {
 
    public static int getGreatestCommonDivisor(int first, int second) {
 
        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second)
                first = first - second;
            else {
                second = second - first;
            }
        }
        return second;
    }
    public static void main(String args[]){
        GreatestCommonDivisor.getGreatestCommonDivisor(5, 7);
    }
}
