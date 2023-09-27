package com.mycompany.game;

public class Enemies {
    String name;
    int hp;
    int damage;
    int defense;
    int agility;
    boolean DoubleDefense;

    public Enemies(String name, int hp, int damage, int defense, int agility){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.agility = agility;
    }
}
