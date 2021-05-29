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
public class Ceiling {
    private int height;
    private int paintedColor;
 
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }
 
    public int getHeight() {
        return height;
    }
 
    public int getPaintedColor() {
        return paintedColor;
    }
}
 
