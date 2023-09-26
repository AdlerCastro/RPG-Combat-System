package com.mycompany.game;

//Identificar o IO
import java.util.Scanner;

//Sleep
import java.lang.Thread;

//Função main na classe principal
public class Game {
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
                        
            if(Character.Points > 0 || Character.Points == 0 ){
                while(true){
                System.out.println("Aperte '1' para continuar ou '0' para refazer");
                choise = input.next().charAt(0);
                input.nextLine();
                    
                if(choise == '1'){
                    Weapon weapon = new Weapon();
                    System.out.println("\n\n\tEscolha sua arma\n\n1- Katana\n2- Machadinha");
                    
                    char ChoiseWeapon = input.next().charAt(0);
                    input.nextLine();

                    switch(ChoiseWeapon){
                        case '1':
                            Character.weapon = weapon.Katana(Character.dexterity);
                        break;

                        case '2':
                            Character.weapon = weapon.Machadinha(Character.dexterity);
                        break;
                    }
                    
                    Armor armor = new Armor();
                    System.out.println("\n\n\tEscolha sua armadura\n\n1- Camisa do Vasco\n2- Comum");
                    
                    char ChoiseArmor = input.next().charAt(0);
                    input.nextLine();

                    switch(ChoiseArmor){
                        case '1':
                            Character.armor = armor.CamisaVasco(Character.constitution);
                        break;

                        case '2':
                            Character.armor = armor.Commum(Character.constitution);
                        break;
                    }
                    
                    System.out.println("\nCalculando vida...");
                    Character.HP(Character.constitution);
                    Thread.sleep(2000);
                    
                    System.out.print("\n\nEscolha o nome de seu personagem: ");
                    Character.name = input.next();
                    
                    Character.Informacoes();

                    System.out.println("\n\tIniciando Combate...");
                    Thread.sleep(3000);
                    
                    TutorialCombat();
                    System.out.println("\nPressione qualquer tecla para continuar");
                    choise = input.next().charAt(0);
                    input.nextLine();
                    Combat1();
                    break;
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
    private static void StandardCharacters() throws InterruptedException{
        Clean();
        PredefinedCharacters Standard = new PredefinedCharacters();
        Scanner input = new Scanner(System.in);
        
        char choise;
        System.out.println("\tSelecione um dos personagens a seguir\n\n");
        Standard.personagem1();
        Thread.sleep(1500);
        Standard.personagem2();
        Thread.sleep(1500);
        Standard.personagem3();
        Thread.sleep(1500);
        Standard.personagem4();
        System.out.println("Qual personagem você deseja escolher?");
        while(true){
            choise = input.next().charAt(0);
            input.nextLine();
            
            switch(choise){
                    case '1':
                        System.out.println("\nVocê selecionou o Personagem 1, pressione 1 para continuar ou 0 mudar a resposta: ");
                        choise = input.next().charAt(0);
                        input.nextLine();
                        
                        if(choise == '1'){
                            System.out.println("Iniciando combate...");
                            Thread.sleep(3000);
                            Combat1();
                        }
                        else if(choise != '0' && choise != '1'){
                            System.out.println("Valor inválido");
                            Thread.sleep(3000);
                        }
                    break;

                    case '2':
                        System.out.println("Você selecionou o Personagem 2, pressione 1 para continuar ou 0 mudar a resposta: ");
                        choise = input.next().charAt(0);
                        input.nextLine();
                        
                        if(choise == '1'){
                            System.out.println("Iniciando combate...");
                            Thread.sleep(3000);
                            Combat1();
                        }
                    break;
                    
                    case '3':
                        System.out.println("Você selecionou o Personagem 3, pressione 1 para continuar ou 0 mudar a resposta: ");
                        choise = input.next().charAt(0);
                        input.nextLine();
                        
                        if(choise == '1'){
                            System.out.println("Iniciando combate...");
                            Thread.sleep(3000);
                            Combat1();
                        }
                    break;
                    
                    case '4':
                        System.out.println("Você selecionou o Personagem 4, pressione 1 para continuar ou 0 mudar a resposta: ");
                        choise = input.next().charAt(0);
                        input.nextLine();
                        
                        if(choise == '1'){
                            System.out.println("Iniciando combate...");
                            Thread.sleep(3000);
                            Combat1();
                        }
                    break;

                    default:
                        System.out.println("Valor inválido");
                    break;
            }
        }
    }
    
    //Função para combate
    private static void Combat1(){
        Scanner input = new Scanner(System.in);
        Clean();
        
        System.out.println("Kombat 1...FIGHT");
        
        
        
    }
    
    private static void Combat2(){
        Clean();
        System.out.println("Kombat 2...FIGHT");    }
    
    private static void Combat3(){
        Clean();
        System.out.println("Final Kombat...FIGHT");
    }
    
    //lore do jogo
    private static void Lore(){
        Clean();
        System.out.println(" Em uma terra Nórdica, está acontecendo uma batalha entre reinos, onde o vencedor conquistara o controle das terras sagradas.\nUm guerreiro com vontade de lutar apostando sua vida aparece, e você será ele, não importa sua classe ou arma que irá empunhar,\no que importa é a sua dedicação no campo de batalha. O campo inimigo é composto por diversos guerreiros, de pequeno porte aos\nde maior poder, com grande machados, machadinhas, alabardas e katanas simples, os fortes dos fracos se diferenciam por sua aura,\ne quanto mais você matar, mais forte a sua aura ficara.");
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
        System.out.println("Tutorial Combate");
    }
    
    //Função para "limpar" o console
    private static void Clean(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
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
}