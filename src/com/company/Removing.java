package com.company;

public class Removing implements Strategy {
    private final Admin admin;

    public Removing(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute(AIShop aiShop) {
        System.out.println("Enter the ID of the product, please:");

        int id = admin.inputID();

        aiShop.removeProduct(id);
        System.out.println("the product is removed");
    }
}
