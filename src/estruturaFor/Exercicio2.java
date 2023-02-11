package estruturaFor;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int i = 1; i <=10;i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                quantidadePares ++;
            } else {
                quantidadeImpares ++;
            }
        }

        System.out.println("Total de números pares: " + quantidadePares);
        System.out.println("Total de números ímpares: " + quantidadeImpares);
    }
}