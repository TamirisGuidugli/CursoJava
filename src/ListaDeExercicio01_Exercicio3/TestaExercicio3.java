package ListaDeExercicio01_Exercicio3;
import java.time.LocalDate;

public class TestaExercicio3 {

    public static void main(String[] args) {

        Universidade universidade = new Universidade("USP");
        LocalDate data = LocalDate.parse("2000-01-01");

        Pessoa pessoa = new Pessoa("Maria", universidade, data);

        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Nome da univerdiade: " + pessoa.getnomeUniveridade());
        System.out.println("Data de ingresso: " + pessoa.getinicioUniversidade());
    }
}
   


