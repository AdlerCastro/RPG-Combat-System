package com.mycompany.game;

import java.util.Random;

public class PredefinedCharacters {
    int strenght = 0;
    int dexterity = 0;
    int constitution = 0;
    int agility = 0;
    //Ponto de Vida: hp;
    int hp = 0;
    String name;
    
    public void personagem1(){
        Weapon weapon = new Weapon();
        Armor armor = new Armor();

        name = "Einar";
        //Vida
        hp = 8+4;
        //Atributos
        strenght = 2;
        constitution = 4;
        agility = 5;
        dexterity = 4;
        //Arma e Armadura
        weapon.Katana(dexterity);
        armor.Commum(constitution);
        //Informações
        System.out.println("\tPersonagem 1: \n");
        System.out.println("Nome: "+name+"\nPontos de Vida(HP): "+hp+ "\nForça: "+strenght+"\nDestreza: "+dexterity+"\nConstituição: "+constitution+"\nAgilidade: "+agility+"\nArma: "+weapon+"\nArmadura: "+armor);
    }
    
    public void personagem2(){
        Weapon weapon = new Weapon();
        Armor armor = new Armor();

        name = "Hermod";
        //Vida
        hp = 12+3;
        //Atributos
        strenght = 3;
        constitution = 3;
        agility = 3;
        dexterity = 6;
        //Arma e Armadura
        weapon.Machadinha(dexterity);
        armor.CamisaVasco(constitution);
        //Informações
        System.out.println("\n\n\tPersonagem 2: \n");
        System.out.println("Nome: "+name+"\nPontos de Vida(HP): "+hp+ "\nForça: "+strenght+"\nDestreza: "+dexterity+"\nConstituição: "+constitution+"\nAgilidade: "+agility+"\nArma: "+weapon+"\nArmadura: "+armor);
    }
    
    public void personagem3(){
        Weapon weapon = new Weapon(); 
        Armor armor = new Armor();    

        name = "Magnus";
        //Vida
        hp = 13+4;
        //Atributos
        strenght = 5;
        constitution = 4;
        agility = 3;
        dexterity = 3;
        //Arma e Armadura
        weapon.Alabarda(strenght);
        armor.Ashura(constitution);
        //Informações
        System.out.println("\n\n\tPersonagem 3: \n");
        System.out.println("Nome: "+name+"\nPontos de Vida(HP): "+hp+ "\nForça: "+strenght+"\nDestreza: "+dexterity+"\nConstituição: "+constitution+"\nAgilidade: "+agility+"\nArma: "+weapon+"\nArmadura: "+armor);
    }
    
    public void personagem4(){
        Weapon weapon = new Weapon();
        Armor armor = new Armor();   

        name = "Thorffin";
        //Vida
        hp = 15+5;
        //Atributos
        strenght = 6;
        constitution = 5;
        agility = 2;
        dexterity = 2;
        //Arma e Armadura
        weapon.Machado(strenght);
        armor.CamisaPaysandu(constitution);
        //Informações
        System.out.println("\n\n\tPersonagem 4: \n");
        System.out.println("Nome: "+name+"\nPontos de Vida(HP): "+hp+ "\nForça: "+strenght+"\nDestreza: "+dexterity+"\nConstituição: "+constitution+"\nAgilidade: "+agility+"\nArma: "+weapon+"\nArmadura: "+armor);
    }
}
