package com.company;

import java.util.Objects;

public class IceCreamPOS {

    private double price;
    private double totalPrice;
    private int scoops;
    private String flavors;
    private boolean cone;
    private int toppings;

    public double scoopPrice() {
        price = 3.50;
        scoops = this.getScoops();
        return price * scoops;
    }

    public double toppingPrice() {
        price = 1.00;
        toppings = this.getToppings();
        return price * toppings;
    }

    public double addCone() {
        cone = true;
        return 2.00;
    }

    public double totalPrice() {
        return totalPrice = scoopPrice() + toppingPrice() + addCone();
    }

    public String receipt() {

        String pluralScoop;
        if( getScoops() > 1) {
                    pluralScoop = "scoops";
                } else {pluralScoop = "scoop";}

        String pluralTopping;
        if( getToppings() > 1) {
            pluralTopping = "toppings";
        } else {pluralTopping = "topping";}

        return "The total for your purchase of " + getScoops() + pluralScoop + " of " + getFlavors() + " ice cream with  " + getToppings() +  pluralTopping + " costs " + totalPrice;
    }

    public IceCreamPOS(double price, double totalPrice, int scoops, String flavors, boolean cone, int toppings) {
        this.price = price;
        this.totalPrice = totalPrice;
        this.scoops = scoops;
        this.flavors = flavors;
        this.cone = cone;
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public boolean isCone() {
        return cone;
    }

    public void setCone(boolean cone) {
        this.cone = cone;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamPOS that = (IceCreamPOS) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 && Double.compare(that.getTotalPrice(), getTotalPrice()) == 0 && getScoops() == that.getScoops() && isCone() == that.isCone() && getToppings() == that.getToppings() && Objects.equals(getFlavors(), that.getFlavors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getTotalPrice(), getScoops(), getFlavors(), isCone(), getToppings());
    }

    @Override
    public String toString() {
        return "IceCreamPOS{" +
                "price=" + price +
                ", totalPrice=" + totalPrice +
                ", scoops=" + scoops +
                ", flavors='" + flavors + '\'' +
                ", cone=" + cone +
                ", toppings=" + toppings +
                '}';
    }
}
