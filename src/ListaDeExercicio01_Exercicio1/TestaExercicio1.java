package ListaDeExercicio01_Exercicio1;

public class TestaExercicio1 {

    public static void main(String[] args) {

        Pais pais = new Pais("BRA", "Brasil", 8514876, 2400000.0);
        Pais pais2 = new Pais("WAK", "Wakanda", 4000500, 400000.0);


        System.out.println("Infomações do " + pais.getNome());
        System.out.println("Codigo ISO: " + pais.getCodigoISO());
        System.out.println("Dimensão km: 2" + pais.getDimensao());
        System.out.println("População: " + pais.getPopulacao());

        System.out.println("Infomações do " + pais2.getNome());
        System.out.println("Codigo ISO: " + pais2.getCodigoISO());
        System.out.println("Dimensão km2: " + pais2.getDimensao());
        System.out.println("População: " + pais2.getPopulacao());

        System.out.println("Os países são iguais? " + pais.verificaIgualdade(pais2));
        System.out.println("Os países são iguais? " + pais2.verificaIgualdade(pais));

        System.out.println("Densidade populacional de " + pais.getNome() + " é " + pais.calculaDensidadePopulacional());
        System.out.println("Densidade populacional de " + pais2.getNome() + " é " + pais2.calculaDensidadePopulacional());
    }

}