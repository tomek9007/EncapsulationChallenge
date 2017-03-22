package com.tomek;

/**
 * Created by Tomek on 2017-02-20.
 */
public class Printer {

    private float tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public float fillUpToner(float addToner){
        tonerLevel+=addToner;
        if (tonerLevel>100)
            tonerLevel=100;

        return tonerLevel;
    }

    public Printer(float tonerLevel,  boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    private void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public float getTonerLevel() {
        System.out.println("Toner Level is on "+tonerLevel+"%");
        return tonerLevel;
    }



    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public void printingPage(int howManyPages){


        for (int i=1;i<=howManyPages ;i++ ) {
            if (this.tonerLevel > 1) {
                pagesPrinted++;
                this.tonerLevel = this.tonerLevel - 0.01f;
                if (this.duplex == false) {
                    System.out.println("Wydrukowano strone " + pagesPrinted + " na kartce " + pagesPrinted);
                } else {
                    System.out.println("Wydrukowano strone " + pagesPrinted + " na kartce " + (pagesPrinted + 1) / 2);
                }
            }
            else
            {
                System.out.println("Wymien toner");
            }
        }
        setPagesPrinted(0);
    }

}
