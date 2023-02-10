package estruturaFor;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite o último número: ");
        int ultimoNumero = sc.nextInt();

        if (primeiroNumero > ultimoNumero){
            System.out.println("Intervalo inválido!");
        }
        else {
            System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ": ");
        }

        for(int i = primeiroNumero;i <= ultimoNumero; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
    }
}