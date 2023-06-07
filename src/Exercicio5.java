import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    /*
    Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.println("Informe o "+(i+1)+"º número:");
            Integer numero = scanner.nextInt();
            if (numero >= 0  && numero <= 100) {
                numeros.add(numero);
            }
        }
        System.out.println("*****************************************************");
        System.out.println("Os números informados que estão entre 0 e 100 são:");
        System.out.println(numeros);
        System.out.println("*****************************************************");

    }
}
