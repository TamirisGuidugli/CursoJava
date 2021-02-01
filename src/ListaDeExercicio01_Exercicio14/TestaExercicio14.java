package ListaDeExercicio01_Exercicio14;

import java.util.Scanner;

public class TestaExercicio14 {

    public static void main(String[] args) {

        Scanner numeroPrimo = new Scanner(System.in);
       // numeroPrimo.useDelimiter("\n");
        System.out.print("Digite um número:");
        int index = numeroPrimo.nextInt();

        Boolean flag = NumeroPrimo.IsPrimo(index);

        if (flag==Boolean.TRUE) {
            System.out.println("O número " +index + " é primo");
        }else{
            System.out.println("O número " +index + " não é primo");
        }
        
        numeroPrimo.close();
        
    }


}


