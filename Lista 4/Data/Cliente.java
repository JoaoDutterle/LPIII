public class Cliente {
    private String nome;
    private Data dataNascimento;

    public Cliente(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dataNascimento = new Data(dia, mes, ano);
    }

    public String getNome() {
        return nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void imprimirCliente() {
        System.out.println("Nome: " + nome);
        System.out.print("Data de Nascimento: ");
        dataNascimento.imprimirData();
    }

    public static void main(String[] args) {
        // Criando um objeto Cliente com nome e data de nascimento
        Cliente cliente1 = new Cliente("Joao", 20, 11, 2001);
        // Imprimindo os dados do cliente
        cliente1.imprimirCliente();

        // Alterando a data de nascimento do cliente
        cliente1.getDataNascimento().setDia(30);
        cliente1.getDataNascimento().setMes(12);
        cliente1.getDataNascimento().setAno(2002);

        // Imprimindo os dados atualizados do cliente
        System.out.println("\nDados atualizados do cliente:");
        cliente1.imprimirCliente();

        // Verificando se a data de nascimento é válida
        if (cliente1.getDataNascimento().verificarData()) {
            System.out.println("\nA data de nascimento eh valida.");
        } else {
            System.out.println("\nA data de nascimento eh invalida.");
        }
    }
}
