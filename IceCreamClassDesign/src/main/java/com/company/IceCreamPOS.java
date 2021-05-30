package com.company;

import java.util.List;
import java.util.Objects;

public class IceCreamPOS {

    private double price;
    private int scoopNum;
    private List<String> flavors;
    private List<String> containers;
    private List<String> toppings;

    public IceCreamPOS(double price, int scoopNum, List<String> flavors, List<String> containers, List<String> toppings) {
        this.price = price;
        this.scoopNum = scoopNum;
        this.flavors = flavors;
        this.containers = containers;
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScoopNum() {
        return scoopNum;
    }

    public void setScoopNum(int scoopNum) {
        this.scoopNum = scoopNum;
    }

    public List<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<String> flavors) {
        this.flavors = flavors;
    }

    public List<String> getContainers() {
        return containers;
    }

    public void setContainers(List<String> containers) {
        this.containers = containers;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamPOS that = (IceCreamPOS) o;
        return Double.compare(that.getPrice(), getPrice()) == 0 && getScoopNum() == that.getScoopNum() && Objects.equals(getFlavors(), that.getFlavors()) && Objects.equals(getContainers(), that.getContainers()) && Objects.equals(getToppings(), that.getToppings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getScoopNum(), getFlavors(), getContainers(), getToppings());
    }

    @Override
    public String toString() {
        return "IceCreamPOS{" +
                "price=" + price +
                ", scoopNum=" + scoopNum +
                ", flavors=" + flavors +
                ", containers=" + containers +
                ", toppings=" + toppings +
                '}';
    }
}
