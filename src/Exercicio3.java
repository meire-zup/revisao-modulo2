import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    /*
    Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações
    e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a fórmula:
    MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
    A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas,
    a média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o conceito
    for A, B ou C, e 'Reprovado' se o conceito for D ou E.
    Média de aproveitamento Conceito
    >= 90 A
    >= 75 e < 90 B
    >= 60 e < 75 C
    >= 40 e < 60 D
    < 40 E
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu número de identificação (4 dígitos de 0 a 9):");
        int numeroDeIdentificacao = scanner.nextInt();

        List<Double> notas = new ArrayList<>();
        double multiplicacaoNotas;
        double somaMultiplicacaoNotas = 0;
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Informe o valor da sua nota "+(i + 1)+" :");
            double nota = scanner.nextDouble();
            notas.add(nota);
            multiplicacaoNotas = nota * (i + 1);
            somaMultiplicacaoNotas += multiplicacaoNotas;
        }

        System.out.println("Informe a sua média dos exercícios:");
        Double mediaDosExercicios = scanner.nextDouble();
        Double mediaDeAproveitamento = (somaMultiplicacaoNotas + mediaDosExercicios) / 7;
        System.out.println(mediaDeAproveitamento);
        Character conceito;
        String foiAprovacao = "APROVADO";
        if(mediaDeAproveitamento >= 9) {
            conceito = 'A';
        } else if (mediaDeAproveitamento < 9 && mediaDeAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaDeAproveitamento < 7.5 && mediaDeAproveitamento >= 6) {
            conceito = 'C';
        } else if (mediaDeAproveitamento < 6 && mediaDeAproveitamento >= 4) {
            conceito = 'D';
            foiAprovacao = "REPROVADO";
        } else {
            conceito = 'E';
            foiAprovacao = "REPROVADO";
        }

        System.out.println("NÚMERO DE INDENTIFICAÇÃO: "+numeroDeIdentificacao);
        System.out.println("NOTAS: "+notas);
        System.out.printf("MÉDIA DOS EXERCÍCIOS: %.2f\n", mediaDosExercicios);
        System.out.printf("MÉDIA DO APROVEITAMENTO: %.2f\n", mediaDeAproveitamento);
        System.out.println("CONCEITO: "+conceito);
        System.out.println("SITUAÇÃO FINAL:"+foiAprovacao);
    }
}
