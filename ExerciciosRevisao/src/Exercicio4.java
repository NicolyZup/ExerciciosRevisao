//4. Leia a idade de 20 pessoas e exiba a média das idades

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaIdades = 0;

        for(int i=1; i <= 20; i++){
            System.out.println("Informa a idade da "+i+"ª pessoa:");
            int idade = entrada.nextInt();
            somaIdades+=idade;
        }

        System.out.println("A média das idades informadas é: " +somaIdades/20);
    }
}
