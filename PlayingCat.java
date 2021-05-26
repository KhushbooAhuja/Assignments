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
public class PlayingCat {
  public static boolean isCatPlaying(boolean summer, int temperature){
      if(summer == true && (temperature >=25 && temperature <=45))
      {
          return true;
      }
      else if(summer == false && (temperature >=25 && temperature <=35)){
          return true;
      }
      else
      {
          return false;
      }
  }
  public static void main(String args[]){
      PlayingCat.isCatPlaying(true,35);
      
  }
}