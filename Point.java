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
public class Point {
 
    private int x;
    private int y;
 
//
//    The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
//    The second constructor has parameters x and y of type int and it needs to initialize the fields.
 
    public Point(){
 
    }
 
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
 
    public double distance(){
 
        return Math.sqrt( (getX() - 0.0) * ( getX() - 0)  + (getY() - 0) * (getY() - 0));
    }
 
    public double distance(int x, int y){
        
        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y ) * (getY() - y));
    }
    
    public double distance(Point xy){
 
        return Math.sqrt( (getX() - xy.getX()) * ( getX() - xy.getX())  + (getY() - xy.getY() ) * (getY() - xy.getY()));
    }
    public static void main(String args[]){
        Point object = new Point();
        object.setX(2);
        System.out.println(object.getX());
        
         Point object1 = new Point();
        object1.setY(4);
        System.out.println(object1.getY());
        
         Point object2 = new Point();
       
        System.out.println(object.distance());
    }
 
}
