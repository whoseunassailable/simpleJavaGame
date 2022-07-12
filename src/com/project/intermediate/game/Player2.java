package com.project.intermediate.game;

public class Player2 extends Player1{

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGunOne() {
        if (armour) {
            health -= 20;
            if (this.health <= 0) {
                this.health = 0;
                System.out.println("Armour is on and got hit by gun one. Health is reduced by 20. New health is " + this.health);
            }
        }
        if (!armour) {
            this.health -= 30;
            if (health <= 0) {
                this.health = 0;
                System.out.println("Armour is off. Got hit by gun one. Health is reduced by 30. New health is " + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

    @Override
    public void damageByGunTwo() {
        if (armour) {
            health -= 40;
            if (this.health <= 0) {
                this.health = 0;
                System.out.println("Armour is on and got hit by gun two. Health is reduced by 40. New health is " + this.health);
            }
        }
        if (!armour) {
            this.health -= 50;
            if (health <= 0) {
                this.health = 0;
                System.out.println("Armour is off. Got hit by gun one. Health is reduced by 50. New health is " + this.health);
            }
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead.");
        }
    }

}
