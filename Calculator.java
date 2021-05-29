/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet.CarpetFloor;

/**
 *
 * @author khusboo
 */
public class Calculator {
 
    private Floor floor;
    private Carpet carpet;
 
    public Calculator(Floor floor, Carpet carpet) {
 
        this.floor = floor;
        this.carpet = carpet;
 
    }

    
    public double getTotalCost() {
 
        return this.floor.getArea() * this.carpet.getCost();
 
    }
 
}
