package ListaDeExercicio01_Exercicio11;

import java.util.Scanner;

public class TestaExercicio11 {

    public static void main(String[] args) {

        Scanner palavra = new Scanner(System.in);
        palavra.useDelimiter("\n");
        System.out.print("Digite uma palavra:");
        String index = palavra.nextLine();

        System.out.println(InverterString.inverter(index));
        
        palavra.close();
    }
}