//6. Escreva um algoritmo que leia uma sequência de números do usuário e
// realize a soma desses números. Encerre a execução quando um número negativo
// for digitado.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        boolean fazerSoma = true;
        double soma = 0;

        while (fazerSoma){
            System.out.println("Digite um número:");
            double numInformado = entrada.nextDouble();

            if(numInformado > 0){
                soma+=numInformado;
            } else {
                System.out.println("Número negativo digitado, operação interrompida.");
                fazerSoma = false;
            }
        }

        System.out.println("A soma dos números positivos informados é: "+soma);
    }
}
