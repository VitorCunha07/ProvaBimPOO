// Interface Trabalhador
public interface Trabalhador {
    void trabalhar(); // Define uma tarefa para o trabalhador
    double receberSalario(); // Retorna o salário do trabalhador
}

// Interface Estudante
public interface Estudante {
    void estudar(); // Define uma tarefa de estudo
    int tirarNota(); // Retorna a nota obtida
    // Sobrecarga do método para aceitar um comentário adicional
    int tirarNota(String comentario); 
}
