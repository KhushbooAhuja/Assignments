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
public class Rectangle {
 
    private double width;
    private double length;
 
    public Rectangle(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
 
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
 
    public double getWidth(){
        return width;
    }
 
    public double getLength(){
        return length;
    }
 
    public double getArea(){
        return this.width * this.length;
    }
 
}
