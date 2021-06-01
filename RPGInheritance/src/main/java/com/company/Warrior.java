package com.company;

import java.util.Objects;

public class Warrior extends Character {

    private int shieldStrength = 100;

    public void decreaseShieldStrength() {
        System.out.println(this.name + " has lost shield strength!");
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(75);
    }

    @Override
    public void setStamina(int stamina) {
        super.setStamina(100);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(50);
    }

    @Override
    public void setAttackPower(int attackPower) {
        super.setAttackPower(10);
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
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
