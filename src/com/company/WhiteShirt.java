package com.company;

public class WhiteShirt extends Product {
    private final String color;

    public WhiteShirt(String name, double price, int size) {
        super(name, price, size);
        this.color = "white";
        this.keywords.add(color);
    }

    public String getColor() {
        return color;
    }

    public void printProduct() {
        System.out.println("id: " + this.getId() + "; name: " + this.getName() +
                "; price: " + this.getPrice() + "; color: " + this.getColor() + "; size: " + this.getSize());
    }

}
