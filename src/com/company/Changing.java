package com.company;

import java.util.Scanner;

public class Changing implements Strategy{
    private Admin admin;
    private final Scanner in = new Scanner(System.in);

    public Changing(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute(AIShop aiShop) {
        System.out.println("Enter the ID of the product, please:");

        int id = admin.inputID();
        Actions actions = new Actions(aiShop.findProductByID(id));

        int option;

        System.out.println("Choose an option: 1-change length, " +
                "2-change color, 3-change material, 4-change size");

        option = admin.optionInput();

        switch (option) {
            case 1 -> {
                System.out.println("Enter new length");
                actions.changeLength(in.nextLine());
            }
            case 2 -> {
                System.out.println("Enter new color");
                actions.changeColor(in.nextLine());
            }
            case 3 -> {
                System.out.println("Enter new material");
                actions.changeMaterial(in.nextLine());
            }
            case 4 -> {
                System.out.println("Enter new size");
                actions.changeSize(Integer.parseInt(in.nextLine()));
            }

        }
    }
}
