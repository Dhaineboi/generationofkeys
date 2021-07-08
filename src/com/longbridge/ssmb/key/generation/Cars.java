package com.longbridge.ssmb.key.generation;

public class Cars {

    private String Brand, Model, Color;
    private float Price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;

    }
    public String Print(){
        return   Brand + Model + Color + Price;

    }

    @Override
    public String toString() {
        return "Cars{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", Price=" + Price +
                '}';
    }
}
