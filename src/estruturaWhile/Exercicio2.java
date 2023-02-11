package estruturaWhile;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = 0;
        int sexo = 0;
        int categoria = 0;
        char resp = 's';
        int pessoasBack = 0;
        int mulheresFront = 0;
        int mulheresFront30 = 0;
        int homensMobile40 = 0;


        while(resp == 's') {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.print("Digite o sexo: ");
            sexo = sc.nextInt();

            System.out.print("Digite a categoria: ");
            categoria = sc.nextInt();

            if (categoria == 1) {
                pessoasBack ++;
            }
            else if(sexo == 2){
                if (categoria == 2){
                    mulheresFront ++;
                }
                else if (categoria == 4){
                    if (idade < 30) {
                        mulheresFront30++;
                    }
                }
            }
            else if (sexo == 1) {
                if (categoria == 3) {
                    if (idade > 40) {
                        homensMobile40 ++;
                    }
                }
            }

            System.out.print("Deseja continuar (S/N): ");
            resp = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoasBack);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + mulheresFront);
        System.out.println( "Total de homens desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
        System.out.print("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresFront30);
    }
}