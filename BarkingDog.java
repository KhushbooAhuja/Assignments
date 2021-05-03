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
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(!barking || hourOfDay<0 || hourOfDay>23 || (hourOfDay > 7 && hourOfDay<23))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
 public static void main(String args[]){
     BarkingDog.shouldWakeUp(true, 20);
 }
}
