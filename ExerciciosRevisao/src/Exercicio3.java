//3. Escreva um algoritmo que leia o número de identificação, as 3
// notas obtidas por um aluno nas 3 verificações e a média dos exercícios
// que fazem parte da avaliação, e calcule a média de aproveitamento, usando
// a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
//A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever
// o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento,
// o conceito correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e
// 'Reprovado' se o conceito for D ou E.
//Média de aproveitamento Conceito
//>= 90 A
//>= 75 e < 90 B
//>= 60 e < 75 C
//>= 40 e < 60 D
//< 40 E

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[] notas = new double[3];

        System.out.println("Informe seu número de identificação:");
        int identificacao = entrada.nextInt();;

        for(int i =1; i <=3; i++){
            System.out.println("Informa sua "+i+"ª nota:");
            double nota = entrada.nextInt();
            notas[i-1] = nota;
        }

        System.out.println("Informe sua média dos exercícios:");
        double mediaExercicios = entrada.nextDouble();

        double mediaAproveitamento = (notas[0] + notas[1] * 2 + notas[2] * 3 + mediaExercicios)/7;

        String conceito = "";
        String condicao ="";

        if(mediaAproveitamento >= 90){
            conceito = "A";
            condicao = "Aprovado";
        } else if (mediaAproveitamento >= 75) {
            conceito = "B";
            condicao = "Aprovado";
        } else if (mediaAproveitamento >= 60) {
            conceito = "C";
            condicao = "Aprovado";
        } else if (mediaAproveitamento >= 40) {
            conceito = "D";
            condicao = "Reprovado";
        } else {
            conceito = "E";
            condicao = "Reprovado";
        }

        System.out.println("Identificação do aluno: "+identificacao);
        System.out.println(Arrays.toString(notas));
        System.out.println("Média dos exercícios: "+mediaExercicios);
        System.out.printf("Média de aproveitamento: %.2f \r\n",mediaAproveitamento);
        System.out.println("Conceito: "+conceito);
        System.out.println("Condição: "+condicao);
    }
}
