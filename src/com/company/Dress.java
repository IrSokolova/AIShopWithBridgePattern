package com.company;

import java.util.HashSet;
import java.util.Set;

public class Dress implements Product {

    private final int id;
    private final String name;
    private final double price;
    protected int size;
    protected final Set<String> keywords = new HashSet<>();
    private String color;
    private String length;

    public Dress(double price, String color, String length, int size, int id) {
        this.id = id;

        this.name = "dress";
        this.price = price;
        this.size = size;

        this.keywords.add(name);
        this.keywords.add(String.valueOf(id));
        this.color = color;
        this.length = length;
        this.keywords.add(color);
        this.keywords.add(length);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getLength() {
        return length;
    }

    @Override
    public String getMaterial() {
        return "Doesn't have material";
    }

    @Override
    public void setMaterial(String material) {
        System.out.println("The dress doesn't have material");
    }

    public void setLength(String length) {
        this.length = length;
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
        System.out.println("id: " + this.getId() + "; name: " + this.getName() + "; price: " + this.getPrice() +
                "; color: " + this.getColor() + "; length: " + this.getLength() + "; size: " + this.getSize());
    }

    @Override
    public Set<String> getKeywords() {
        return this.keywords;
    }
}