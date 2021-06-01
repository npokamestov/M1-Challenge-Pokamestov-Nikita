package com.company;

public class Farmer extends Character {

    public void plow() {
        System.out.println(this.name + " is plowing!");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting!");
    }

    @Override
    public void setStrength(int strength) {
        super.setStrength(75);
    }

    @Override
    public void setStamina(int stamina) {
        super.setStamina(75);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(10);
    }

    @Override
    public void setAttackPower(int attackPower) {
        super.setAttackPower(1);
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

}
