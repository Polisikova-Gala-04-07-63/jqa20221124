



package com.javaqa.abstractclasses;

public class Main {

    public static void main(String[] args) {

        Noodle noodle = new Noodle();
        System.out.println("Noodle's take" +" "+ noodle.calculateQuantityFor100Gramm() + " Gramm");

        Pork pork = new Pork();
        System.out.println("Pork's take" +" "+ pork.calculateQuantityFor100Gramm() + " Gramm");

        Mushroom mushroom = new Mushroom();
        System.out.println("Mushroom's take" +" "+ mushroom.calculateQuantityFor100Gramm() + " Gramm");

    }
}
