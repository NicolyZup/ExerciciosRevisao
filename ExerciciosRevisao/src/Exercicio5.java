//5. Faça um algoritmo que leia 20 números e, ao final,
// escreva quantos estão entre 0 e 100.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        List<Double> numInformados = new ArrayList<>();
        List<Double> entre0e100 =  new ArrayList<>();
        int contador = 0;

        for(int i =1; i<=20;i++){
            System.out.println("Informa o "+i+"º número:");
            double num = entrada.nextDouble();
            numInformados.add(num);

            if(num > 0 && num < 100){
                entre0e100.add(num);
                contador +=1;
            }
        }
        System.out.println("Seus números informados: "+numInformados);
        System.out.println("Quantidades de números entre 0 e 100: "+contador);
        System.out.println("Números informados entre 0 e 100:" +entre0e100);

    }
}
