package estruturaWhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma idade: ");
        int idade = sc.nextInt();

        int maioresQue21 = 0;
        int maioresQue50 = 0;

        while(idade > 0){
            if (idade < 21) {
                maioresQue21 ++;
            } else if (idade > 50) {
               maioresQue50 ++;
            }
            System.out.print("Digite uma idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + maioresQue21);

        System.out.println("Total de pessoas maiores de 50 anos: " + maioresQue50);
    }
}