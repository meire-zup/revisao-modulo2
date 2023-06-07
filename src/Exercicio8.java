import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    /*
    Leia um conjunto de salários, sendo que para terminar a entrada será fornecido
    o valor -1. Após toda a entrada ter sido realizada, leia o valor de um reajuste.
    Em seguida exiba todos os salários já reajustados.

     */
    public static void main(String[] args) {

        double salario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Após informar todos os salários dos funcionários digite -1 para sair.");

        List<Double> salarios = new ArrayList<>();
        List<Double> salariosReajustados = new ArrayList<>();


        do {
            System.out.println("Informe o salário:");
            salario = scanner.nextDouble();
            if(salario != -1) {
                salarios.add(salario);
            }
        } while (salario != -1);

        System.out.println("Informe o valor de reajuste que será aplicado (em %):");
        Double reajuste = scanner.nextDouble();
        for (Double sal : salarios) {
            Double salarioReajustado = (1+(reajuste/100)) * sal;
            salariosReajustados.add(salarioReajustado);
        }
        System.out.println("************************");
        System.out.println("SALÁRIOS INSERIDOS:");
        System.out.println(salarios);
        System.out.println("SALÁRIOS REAJUSTADOS:");
        System.out.println(salariosReajustados);
        System.out.println("*************************");

    }
}
