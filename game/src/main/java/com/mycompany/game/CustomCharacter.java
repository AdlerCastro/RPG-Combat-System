package com.mycompany.game;

//Valor Aleatório
import java.util.Random;
//Classe de customização do personagem
public class CustomCharacter {
    //Nivel do jogador
    int nivelJogador;
    //Pontos de atributos
    int Points = 15;
    //Atributos do personagem
    int strenght = 0;
    int dexterity = 0;
    int constitution = 0;
    int agility = 0;
    //Ponto de Vida: hp;
    int hp = 0;
    String name;
    //Arma e Armadura
    double weapon;
    double armor;
    boolean DoubleDefense;
    
    public void Força(int PointStrenght){
        strenght += PointStrenght;
        Points -= strenght;
    }
    
    public void Destreza(int PointDexterity){
        dexterity += PointDexterity;
        Points -= dexterity;
    }
    
    public void Constituicao(int PointConstitution){
        constitution += PointConstitution;
        Points -= constitution;
    }
    
    public void Agilidade(int PointAgility){
        agility += PointAgility;
        Points -= PointAgility;
    }
    
    public void HP (int PointConstitution){
        //Rolagem de dados e variável de controle
        Random random = new Random();
        int dadoDe6Lados = random.nextInt(5) + 1;
        
        for(int control = 0; control < 3; control++){
            hp += dadoDe6Lados;
        }
        System.out.println("HP nos dados: "+hp);
        hp += PointConstitution;
        System.out.println("HP total: "+hp);
    }
    
    //Pegar oo Valor da Agilidade
    public int getAgility() {
        return agility;
    }
    
    //Pegar o Valor da Vida
    public int getHP() {
        return hp;
    }
    
    public void Informacoes(){
        System.out.println("\n\nAqui está as informações de seu personagem: \n");
        System.out.println("Nome: "+name+"\nPontos de Vida(HP): "+hp+ "\nForça: "+strenght+"\nDestreza: "+dexterity+"\nConstituição: "+constitution+"\nAgilidade: "+agility+"\nDano Arma nivel 1: "+weapon+"\nArmadura nivel 1: "+armor);
    }
}