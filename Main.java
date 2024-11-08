public class Main {
    public static void main(String[] args) {
        try {
            // Testando com dados válidos
            PessoaTrabalhadoraEstudante pessoa1 = new PessoaTrabalhadoraEstudante("Carlos", 25, 2500.0);
            pessoa1.mostrarDetalhes();
            pessoa1.trabalhar();
            pessoa1.receberSalario();
            pessoa1.estudar();
            pessoa1.tirarNota();
            pessoa1.tirarNota("Excelente desempenho!");

            // Testando com dados inválidos
            try {
                PessoaTrabalhadoraEstudante pessoa2 = new PessoaTrabalhadoraEstudante("Jo", 20, 1500.0); // Nome inválido
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar pessoa 2: " + e.getMessage());
            }

            try {
                PessoaTrabalhadoraEstudante pessoa3 = new PessoaTrabalhadoraEstudante("Ana", -5, 1800.0); // Idade inválida
            } catch (IllegalArgumentException e) {
                System.out.println("Erro ao criar pessoa 3: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
