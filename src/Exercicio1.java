import java.util.Scanner;

public class Exercicio1 {
    /*
    Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá
    se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um dos
    cálculos deve-se atribuir o resultado para uma variável C e mostrar seu conteúdo na tela.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número A:");
        Integer numeroA = scanner.nextInt();

        System.out.println("Informe o número B:");
        Integer numeroB = scanner.nextInt();

        Integer numeroC;

        if (numeroA.equals(numeroB)) {
            numeroC = numeroA + numeroB;
        } else {
            numeroC = numeroA * numeroB;
        }

        System.out.println("O valor da variável C é "+ numeroC);
    }
}
