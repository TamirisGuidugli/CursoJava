package ListaDeExercicio01_Exercicio12;

public class DiaDaSemana {

    public static String dia(int a) {

        return switch (a) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado-feira";
            default -> "Erro";
        };

    }
}
