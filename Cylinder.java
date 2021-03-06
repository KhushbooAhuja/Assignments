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
public class Cylinder extends Circle {
 
    private double height; // instance variable
     
    //Create Constructor, initialization of fields
    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
     
    //Methods
    public double getVolume() {
        return getArea() * height;
    }
 
    public double getHeight() {
        return height;
    }
}
