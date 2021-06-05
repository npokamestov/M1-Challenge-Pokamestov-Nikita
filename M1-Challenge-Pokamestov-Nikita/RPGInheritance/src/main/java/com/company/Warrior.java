package com.company;

import java.util.Objects;

public class Warrior extends Character {

    private int shieldStrength = 100;

    public void decreaseShieldStrength() {
        System.out.println(this.name + " has lost shield strength!");
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, 75, health, 100, 50, 10);
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
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
        Warrior warrior = (Warrior) o;
        return getShieldStrength() == warrior.getShieldStrength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShieldStrength());
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
}
