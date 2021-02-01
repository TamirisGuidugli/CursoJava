package ListaDeExercicio01_Exercicio3;
import java.time.LocalDate;

public class Pessoa {

    //Propriedades

    private String nome;
    private Universidade universidade;
    private LocalDate inicioUniversidade;

    public Pessoa(String nome, Universidade universidade , LocalDate inicioUniversidade) {
        this.nome = nome;
        this.universidade = universidade;
        this.inicioUniversidade = inicioUniversidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnomeUniveridade() {
        return universidade.getNome();
    }

    public LocalDate getinicioUniversidade() {
        return inicioUniversidade;
    }

    public void setinicioUniversidade(LocalDate inicioUniversidade) {
        this.inicioUniversidade = inicioUniversidade;
    }


}
