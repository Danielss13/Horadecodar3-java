package exe1;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = sc. nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = sc. nextDouble();

        while(valor2 <= 0){
            System.out.println("(ERRO) Digite o segundo valor maior que 0:");
            valor2 = sc. nextDouble();
     }
        System.out.println("O resultado da divisão entre valor 1 e valor 2 = " + valor1 / valor2);        
    }
}
