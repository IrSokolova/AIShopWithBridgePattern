package com.company;

import java.util.HashSet;
import java.util.Set;

public class Pants implements Product {

    private final int id;
    private final String name;
    private final double price;
    protected int size;
    protected final Set<String> keywords = new HashSet<>();
    private String material;
    private String color;

    public Pants(double price, String color, String material, int size, int id) {
        this.id = id;

        this.name = "pants";
        this.price = price;
        this.size = size;

        this.keywords.add(name);
        this.keywords.add(String.valueOf(id));
        this.color = color;
        this.material = material;
        this.keywords.add(color);
        this.keywords.add(material);
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

    @Override
    public String getLength() {
        return "Doesn't have length";
    }

    @Override
    public void setLength(String length) {
        System.out.println("The pants don't have length");
    }


    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
                "; color: " + this.getColor() + "; material: " + this.getMaterial() + "; size: " + this.getSize());
    }

    @Override
    public Set<String> getKeywords() {
        return this.keywords;
    }
}
