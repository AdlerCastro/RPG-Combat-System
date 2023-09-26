package com.mycompany.game;

public class Armor {
    int DefesaConstante = 0;
    double defesa = 0;
   
    public double CamisaVasco(int constitution){ 
        DefesaConstante = 11;
        defesa = DefesaConstante + constitution*1.5;
        
        return defesa;
    }
    
    public double Commum(int constitution){
        DefesaConstante = 12;
        defesa = DefesaConstante + constitution*1.5;
        
        return defesa;
    }
    
    public double Ashura(int constitution){ 
        DefesaConstante = 17;
        defesa = DefesaConstante + constitution*1.5;
        
        return defesa;
    }
    
    public double CamisaPaysandu(int constitution){ 
        DefesaConstante = 18;
        defesa = DefesaConstante + constitution*1.5;
        
        return defesa;
    }
    
}
