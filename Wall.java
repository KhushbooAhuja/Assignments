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
public class Wall {
    private double width;
    private double height;
    
    public Wall(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }
    
    public Wall() {
        this(0, 0);
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }
    
    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }
    
    public double getArea() {
        return width * height;
    }
    public static void main(String args[]){
        Wall object = new Wall();
        object.setHeight(2.5);
        System.out.println(object.getHeight());
        
        Wall object1 = new Wall();
        object1.setWidth(4.5);
        System.out.println(object.getWidth());
        
        Wall object2 = new Wall();
       // object2.setHeight(2.5);
        System.out.println(object2.getArea());
        
        
    }}
