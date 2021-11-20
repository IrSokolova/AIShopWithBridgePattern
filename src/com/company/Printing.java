package com.company;

public class Printing implements Strategy{

    public Printing() {
    }

    @Override
    public void execute(AIShop aiShop) {
        aiShop.printProducts();
    }
}
