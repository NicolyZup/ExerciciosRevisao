//9. Crie um vetor capaz de armazenar 50 números inteiros.
// Em seguida faça o seu preenchimento automático com os números
// de 101 a 150, ou seja, na posição número 0 ponha 101, na posição
// 1 ponha o número 102, e assim sucessivamente. Em seguida exiba os
// valores deste vetor.

import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {
        List<Integer> numInteiros = new ArrayList<>(50);

        for(int i = 101; i <= 150; i++){
            numInteiros.add(i);
        }

        System.out.println(numInteiros);
    }
}
