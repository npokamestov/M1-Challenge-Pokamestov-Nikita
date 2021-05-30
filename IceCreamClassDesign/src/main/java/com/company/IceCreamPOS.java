package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class IceCreamPOS {




    private double price;
    private int scoops;
    private List<String> flavors;
    private List<String> containers;
    private List<String> toppings;

    public List<String> pickContainer(List<String> containers) {
        return containers;
    };

    public List<String> pickFlavor(List<String> flavors) {
        return flavors;
    };

    public List<String> pickTopping(List<String> toppings) {
        return toppings;
    };

    public Map<String, Integer> buildDessert(List<String> containers, List<String> flavors, List<String> toppings) {
        return null;
    };

    public double totalCost() {
        return price;
    };

    public IceCreamPOS(double price, int scoops, List<String> flavors, List<String> containers, List<String> toppings) {
        this.price = price;
        this.scoops = scoops;
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

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
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
        return Double.compare(that.getPrice(), getPrice()) == 0 && getScoops() == that.getScoops() && Objects.equals(getFlavors(), that.getFlavors()) && Objects.equals(getContainers(), that.getContainers()) && Objects.equals(getToppings(), that.getToppings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getScoops(), getFlavors(), getContainers(), getToppings());
    }

    @Override
    public String toString() {
        return "IceCreamPOS{" +
                "price=" + price +
                ", scoopNum=" + scoops +
                ", flavors=" + flavors +
                ", containers=" + containers +
                ", toppings=" + toppings +
                '}';
    }
}
