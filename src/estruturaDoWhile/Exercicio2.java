package estruturaDoWhile;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        float soma = 0;
        int quantidadeNumeros = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero % 3 == 0) {
                soma += numero;
                if (numero != 0) {
                    quantidadeNumeros++;
                }
            }
        } while (numero != 0);

        float media = soma / quantidadeNumeros;
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
    }
}