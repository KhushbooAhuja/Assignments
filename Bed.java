/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemyassignmnet.Composition;

/**
 *
 * @author khusboo
 */
public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
 
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
 
    public void make(){
        System.out.println("Bed -> Making | ");
    }
 
    public String getStyle() {
        return style;
    }
 
    public int getPillows() {
        return pillows;
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getSheets() {
        return sheets;
    }
 
    public int getQuilt() {
        return quilt;
    }
}
 
