package exe5;

import java.util.Scanner;

public class exe5 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        float soma = 0f;
        float quantidade = 0f;
        System.out.println("Programa para calcular a média aritmética.");
        System.out.println("Insira o valor inicial: ");
        int numero1 = sc.nextInt();
        System.out.println("Insira o valor final: ");
        int numero2 = sc.nextInt();
        for (float i = numero1; i <= numero2; i++) {
            soma += i;
            quantidade += 1;
        }
        float media = soma / quantidade;
        System.out.println("Quantidade de números entre " + numero1 + " e " + numero2 + " é: " + quantidade);
        System.out.println("Valor total:" + soma);
        System.out.println("Média aritmética: " + media);
    }

}