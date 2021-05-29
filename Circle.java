/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet.CircleCylinder;

/**
 *
 * @author khusboo
 */
public class Circle {
 
    private double radius; // instance variable
    
    //Create Constructor, initialization of fields
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
    
    //Methods
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
 
    public double getRadius() {
        return radius;
    }
}
