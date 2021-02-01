package ListaDeExercicio01_Exercicio14;

public class NumeroPrimo {

    public static boolean IsPrimo(int numero) {

        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}
