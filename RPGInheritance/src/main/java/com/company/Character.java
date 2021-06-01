package com.company;

import java.util.Objects;

public abstract class Character {

    protected String name;
    protected int strength;
    protected int health = 100;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public void run(){
        System.out.println("Character is running!");
    }

    public void attack() {
        System.out.println("Character attacked another character!");
    }

    public void heal() {
        System.out.println("Character is healing.");
    }

    public void decreaseHealth() {
        System.out.println("Character's health has been decreased!");
    }

    public void increaseStamina() {
        System.out.println("Character's stamina has been increased!");
    }

    public void decreaseStamina() {
        System.out.println("Character's health has been decreased!");
    }

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return getStrength() == character.getStrength() && getHealth() == character.getHealth() && getStamina() == character.getStamina() && getSpeed() == character.getSpeed() && getAttackPower() == character.getAttackPower() && Objects.equals(getName(), character.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStrength(), getHealth(), getStamina(), getSpeed(), getAttackPower());
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
