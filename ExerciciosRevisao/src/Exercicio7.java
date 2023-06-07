//7. Leia o nome do usuário e um número N, após isso escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = entrada.next();

        System.out.println("Informe um número acima de 0:");
        int num= entrada.nextInt();

        for(int i = 0; i <num;i++){
            System.out.println(nome);
        }
    }
}
