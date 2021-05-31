package com.company;

import java.util.Objects;

public class IceCreamFAC {

    public boolean isContainsChocolate() {
        return containsChocolate;
    }

    private String fruits;
    private String syrups;
    private String candies;
    private String nuts;
    private boolean containsNuts;
    private boolean containsChocolate;
    private boolean isMixerOn;
    private boolean isFreezerFull;
    private boolean isIceCreamMixed;
    private boolean isIceCreamMixing;
    private boolean areIngredientsAdded;

    public void addIngredients() {
        setFruits(fruits);
        setSyrups(syrups);
        setCandies(candies);
        setNuts(nuts);
    }

    public boolean addChocolate() {
        return containsChocolate = true;
    }

    public String turnOnMixer () {
        isMixerOn = true;
        isIceCreamMixing = true;
        isIceCreamMixed = true;

        String hasChocolate;
        if (containsChocolate) {
            hasChocolate = "chocolate";
        } else {hasChocolate = "";}

        return "These ingredients have been added: " + getFruits() + getSyrups() + getCandies() + getNuts() + hasChocolate + " ,and are mixing!";
    }

    public String addToFreezer() {
        if (!isIceCreamMixed) {
            return "Cannot add to freezer, you must finish mixing!";
        } else if (isFreezerFull) {
            return "Cannot add to freezer, the freezer is full.";
        } else {return "Added to freezer!";}
    }

    public IceCreamFAC(String fruits, String syrups, String candies, String nuts, boolean containsNuts, boolean containsChocolate, boolean isMixerOn, boolean isFreezerFull, boolean isIceCreamMixed, boolean isIceCreamMixing, boolean areIngredientsAdded) {
        this.fruits = fruits;
        this.syrups = syrups;
        this.candies = candies;
        this.nuts = nuts;
        this.containsNuts = containsNuts;
        this.containsChocolate = containsChocolate;
        this.isMixerOn = isMixerOn;
        this.isFreezerFull = isFreezerFull;
        this.isIceCreamMixed = isIceCreamMixed;
        this.isIceCreamMixing = isIceCreamMixing;
        this.areIngredientsAdded = areIngredientsAdded;
    }

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public String getSyrups() {
        return syrups;
    }

    public void setSyrups(String syrups) {
        this.syrups = syrups;
    }

    public String getCandies() {
        return candies;
    }

    public void setCandies(String candies) {
        this.candies = candies;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
        containsNuts = true;
    }

    public boolean isContainsNuts() {
        return containsNuts;
    }

    public void setContainsNuts(boolean containsNuts) {
        this.containsNuts = containsNuts;
    }

    public void setContainsChocolate(boolean containsChocolate) {
        this.containsChocolate = containsChocolate;
    }

    public boolean isMixerOn() {
        return isMixerOn;
    }

    public void setMixerOn(boolean mixerOn) {
        isMixerOn = mixerOn;
    }

    public boolean isFreezerFull() {
        return isFreezerFull;
    }

    public void setFreezerFull(boolean freezerFull) {
        isFreezerFull = freezerFull;
    }

    public boolean isIceCreamMixed() {
        return isIceCreamMixed;
    }

    public void setIceCreamMixed(boolean iceCreamMixed) {
        isIceCreamMixed = iceCreamMixed;
    }

    public boolean isIceCreamMixing() {
        return isIceCreamMixing;
    }

    public void setIceCreamMixing(boolean iceCreamMixing) {
        isIceCreamMixing = iceCreamMixing;
    }

    public boolean isAreIngredientsAdded() {
        return areIngredientsAdded;
    }

    public void setAreIngredientsAdded(boolean areIngredientsAdded) {
        this.areIngredientsAdded = areIngredientsAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFAC that = (IceCreamFAC) o;
        return isContainsNuts() == that.isContainsNuts() && isContainsChocolate() == that.isContainsChocolate() && isMixerOn() == that.isMixerOn() && isFreezerFull() == that.isFreezerFull() && isIceCreamMixed() == that.isIceCreamMixed() && isIceCreamMixing() == that.isIceCreamMixing() && isAreIngredientsAdded() == that.isAreIngredientsAdded() && Objects.equals(getFruits(), that.getFruits()) && Objects.equals(getSyrups(), that.getSyrups()) && Objects.equals(getCandies(), that.getCandies()) && Objects.equals(getNuts(), that.getNuts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFruits(), getSyrups(), getCandies(), getNuts(), isContainsNuts(), isContainsChocolate(), isMixerOn(), isFreezerFull(), isIceCreamMixed(), isIceCreamMixing(), isAreIngredientsAdded());
    }

    @Override
    public String toString() {
        return "IceCreamFAC{" +
                "fruits='" + fruits + '\'' +
                ", syrups='" + syrups + '\'' +
                ", candies='" + candies + '\'' +
                ", nuts='" + nuts + '\'' +
                ", containsNuts=" + containsNuts +
                ", containsChocolate=" + containsChocolate +
                ", isMixerOn=" + isMixerOn +
                ", isFreezerFull=" + isFreezerFull +
                ", isIceCreamMixed=" + isIceCreamMixed +
                ", isIceCreamMixing=" + isIceCreamMixing +
                ", areIngredientsAdded=" + areIngredientsAdded +
                '}';
    }
}
