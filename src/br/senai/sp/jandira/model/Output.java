package br.senai.sp.jandira.model;

public class Output {

    public void PrintPlayer(Player player1) {

        /** Printar Informações */
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("-------------Player-----------");
        System.out.println("O nome do Player é: " + player1.nome);
        System.out.println("A skin do seu player é: " + player1.skin);
        System.out.println("A vida do seu Player é: " + player1.getLife());
        System.out.println("------------------------------");
        System.out.println("---------------------------------------------");


    }
    public void PrintEnemy(Enemy enemy) {

        /** Printar Informações */
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("-------------Player-----------");
        System.out.println("O nome do Player é: " + enemy.nome);
        System.out.println("A skin do seu player é: " + enemy.skin);
        System.out.println("A vida do seu Player é: " + enemy.getLife());
        System.out.println("------------------------------");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-");


    }
}

