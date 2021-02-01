package ListaDeExercicio01_Exercicio12;

import java.util.Scanner;

public class TestaExercicio12 {

    public static void main(String[] args) {


        Scanner diaSemana = new Scanner(System.in);
       // diaSemana.useDelimiter("\n");
        System.out.print("Digite um número entre 1 e 7:");
        int index = diaSemana.nextInt();

        System.out.println(DiaDaSemana.dia(index));
        
        diaSemana.close();
    }
}

