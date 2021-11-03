package com.company;

public class Actions {
    private Product product;

    Actions(Product product) {
        this.product = product;
    }

    void changeLength(String length) {
        this.product.getKeywords().remove(this.product.getLength());
        this.product.setLength(length);
        if (this.product instanceof Dress) {
            this.product.getKeywords().add(length);
        }
    }

    void changeMaterial(String material) {
        this.product.getKeywords().remove(this.product.getMaterial());
        this.product.setMaterial(material);
        if (this.product instanceof Pants) {
            this.product.getKeywords().add(material);
        }
    }

    void changeColor(String color) {
        this.product.getKeywords().remove(this.product.getColor());
        this.product.setColor(color);
        if (this.product instanceof Pants || this.product instanceof Dress) {
            this.product.getKeywords().add(color);
        }
    }

    void changeSize(int size){
        this.product.setSize(size);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product){
        this.product = product;}
}
