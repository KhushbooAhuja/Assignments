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

 public class AreaCalculator {
    public static double area(double radius){
       // double PI = 3.141;
        if(radius<0){
            return -1.0;
        }
        return radius*radius*Math.PI;
        
    }
    public static double area(double x, double y){
        if(x<0||y<0){
            return -1.0;
        }
    return x*y;
    }
    public static void main(String args[]){
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-5.0));
        System.out.println(AreaCalculator.area(2.0,4.0));
          System.out.println(AreaCalculator.area(2.0,-4.0));
    }
}
