package com.company;

import java.util.Objects;

public class Constable extends Character {

    private String jurisdiction;

    public void arrest() {
        System.out.println(this.name + " has arrested a character!");
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, 60, health, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public void run() {

    }

    public void attack() {

    }

    public void heal() {

    }

    public void decreaseHealth() {

    }

    public void increaseStamina() {

    }

    public void decreaseStamina() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(getJurisdiction(), constable.getJurisdiction());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getJurisdiction());
    }

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
