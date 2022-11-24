



package com.javaqa.abstractclasses;

public abstract class Ingredient {



    public abstract long calculateQuantityFor100Gramm();
    private double quantity;

    public double getQuantity(){
        return quantity;
   }

    public void setQuantity(double x){
       quantity = x;
   }
}
