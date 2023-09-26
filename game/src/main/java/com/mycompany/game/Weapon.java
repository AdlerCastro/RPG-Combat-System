package com.mycompany.game;
//Classe para a customização do personagem
import java.util.Random;

public class Weapon {
    Random random = new Random();
    //Dano Constante
    int DanoConst = 0;
    //Dano Total
    double damage = 0;
    //Arma Leve
    int dado6Lados = random.nextInt(5) + 1;  
    int dado4Lados = random.nextInt(3) + 1;
    //Arma Pesada
    int dado12Lados = random.nextInt(11) + 1;
    
    //Armas Leves
    public double Katana(int dexterity){
        DanoConst += 6;
        damage += dado6Lados + dado6Lados + dado4Lados + DanoConst;
        
        return damage;
    }
    
    public double Machadinha(int dexterity){
        DanoConst += 6;
        damage += dado6Lados + dado6Lados + dado4Lados + DanoConst;
        
        return damage;
    }
    
    //Armas Pesadas
    public double Machado(int strenght){
        DanoConst += 8;
        damage += DanoConst + dado12Lados + strenght*1.5;
        
        return damage;
    }
    
    public double Alabarda(int strenght){
        DanoConst += 10;
        damage += DanoConst + dado12Lados + strenght*1.5;
        
        return damage;
    }
}
