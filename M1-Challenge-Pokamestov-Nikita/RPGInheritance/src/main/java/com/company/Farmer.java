package com.company;

public class Farmer extends Character {

    public void plow() {
        System.out.println(this.name + " is plowing!");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting!");
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, 75, health, 75, 10, 1);
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
}
