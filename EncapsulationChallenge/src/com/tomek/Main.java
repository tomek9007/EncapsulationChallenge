package com.tomek;

public class Main {

    public static void main(String[] args) {

        Printer printer=new Printer(1.07f,true);

        printer.printingPage(5);

        printer.setDuplex(false);

        printer.printingPage(5);

        printer.getTonerLevel();

        printer.fillUpToner(10f);

        printer.getTonerLevel();

    }
}
