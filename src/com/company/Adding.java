package com.company;
import java.util.Scanner;


public class Adding implements Strategy{
    private final Admin admin;
    private final Scanner in = new Scanner(System.in);

    public Adding(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void execute(AIShop aiShop) {
        int option;
        System.out.println("Choose a kind of the product: 1-dress, 2-white shirt, 3-pants");

        boolean over = false;
        while (!over) {
            option = admin.optionInput();
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

                    aiShop.addProduct(new Dress(price, color, length, size, Admin.currentID));
                    Admin.currentID++;
                    over = true;
                }
                case 2 -> {
                    System.out.println("Enter the price of the shirt");
                    double price = Double.parseDouble(in.nextLine());
                    System.out.println("Enter the size of the shirt");
                    int size = Integer.parseInt(in.nextLine());

                    aiShop.addProduct(new WhiteShirt(price, size, Admin.currentID));
                    Admin.currentID++;
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

                    aiShop.addProduct(new Pants(price, color, material, size, Admin.currentID));
                    Admin.currentID++;
                    over = true;
                }
                default -> System.out.println("We have no such option. Try again");
            }
        }
    }
}
