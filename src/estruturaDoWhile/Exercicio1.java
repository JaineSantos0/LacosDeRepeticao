package estruturaDoWhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int somaNumeros = 0;

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero > 0) {
                somaNumeros += numero;
            }
        } while (numero != 0);
        System.out.println("A soma dos números positivos é: " + somaNumeros);
        }
    }