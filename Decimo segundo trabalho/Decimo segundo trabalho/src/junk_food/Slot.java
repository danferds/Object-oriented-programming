package junk_food;

public class Slot{
    private String name;
    private int quantity;
    private double price;

    public Slot() {
        this.name = "empty";
        this.price = 0;
        this.quantity = 0;
    }

    public Slot(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        if(getName() == "empty") {
            return " [   " + getName() + " : " + getQuantity() + " U : " + String.format("%.2f", getPrice()) + " RS]";
        } else {
            return " [ " + getName() + " : " + getQuantity() + " U : " + String.format("%.2f", getPrice()) + " RS]";
        }
    }   
}