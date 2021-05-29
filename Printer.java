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
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1 && tonerLevel<=100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    
    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
        // return (tonerAmount>0 && tonerAmount<=100) ? ((tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount)) : -1;
    }
    
    public int printPages(int pages) {
        
        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public static void main(String args[]){
        Printer object = new Printer(4,true);
        object.addToner(50);
        object.printPages(200);
        System.out.println(object.getPagesPrinted());
        
    }
}

