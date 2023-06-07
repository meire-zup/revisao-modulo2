import java.util.Scanner;

public class Exercicio7 {
    /*
    Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes
     */
    public static void main(String[] args) {

        Scanner scannerNumeros = new Scanner(System.in);
        Scanner scannerTexto = new Scanner(System.in);
        System.out.println("Informe a quantidade de vezes que quer ver seu nome no console:");
        Integer quantidade = scannerNumeros.nextInt();
        System.out.println("Informe o seu nome:");
        String nome = scannerTexto.nextLine();
        System.out.println("************************");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(nome);
        }
        System.out.println("************************");

    }
}
