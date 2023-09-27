package com.mycompany.game;

//Identificar o IO
import java.util.Scanner;
//Valor Aleatório
import java.util.Random;
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
                        //StandardCharacters();
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

                        Character.nivelJogador = 0;
                        while(Character.hp > 0) {
                            Enemies enemies = gerarAdversarioAleatorio(Character.nivelJogador);
                            Combat(Character, enemies);
                            if (Character.hp <= 0) {
                                System.out.println("FALECEU, foi pro inferno.");
                                System.exit(0);
                                break;
                            }
                            else
                            {
                                Character.nivelJogador++;
                            }
                            if (Character.nivelJogador == 3 && Character.hp > 0) {
                                System.out.println("Você venceu o jogo! Parabéns!\n");
                                System.exit(0);
                                break;
                            }
                        }
                    break;
                }
                else{
                    System.out.println("Você ultrapassou o limite de atributos, refaça");
                    Thread.sleep(2000);
                }
            }
            
           }
        }
    }
    
    //Função para os personagens padrões
    /*private static void StandardCharacters() throws InterruptedException{
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
                            Combat1Predefined();
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
    }*/
    
    //Função para combate
    private static void Combat(CustomCharacter Character, Enemies enemies){
        Scanner input = new Scanner(System.in);
        Clean();
        
        System.out.println("Kombat 1...FIGHT");
        
        int rodada = 1;
        input.nextLine();
        
        while (rodada > 4) {
            System.out.println("Rodada " + rodada + "\n");
            int agilidadeJogador = Character.getAgility();
            int agilidadeAdversario = enemies.agility;

            if (agilidadeJogador > agilidadeAdversario) {
                turnoJogador(Character, enemies, input);
                if (enemies.hp <= 0) {
                    System.out.println("Você venceu o combate contra " + enemies.name + "!");
                    System.out.println("");
                    break;
                }

                turnoAdversario(Character, enemies, input);
                if (Character.getHP() <= 0) {
                    System.out.println(enemies.name + "Você morreu! Bem Vindo a Helheim");
                    
                    break;
                }
            } else {
                turnoAdversario(Character, enemies, input);
                if (Character.getHP() <= 0) {
                    System.out.println(enemies.name + "Você morreu! Bem Vindo a Helheim");
                    break;
                }

                turnoJogador(Character, enemies, input);
                if (enemies.hp <= 0) {
                    System.out.println("Você venceu o combate contra " + enemies.name + "!");
                    System.out.println("Pressione Enter para continuar...\n");
                    input.nextLine();
                    break;
                }
            }

            rodada++;
        }
    }
    
    //lore do jogo
    private static void Lore(){
        Clean();
        System.out.println(" Em uma terra Nórdica, está acontecendo uma batalha entre reinos, onde o vencedor conquistara o controle das terras sagradas.\nUm guerreiro com vontade de lutar apostando sua vida aparece, e você será ele, não importa sua classe ou arma que irá empunhar,\no que importa é a sua dedicação no campo de batalha. O campo inimigo é composto por diversos guerreiros, de pequeno porte aos\nde maior poder, com grande machados, machadinhas, alabardas e katanas simples, os fortes dos fracos se diferenciam por sua aura,\ne quanto mais você matar, mais forte a sua aura ficara.");
    }
    
    //Funções de tutoriais
    private static void TutorialCustom(){
        Clean();
         System.out.println("Como você decidiu utilizar um personagem customizado, agora explicarei como funcionara:\n Escolhera seu nome, e terá 15 pontos para dividir entre seus respectivos atributos, força, destreza, constituiçao, agilidade\nconstituição, sua força será importante para armas pesadas, sua destreza para armas leves, agilidade para atacar mais rápido e\nconstituição influenciara na sua vida,voçe ira jogar 3d6 para descobrir sua vida e adicionará mais a sua constituição, depois\nescolherá sua arma e armadura, e então estará pronto para o combate.");
    }
    
    private static void TutorialCombat(){
        System.out.println("Como você decidiu utilizar um personagem customizado, agora explicarei como funcionara:\n Escolhera seu nome, e terá 15 pontos para dividir entre seus respectivos atributos, força, destreza, constituiçao, agilidade\nconstituição, sua força será importante para armas pesadas, sua destreza para armas leves, agilidade para atacar mais rápido e\nconstituição influenciara na sua vida,voçe ira jogar 3d6 para descobrir sua vida e adicionará mais a sua constituição, depois\nescolherá sua arma e armadura, e então estará pronto para o combate.");
    }
    
    //Função para "limpar" o console
    private static void Clean(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        
        char choise;
        
        while(true){
            System.out.println("\t1- Start\n\t2- History\n\t3-Exit");
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

    //Turno do Jogador
    private static void turnoJogador(CustomCharacter Character, Enemies enemies, Scanner input){
        System.out.println("Agora é sua vez, o que deseja fazer?");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");

        int escolha = input.nextInt();
        input.nextLine();

        switch (escolha) {

            case 1:
                int danoCausado = Math.max(0, (int)Character.weapon - enemies.defense);
                if (danoCausado > 0) {
                    enemies.hp -= (int)Character.weapon;
                    System.out.println("Você causou " + Character.weapon + " de dano em " + enemies.name + "!");
                } else {
                    System.out.println(enemies.name + " se defendeu completamente!");
                }
                break;

            case 2:
                Character.DoubleDefense = true;
                System.out.println("Você está defendendo. Sua defesa dobrou por uma rodada.");
                break;

            default:
                System.out.println("Ação inválida. Tente novamente.");
        }

        if (Character.DoubleDefense) {
            Character.DoubleDefense = false;
        }
}
    
    //Turno do Adversário
    private static void turnoAdversario(CustomCharacter Character, Enemies enemies, Scanner input) {
        Random random = new Random();
        int escolha = random.nextInt(3);
        input.nextLine();
        
        switch (escolha) {

            case 0:
                int danoCausado = Math.max(0, enemies.damage - (int)Character.armor);
                if (danoCausado > 0) {
                    Character.hp -= danoCausado;
                    System.out.println(enemies.name + " causou " + danoCausado + " de dano em você!");
                } else {
                    System.out.println("Você se defendeu completamente contra o ataque de " + enemies.name + "!");
                }
                break;

            case 1:
                enemies.DoubleDefense = true;
                System.out.println(enemies.name + " está defendendo. Sua defesa dobrou por uma rodada.");
                break;
        }

        if (enemies.DoubleDefense) {
            enemies.DoubleDefense = false;
        }
}
   
    //Adversário Aleatório
    private static Enemies gerarAdversarioAleatorio(int nivel){
    
        Random random = new Random();
        int escolha = random.nextInt(3);
        int escolha2 = random.nextInt(2);
        int escolha3 = random.nextInt(1);
        
        if(nivel==0){
            
            return switch (escolha) {
                case 0 -> new Enemies("Goblin Ladrão", 40, 16, 3, 2);
                case 1 -> new Enemies("Diabrete", 30, 12, 2, 3);
                case 2 -> new Enemies("Orc", 50, 20, 4, 1);
                default -> new Enemies("Inimigo Aleatório", 25, 14, 3, 2);
            };
            
        }
        
        if(nivel==1){
            
            return switch (escolha2) {
                case 0 -> new Enemies("Orc Guerreiro", 60, 16, 5, 4);
                case 1 -> new Enemies("Demonio Corruptor", 70, 15, 14, 3);
                default -> new Enemies("Inimigo Aleatório", 25, 14, 3, 2);
            };
            
        }
        
        if(nivel==2){
            
            return switch (escolha3) {
                case 0 -> new Enemies("Cavaleiro Infernal", 90, 40, 12, 10);
                default -> new Enemies("Cavaleiro Infernal", 90, 40, 12, 10);
            };
            
        }
        return null;
        
    }  
    
    //Dado de 6 lados
    private static int rolarD6() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}