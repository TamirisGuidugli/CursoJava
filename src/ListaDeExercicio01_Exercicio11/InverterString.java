package ListaDeExercicio01_Exercicio11;

public class InverterString {

    public static String inverter(String a) {
        StringBuilder inversa = new StringBuilder();

        int tamanho = a.length()-1;
        for (int i = tamanho; i >= 0; i=i-1) {
            Character c = a.charAt(i);
            inversa.append(c);
        }

        return inversa.toString();
    }

}
