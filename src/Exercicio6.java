import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    /*
    Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma
    desses números. Encerre a execução quando um número negativo for digitado.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        Integer numero;
        Integer soma = 0;

        do {
            System.out.println("Informe um número:");
            numero = scanner.nextInt();
            if(numero >= 0){
                numeros.add(numero);
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("**************************************");
        System.out.println("Os números positivos inseridos foram:");
        System.out.println(numeros);
        System.out.println("A soma dos números positivos é "+soma);
        System.out.println("**************************************");

    }
    }

