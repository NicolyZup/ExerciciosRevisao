// 1. Faça um algoritmo que leia dois valores inteiros A e B
// se os valores forem iguais deverá se somar os dois, caso
// contrário multiplique A por B. Ao final de qualquer um dos
// cálculos deve-se atribuir o resultado para uma variável C e
// mostrar seu conteúdo na tela

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int c = 0;

        System.out.println("Digite o primeiro valor:");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        int b = entrada.nextInt();

        if(a == b){
            c = a + b;
            System.out.println("A soma dos valores "+a+" e "+b+" é: "+c);
        } else {
            c = a * b;
            System.out.println("A multiplicação dos valores "+a+" e "+b+" é: "+c);
        }
    }
}
