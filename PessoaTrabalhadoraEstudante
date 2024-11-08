public class PessoaTrabalhadoraEstudante extends Pessoa implements Trabalhador, Estudante {
    private double salario;
    private int nota;

    // Construtor
    public PessoaTrabalhadoraEstudante(String nome, int idade, double salario) {
        super(nome, idade); // Chama o construtor da classe Pessoa
        this.salario = salario;
    }

    // Implementação do método de Trabalhador
    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando.");
    }

    @Override
    public double receberSalario() {
        System.out.println(getNome() + " recebe um salário de R$ " + salario);
        return salario;
    }

    // Implementação do método de Estudante
    @Override
    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override
    public int tirarNota() {
        // Vamos supor que a nota seja gerada aleatoriamente para fins de exemplo
        nota = (int) (Math.random() * 10) + 1; // Gera uma nota entre 1 e 10
        System.out.println(getNome() + " tirou a nota: " + nota);
        return nota;
    }

    @Override
    public int tirarNota(String comentario) {
        nota = (int) (Math.random() * 10) + 1; // Gera uma nota entre 1 e 10
        System.out.println(getNome() + " tirou a nota: " + nota + ". Comentário: " + comentario);
        return nota;
    }

    // Método para mostrar os detalhes da pessoa
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
    }
}
