import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        // Criando um objeto Contato
        Contato contato = new Contato();

        contato.inicializarContato("Joao Vitor", "joao@gmail.com", "(73) 98765-4321",
                LocalDate.of(2002, 12, 30));

        // Imprimindo os dados do contato
        System.out.println("Dados do Contato:");
        contato.imprimirContato();

        // Calculando e imprimindo a idade do contato
        int idade = contato.calcularIdade();
        System.out.println("Idade: " + idade + " anos");
    }
}
