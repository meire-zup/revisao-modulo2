public class Exercicio9 {
    /*
    Crie um vetor capaz de armazenar 50 números inteiros. Em seguida faça o seu
    preenchimento automático com os números de 101 a 150, ou seja, na posição
    número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente.
    Em seguida exiba os valores deste vetor.
     */
    public static void main(String[] args) {

        int[] numerosInteiros = new int[50];

        int numero = 101;

        for (int i = 0; i < numerosInteiros.length; i++) {

            numerosInteiros[i] = numero;
            numero++;
        }

        for (int i = 0; i < numerosInteiros.length ; i++) {

            System.out.println(numerosInteiros[i]);
        }
    }
}
