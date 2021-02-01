package ListaDeExercicio01_Exercicio1;

public class TestaExercicio1 {

    public static void main(String[] args) {

        Pais pais = new Pais("BRA", "Brasil", 8514876, 2400000.0);
        Pais pais2 = new Pais("WAK", "Wakanda", 4000500, 400000.0);


        System.out.println("Infoma��es do " + pais.getNome());
        System.out.println("Codigo ISO: " + pais.getCodigoISO());
        System.out.println("Dimens�o km: 2" + pais.getDimensao());
        System.out.println("Popula��o: " + pais.getPopulacao());

        System.out.println("Infoma��es do " + pais2.getNome());
        System.out.println("Codigo ISO: " + pais2.getCodigoISO());
        System.out.println("Dimens�o km2: " + pais2.getDimensao());
        System.out.println("Popula��o: " + pais2.getPopulacao());

        System.out.println("Os pa�ses s�o iguais? " + pais.verificaIgualdade(pais2));
        System.out.println("Os pa�ses s�o iguais? " + pais2.verificaIgualdade(pais));

        System.out.println("Densidade populacional de " + pais.getNome() + " � " + pais.calculaDensidadePopulacional());
        System.out.println("Densidade populacional de " + pais2.getNome() + " � " + pais2.calculaDensidadePopulacional());
    }

}