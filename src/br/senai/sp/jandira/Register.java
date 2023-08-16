
package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Output;

import java.util.Locale;
import java.util.Scanner;

public class Register {

    int validaPrint = 0;

    /* Instancia Scanner*/
    Scanner teclado = new Scanner(System.in);

    /*Instancia player */
    Player player = new Player();

    /*Instancia enemy */
    Enemy enemy = new Enemy();

    /* Instancia Output **/

    Output output = new Output();

    public void BothRegister() {

        validaPrint = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);

    }

    public void PlayerRegister() {
        System.out.println("-------------Cadastro Player---------------");
        System.out.print("Qual o seu nome: ");
        player.nome = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        player.skin = teclado.nextLine();
        System.out.println("----------Cadastro Realizado---------------");

        /** Printa as informações Cadastrada */
        if (validaPrint != 1) {
            output.PrintPlayer(player);

        }
    }
        public void EnemyRegister() {
            System.out.println("-------------Cadastro Enemy---------------");
            System.out.print("Qual o seu nome: ");
            enemy.nome = teclado.nextLine();
            System.out.print("Escolha sua skin (red - green - blue): ");
            enemy.skin = teclado.nextLine();
            System.out.println("----------Cadastro Realizado---------------");

            /** Printa as informações Cadastrada */
            if (validaPrint != 1) {
                output.PrintEnemy(enemy);
            }
        }
            public void Decision() {
                String decision;
                System.out.println("SEJA BEM VINDO !!! ");
                System.out.println("DESEJA CADASTRAR [ Player - Enemy - Ambos ]");
                decision = teclado.nextLine();

                switch (decision.toLowerCase(Locale.ROOT)) {

                    case "Player":
                        PlayerRegister();
                        break;
                    case "Enemy":
                        EnemyRegister();
                        break;
                    case "Ambos":
                        BothRegister();

                        System.out.println("Deseja Retornar ao Cadastro? ");
                        int continuar = teclado.nextInt();

                        if(continuar==1){
                            Decision();
                        }
                }
            }
        }
