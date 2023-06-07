//2. Faça um algoritmo que leia uma variável e some 5 caso
// seja par ou some 8 caso seja ímpar, imprimir o resultado
// desta operação

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Informe um número:");
        int numInformado = entrada.nextInt();

        if(numInformado%2==0){
            resultado = numInformado + 5;
            System.out.println("O número informado é par e foi somado + 5: "+resultado);
        } else {
            resultado = numInformado + 8;
            System.out.println("O número informado é ímpar e foi somado + 8: "+resultado);
        }
    }
}
