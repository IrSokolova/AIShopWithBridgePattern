package com.company;

import java.util.HashSet;
import java.util.Set;

public interface Product {
    /**
     * @param userKeyword : the keyword
     * @return : does the keyword belong to this product?
     */
    boolean isApplicable(String userKeyword);

    int getSize();

    void setSize(int size);

    void printProduct();

    Set<String> getKeywords();

    String getColor();

    void setColor(String color);

    double getPrice();

    String getName();

    int getId();

    String getLength();

    void setLength(String length);

    String getMaterial();

    void setMaterial(String material);

}
