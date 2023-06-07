import java.util.Scanner;
public class Exercicio4 {
    /*
    Leia a idade de 20 pessoas e exiba a média das idades.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer soma = 0;
        double media;
        for (int i = 0; i < 20; i++) {
            System.out.println("Informe a idade da pessoa "+(i + 1)+":");
            Integer idade = scanner.nextInt();
            soma += idade;
        }
        media = soma / 20;
        System.out.printf("A média das idades informadas é: %.2f",media);


    }
}
