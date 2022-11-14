package exe6;

import java.util.Scanner;

public class exe6 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        

        do {
            System.out.println("Informe a primeira nota: ");
            float nota1 = sc.nextFloat();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Informe um valor entre 0 e 10.");
                nota1 = sc.nextFloat();
            }
            System.out.println("Informe a segunda nota: ");
            float nota2 = sc.nextFloat();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Valor inválido! Informe um valor entre 0 e 10.");
                nota2 = sc.nextFloat();
            }
            float media = (nota1 + nota2) / 2;
            if (media >= 9.5){
                System.out.println("Aprovado! Sua média é: " + media);
            } else {
                System.out.println("Reprovado. Sua média é: " + media);
            }
    
    }
}