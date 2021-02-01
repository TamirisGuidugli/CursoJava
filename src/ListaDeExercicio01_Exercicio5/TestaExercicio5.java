package ListaDeExercicio01_Exercicio5;

public class TestaExercicio5 {

    public static void main(String[] args) {


        Agenda minhaAgenda = new Agenda("Agenda da Maria");

        Contatos contato1 = new Contatos("Ana", "9999-1234", "ana@email.com");
        minhaAgenda.setContato(contato1);

        Contatos contato2 = new Contatos("Bia", "9999-1235", "bia@email.com");
        minhaAgenda.setContato(contato2);

        Contatos contato3 = new Contatos("Carol", "9999-1236", "carol@email.com");
        minhaAgenda.setContato(contato3);

        Contatos contato4 = new Contatos("Taty", "9999-1237", "taty@email.com");
        minhaAgenda.setContato(contato4);

        System.out.println("Nome da Agenda: " + minhaAgenda.getNome());
        System.out.println("Contatos: " + minhaAgenda.getContatos());

    }

}
