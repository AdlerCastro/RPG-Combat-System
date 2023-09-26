package com.mycompany.game;

//Identificar o IO com outras funcionalidades
import java.io.IOException;

//Identificar o IO
import java.util.Scanner;

//Sleep
import java.lang.Thread;

//Função main na classe principal
public class Game {
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        
        char choise;
        
        
        System.out.println("\t1- Start\n\t2- History\n\t3-Exit");
            
        while(true){
            choise = input.next().charAt(0);
            //Limpar buffer do teclado
            input.nextLine();
            
            switch(choise){
                case '1':
                   Start();
                break;
                
                case '2':
                    Lore();
                break;

                case '3':
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Valor inválido");
                break;
            }
        } 
    }
    
    //Função de iniciar o game
    private static void Start() throws InterruptedException{
        Clean();
        System.out.println("\tDesejas criar um personagem ou escolher um pré-definido?\n\n\t1-Desejo criar meu personagem\n\t2- Escolher pré-definido");
        
        Scanner input = new Scanner(System.in);
        char choise;
        
        while(true){
            choise = input.next().charAt(0);
            input.nextLine();
            
            switch(choise){
                    case '1':
                        Custom();
                    break;

                    case '2':
                        StandardCharacters();
                    break;

                    default:
                        System.out.println("Valor inválido");
                    break;
            }
        }
        
    }
    
    //Função para a customização
    private static void Custom() throws InterruptedException{
        Scanner input = new Scanner(System.in);
        char choise;
                
        TutorialCustom();
        
        System.out.println("\n\nPressione qualquer tecla para continuar");
        choise = input.next().charAt(0);
        input.nextLine();
        
        while(true){
            CustomCharacter Character = new CustomCharacter();
            
            Clean();
               
            System.out.println("\n\n\tPontos de Atributos: "+Character.Points);
            System.out.print("\nForça: ");
            Character.Força(input.nextInt());

            System.out.println("\n\n\tPontos de Atributos: "+Character.Points);
            System.out.print("\nDestreza: ");
            Character.Destreza(input.nextInt());

            System.out.println("\n\n\tPontos de Atributos: "+Character.Points);
            System.out.print("\n\nConstituição: ");
            Character.Constituicao(input.nextInt());

            System.out.println("\n\n\tPontos de Atributos: "+Character.Points);
            System.out.print("\nAgilidade: ");
            Character.Agilidade(input.nextInt());
            
            System.out.println("\nCalculando vida...");
            Character.HP();
            Thread.sleep(2000);
            
            if(Character.Points > 0 || Character.Points == 0 ){
                
                
                
                while(true){
                    System.out.println("Aperte '1' para continuar ou '0' para refazer");
                    choise = input.next().charAt(0);
                    input.nextLine();
                    
                    if(choise == '1'){
                        System.out.print("\n\nEscolha o nome de seu personagem: ");
                        Character.name = input.next();
                        
                        Character.Informacoes();
                        
                        System.out.println("\n\tIniciando Combate...");
                        Thread.sleep(3000);
                        Combat();
                    }
                    else if(choise != '0' && choise != '1'){
                        System.out.println("Valor inválido");
                        Thread.sleep(3000);
                    }
                        break;
                }
            }
            
            else{
                System.out.println("Você ultrapassou o limite de atributos, refaça");
                Thread.sleep(2000);
            }
        }
    }
    
    //Função para os personagens padrões
    private static void StandardCharacters(){
        System.out.println("Let's go");
    }
    
    //Função para combate
    private static void Combat(){
        Clean();
        System.out.println("Funciona o combate");
    }
    
    //lore do jogo
    private static void Lore(){
        Clean();
        System.out.println(" Em uma terra Nórdica, está acontecendo uma batalha entre reinos, onde o vencedor conquistara o controle das terras sagradas.\nUm guerreiro com vontade de lutar apostando sua vida aparece, e você será ele, não importa sua classe ou arma que irá empunhar,\no que importa é a sua dedicação no campo de batalha. O campo inimigo é composto por diversos guerreiros, de pequeno porte aos\nde maior poder, com grande machados, machadinhas, alabardas e katanas simples, os fortes dos fracos se diferenciam por sua aura,\ne quanto mais voçe matar, mais forte a sua aura ficara.");
    }
    
    private static void Gameover(){
        Clean();
        System.out.println("Bem vindo a Hel!");
    }
    
    //Funções de tutoriais
    private static void TutorialCustom(){
        Clean();
        System.out.println("Tutorial da customização");
    }
    
    private static void TutorialCombat(){
        System.out.println("Tutorial do combate");
    }
    
    //Função para "limpar" o console
    private static void Clean(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}