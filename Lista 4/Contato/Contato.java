import java.time.LocalDate;
import java.time.Period;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;

    // Construtor
    public Contato() {
        // Inicializa os atributos com valores padrão
        this.nome = "";
        this.email = "";
        this.telefone = "";
        this.dataNascimento = null;
    }

    // Método para inicializar os atributos do contato
    public void inicializarContato(String nome, String email, String telefone, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    // Métodos set/get para os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Método para imprimir os dados do contato
    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    // Método para calcular a idade do contato com base na data de nascimento
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }
}
