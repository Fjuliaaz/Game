package br.senai.sp.jandira.model;

import br.senai.sp.jandira.Register;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String resposta1, resposta2;

        System.out.println("--------Cadastro dos Players----------");
        System.out.println("Deseja cadastrar enemy e players? (s/n)");
        resposta1 = teclado.next();

        if (resposta1.equals("s")){
            Register bothRegister = new Register();

            bothRegister.BothRegister();
        }else {
            System.out.println("Deseja cadastrar quem? (player/enemy) ");
            resposta2 = teclado.next();

            if (resposta2.equals("enemy")){
                Register enemyR = new Register();

                enemyR.EnemyRegister();
            }else if (resposta2.equals("player")){
                Register playerR = new Register();

                playerR.PlayerRegister();
            }
        }
    }
}


