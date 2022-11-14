package exe4;

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float soma = 0;
        float quantidade = 0;
        for (float i = 15; i <= 100; i++) {
            soma += i;
            quantidade += 1;
        }
        
       float media = soma / quantidade;
        System.out.println("Quantidade de números entre 15 e 100: " + quantidade);
        System.out.println("Valor total:" + soma);
        System.out.println("Média aritmética: " + media);
    }

}