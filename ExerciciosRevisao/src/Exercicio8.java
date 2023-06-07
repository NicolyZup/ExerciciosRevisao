// 8. Leia um conjunto de salários, sendo que para terminar a entrada
// será fornecido o valor -1. Após toda a entrada ter sido realizada,
// leia o valor de um reajuste. Em seguida exiba todos os salários já
// reajustados

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Double> salarios = new ArrayList<>();
        List<Double> salariosReajustados = new ArrayList<>();

        boolean continuar = true;

        while (continuar){
            System.out.println("Informe o salário:");
            double salario = entrada.nextDouble();

            if(salario >0){
                salarios.add(salario);
            } else {
                continuar = false;
            }
        }

        System.out.println("Informe a porcentagem de reajuste:");
        double porcentagem = entrada.nextDouble();
        double reajuste = porcentagem/100;

        for(int i =0; i<salarios.size();i++){
            double aumento = salarios.get(i)*reajuste;
            double salarioAtual = salarios.get(i)+aumento;
            salariosReajustados.add(salarioAtual);
        }

        System.out.println("Salários anteriores: " + salarios);
        System.out.println("Salários reajustados: " + salariosReajustados);
    }
}
