import java.util.Scanner;

public class Exercicio2 {
    /*
    Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso
    seja ímpar, imprimir o resultado desta operação.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        Integer numero = scanner.nextInt();

        Boolean ePar;

        Integer numeroAdicionado = 0;

        if(numero % 2 == 0){
            numeroAdicionado = 5;
            ePar = true;

        } else {
            numeroAdicionado = 8;
            ePar = false;
        }

        Integer resultado = numero + numeroAdicionado;

        System.out.println("*************************");
        System.out.println("NÚMERO DIGITADO: "+numero);
        System.out.println("O NÚMERO É PAR: "+ePar);
        System.out.println("RESULTADO: "+ resultado);
        System.out.println("*************************");

    }
}
