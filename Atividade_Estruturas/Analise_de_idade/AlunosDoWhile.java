import javax.swing.JOptionPane;

public class AlunosDoWhile {
    public static void main(String[] args) {
        int totalAlunos = 20;
        int contador = 0;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int somaIdades = 0;
        
        do {
            String input = JOptionPane.showInputDialog("Digite a idade do aluno " + (contador + 1) + ":");
            int idade = Integer.parseInt(input);
            
            if (idade < menorIdade) menorIdade = idade;
            if (idade > maiorIdade) maiorIdade = idade;
            
            somaIdades += idade;
            contador++;
        } while (contador < totalAlunos);
        
        double media = (double) somaIdades / totalAlunos;
        
        String resultado = "Estatisticas dos Alunos:\n" +
                           "Menor idade lida: " + menorIdade + " anos\n" +
                           "Maior idade lida: " + maiorIdade + " anos\n" +
                           "Media das idades: " + String.format("%.2f", media) + " anos";
                           
        JOptionPane.showMessageDialog(null, resultado);
    }
}
