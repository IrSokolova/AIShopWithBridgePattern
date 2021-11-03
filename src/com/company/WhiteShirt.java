package com.company;

import java.util.HashSet;
import java.util.Set;

public class WhiteShirt implements Product {

    private final int id;
    private final double price;
    protected int size;
    protected final Set<String> keywords = new HashSet<>();
    private final String color;

    public WhiteShirt(double price, int size, int id) {
        this.id = id;

        String name = "white shirt";
        this.price = price;
        this.size = size;

        this.keywords.add(name);
        this.keywords.add(String.valueOf(id));
        this.color = "white";
        this.keywords.add(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        System.out.println("White shirt doesn't change color");
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "White shirt";
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getLength() {
        return "Doesn't have length";
    }

    @Override
    public void setLength(String length) {
        System.out.println("White shirt doesn't have length");
    }

    @Override
    public String getMaterial() {
        return "Doesn't have material";
    }

    @Override
    public void setMaterial(String material) {
        System.out.println("White shirt doesn't have material");
    }

    /**
     * @param userKeyword : the keyword
     * @return : does the keyword belong to this product?
     */
    @Override
    public boolean isApplicable(String userKeyword) {
        return this.keywords.contains(userKeyword);
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void printProduct() {
        System.out.println("id: " + this.getId() + "; name: " + this.getName() +
                "; price: " + this.getPrice() + "; color: " + this.getColor() + "; size: " + this.getSize());
    }

    @Override
    public Set<String> getKeywords() {
        return this.keywords;
    }
}
