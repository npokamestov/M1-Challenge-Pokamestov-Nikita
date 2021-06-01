package com.company;

import java.util.Objects;

public class Constable extends Character {

    private String jurisdiction;

    public void arrest() {
        System.out.println(this.name + " has arrested a character!");
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(60);
    }

    @Override
    public void setStamina(int stamina) {
        super.setStamina(60);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(20);
    }

    @Override
    public void setAttackPower(int attackPower) {
        super.setAttackPower(5);
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
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
