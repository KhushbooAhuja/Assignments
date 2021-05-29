/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet.poolAres;

/**
 *
 * @author khusboo
 */
public class Cuboid extends Rectangle {
 
    private double height;
 
    public Cuboid(double width, double length, double height) {
        super(width, length);
 
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
 
    public double getHeight() {
        return height;
    }
 
    public double getVolume() {
        return getArea() * this.height;
    }
}
