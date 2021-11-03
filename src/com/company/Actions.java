package com.company;

public class Actions {
    private Product product;

    Actions(Product product) {
        this.product = product;
    }

    void changeLength(String length) {
        if (this.product instanceof Dress) {
            ((Dress) product).setLength(length);
        } else {
            System.out.println("The length cannot be changed");
        }
    }

    void changeMaterial(String material) {
        if (this.product instanceof Pants) {
            ((Pants) product).setMaterial(material);
        } else {
            System.out.println("The material cannot be changed");
        }
    }

    void changeColor(String color) {
        if (this.product instanceof Pants) {
            ((Pants) product).setColor(color);
        } else if (this.product instanceof Dress) {
            ((Dress) product).setColor(color);
        } else {
            System.out.println("The color cannot be changed");
        }
    }

    void changeSize(int size){
        this.product.setSize(size);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product){this.product = product;}
}
