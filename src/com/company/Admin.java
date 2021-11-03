package com.company;

import java.util.Scanner;

public class Admin extends Account {
    Scanner in = new Scanner(System.in);
    Actions actions;
    static int currentID;

    public Admin(String login, String password) {
        super(login, password);
        currentID = 4;
    }

    private void addProduct(AIShop aiShop) {
        int option;

        System.out.println("Choose a kind of the product: 1-dress, 2-white shirt, 3-pants");

        boolean over = false;
        while (!over) {
            option = this.optionInput();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter the price of the dress");
                    double price = Double.parseDouble(in.nextLine());
                    System.out.println("Enter the color of the dress");
                    String color = in.nextLine();
                    System.out.println("Enter the length of the dress");
                    String length = in.nextLine();
                    System.out.println("Enter the size of the dress");
                    int size = Integer.parseInt(in.nextLine());

                    aiShop.addProduct(new Dress(price, color, length, size, currentID));
                    currentID++;
                    over = true;
                }
                case 2 -> {
                    System.out.println("Enter the price of the shirt");
                    double price = Double.parseDouble(in.nextLine());
                    System.out.println("Enter the size of the shirt");
                    int size = Integer.parseInt(in.nextLine());

                    aiShop.addProduct(new WhiteShirt(price, size, currentID));
                    currentID++;
                    over = true;
                }
                case 3 -> {
                    System.out.println("Enter the price of the pants");
                    double price = Double.parseDouble(in.nextLine());
                    System.out.println("Enter the color of the pants");
                    String color = in.nextLine();
                    System.out.println("Enter the material of the pants");
                    String material = in.nextLine();
                    System.out.println("Enter the size of the pants");
                    int size = Integer.parseInt(in.nextLine());

                    aiShop.addProduct(new Pants(price, color, material, size, currentID));
                    currentID++;
                    over = true;
                }
                default -> System.out.println("We have no such option. Try again");
            }
        }
    }

    public void changeProduct(AIShop aiShop) {
        System.out.println("Enter the ID of the product, please:");

        int id = this.inputID();
        this.actions = new Actions(aiShop.findProductByID(id));

        int option;

        System.out.println("Choose an option: 1-change length, " +
                "2-change color, 3-change material, 4-change size");

        option = this.optionInput();

        switch (option) {
            case 1 -> {
                System.out.println("Enter new length");
                this.actions.changeLength(in.nextLine());
            }
            case 2 -> {
                System.out.println("Enter new color");
                this.actions.changeColor(in.nextLine());
            }
            case 3 -> {
                System.out.println("Enter new material");
                this.actions.changeMaterial(in.nextLine());
            }
            case 4 -> {
                System.out.println("Enter new size");
                this.actions.changeSize(Integer.parseInt(in.nextLine()));
            }

        }
    }

    public void removeProduct(AIShop aiShop) {
        System.out.println("Enter the ID of the product, please:");

        int id = this.inputID();

        aiShop.removeProduct(id);
        System.out.println("the product is removed");
    }

    public void productsManagement(AIShop aiShop) {
        System.out.println("Welcome to the products management!!!!!!!!!!!!!");
        boolean over = false;
        int option;

        while (!over) {
            System.out.println("Choose an option: 1-add the product, " +
                    "2-remove the product, 3-get products, 4-change product, 5-finish work");

            option = this.optionInput();

            switch (option) {
                case 1 -> this.addProduct(aiShop);
                case 2 -> this.removeProduct(aiShop);
                case 3 -> aiShop.printProducts();
                case 4 -> this.changeProduct(aiShop);
                case 5 -> {
                    System.out.println("Work is finished. Thank you!");
                    over = true;
                }
                default -> System.out.println("We have no such option. Try again");
            }
        }
    }
}