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
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scannerObject = new Scanner(System.in);
 
        System.out.println("Floor dimensions: ");
        System.out.print("Length: ");
        double floorLengthParameter = scannerObject.nextDouble();
        System.out.print("Width: ");
        double floorWidthParameter = scannerObject.nextDouble();
 
        Floor floorObject = new Floor(floorWidthParameter, floorLengthParameter);
 
        System.out.println();
 
        System.out.print("Desired carpet price: $");
        double carpetCostParameter = scannerObject.nextDouble();
 
        Carpet carpetObject = new Carpet(carpetCostParameter);
 
        System.out.println();
 
        Calculator calculatorObject = new Calculator(floorObject, carpetObject);
        System.out.println("Total carpeting price: $" + String.format("%.2f", calculatorObject.getTotalCost()));
 
        scannerObject.close();
 
    }
 
}

