package com.mycompany.game;

import java.util.Random;

public class PredefinedCharacters {
    
    public void personagem1(){
        
    Random random = new Random();
    int dadoDe6Lados = random.nextInt(5) + 1;  
    int dadoDe4Lados = random.nextInt(3) + 1;  

        String Einar;
        
        int PV = 8+4;
        
        int strenght = 2;
        int constitution = 4;
        int agility = 5;
        int dexterity = 4;
        
        int katana = dadoDe6Lados + dadoDe6Lados + dadoDe4Lados + 4 + 6;
        int armadura = 12 + 6;
    }
    
    public void personagem2(){
        
    Random random = new Random();
    int dadoDe6Lados = random.nextInt(5) + 1;  
    int dadoDe4Lados = random.nextInt(3) + 1;  

        String Hermod;
        
        int PV = 12+3;
        
        int strenght = 3;
        int constitution = 3;
        int agility = 3;
        int dexterity = 6;
        
        int machadinha = dadoDe6Lados + dadoDe6Lados + dadoDe4Lados + 6 + 6;
        int camisa_do_vasco = 11 + 4;
    }
    
    public void personagem3(){
        
    Random random = new Random();
    int dadoDe12Lados = random.nextInt(11) + 1;    

        String Magnus;
        
        int PV = 13+4;
        
        int strenght = 5;
        int constitution = 4;
        int agility = 3;
        int dexterity = 3;
        
        int Alabarda = dadoDe12Lados + 7 + 10;
        int Ashura = 17 + 6;
    }
    
    public void personagem4(){
        
    Random random = new Random();
    int dadoDe12Lados = random.nextInt(11) + 1;    

        String Magnus;
        
        int PV = 15+5;
        
        int strenght = 6;
        int constitution = 5;
        int agility = 2;
        int dexterity = 2;
        
        int Machado_Grande = dadoDe12Lados + 9 + 8;
        int Camisa_do_Paysandu = 18 + 7;
    }
    
}
