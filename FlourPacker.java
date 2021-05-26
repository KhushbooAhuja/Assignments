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
public class FlourPacker {
  public static boolean canPack(int bigCount, int smallCount, int goal){
    for (int i =0; i<=bigCount; i++){
        for (int j=0; j<=smallCount; j++){
            if ((5*i)+j==goal)
            return true;
        }
    }
    return false;
}
  public static void main(String args[]){
      FlourPacker.canPack(20, 10, 15);
  }
}
