package com.company;

public class Admin extends Account {
    static int currentID;
    private Strategy strategy;

    public Admin(String login, String password) {
        super(login, password);
        currentID = 4;
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
                case 1 -> {
                    this.strategy = new Adding(this);
                    strategy.execute(aiShop);
                }
                case 2 -> {
                    this.strategy = new Removing(this);
                    strategy.execute(aiShop);
                }
                case 3 -> {
                    this.strategy = new Printing();
                    strategy.execute(aiShop);
                }
                case 4 -> {
                    this.strategy = new Changing(this);
                    strategy.execute(aiShop);
                }
                case 5 -> {
                    System.out.println("Work is finished. Thank you!");
                    over = true;
                }
                default -> System.out.println("We have no such option. Try again");
            }
        }
    }
}