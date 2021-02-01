package ListaDeExercicio01_Exercicio5;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contatos> contatosList;
    private String nome;

    public Agenda(String nome) {
        this.nome = nome;
        this.contatosList = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setContato(Contatos contato) {

        this.contatosList.add(contato);
    }

    public String getContatos() {

        StringBuilder contatos = new StringBuilder();

        for (Contatos contato : this.contatosList) {
            contatos.append(contato.toString()).append("\n");
        }

        return contatos.toString();
    }

}
