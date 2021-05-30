package com.company;

import java.util.List;
import java.util.Objects;

public class IceCreamFAC {

    private String milk;
    private String sugar;
    private List<String> fruits;
    private List<String> syrups;
    private List<String> nuts;
    private String chocolate;
    private String packaging;

    public void addMilk() {};

    public void addSugar() {};

    public void addFruit() {};

    public void addNut() {};

    public void addChocolate() {};

    public void packageUp() {};

    public IceCreamFAC(String milk, String sugar, List<String> fruits, List<String> syrups, List<String> nuts, String chocolate, String packaging) {
        this.milk = milk;
        this.sugar = sugar;
        this.fruits = fruits;
        this.syrups = syrups;
        this.nuts = nuts;
        this.chocolate = chocolate;
        this.packaging = packaging;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }

    public List<String> getSyrups() {
        return syrups;
    }

    public void setSyrups(List<String> syrups) {
        this.syrups = syrups;
    }

    public List<String> getNuts() {
        return nuts;
    }

    public void setNuts(List<String> nuts) {
        this.nuts = nuts;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFAC that = (IceCreamFAC) o;
        return Objects.equals(getMilk(), that.getMilk()) && Objects.equals(getSugar(), that.getSugar()) && Objects.equals(getFruits(), that.getFruits()) && Objects.equals(getSyrups(), that.getSyrups()) && Objects.equals(getNuts(), that.getNuts()) && Objects.equals(getChocolate(), that.getChocolate()) && Objects.equals(getPackaging(), that.getPackaging());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMilk(), getSugar(), getFruits(), getSyrups(), getNuts(), getChocolate(), getPackaging());
    }

    @Override
    public String toString() {
        return "IceCreamFAC{" +
                "milk='" + milk + '\'' +
                ", sugar='" + sugar + '\'' +
                ", fruits=" + fruits +
                ", syrups=" + syrups +
                ", nuts=" + nuts +
                ", chocolate='" + chocolate + '\'' +
                ", packaging='" + packaging + '\'' +
                '}';
    }
}
