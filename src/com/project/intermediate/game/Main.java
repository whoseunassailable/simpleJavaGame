package com.project.intermediate.game;

/* Problem Statement
There are two players : let's say player one and player two.
Player One : Name, weapon and health.
Player Two : Name, weapon and health + Armour.

For Player One :
If player gets damaged by a gun one then health is reduced by 30.
If player gets damaged by a gun two then health is reduced by 50.

For Player Two :
If player is wearing an armour then :
    If player gets damaged by gun one then health is reduced by 20.
    if player gets damaged by gun two then health is reduced by 40.

If player is not wearing an armour then :
    If player gets damaged by a gun one then health is reduced by 30.
    If player gets damaged by a gun two then health is reduced by 50.

If we press on heal :
    Health will reach to 100.
*/

public class Main {
    public static void main(String[] args) {
        // Creating objects of different the players
        Player1 playerOne = new Player1("Rohan", "Excalibur", 500);
        Player2 playerTwo = new Player2("Abhishek", "Mjolnir", 450, true);


        //playerOne.damageByGunOne();
        //playerOne.damageByGunTwo();
        //playerOne.damageByGunTwo();


        playerTwo.damageByGunOne();
        playerTwo.damageByGunOne();

    }
}
