package com.company;

public class Printing implements Strategy{
    @Override
    public void execute(AIShop aiShop) {
        aiShop.printProducts();
    }
}
