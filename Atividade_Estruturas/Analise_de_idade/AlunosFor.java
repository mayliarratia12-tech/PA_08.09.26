import javax.swing.JOptionPane;

public class AlunosFor {
    public static void main(String[] args) {
        int totalAlunos = 20;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int somaIdades = 0;
        
        for (int i = 1; i <= totalAlunos; i++) {
            String input = JOptionPane.showInputDialog("Digite a idade do aluno " + i + ":");
            int idade = Integer.parseInt(input);
            
            if (idade < menorIdade) menorIdade = idade;
            if (idade > maiorIdade) maiorIdade = idade;
            
            somaIdades += idade;
        }
        
        double media = (double) somaIdades / totalAlunos;
        
        String resultado = "Estatisticas dos Alunos:\n" +
                           "Menor idade lida: " + menorIdade + " anos\n" +
                           "Maior idade lida: " + maiorIdade + " anos\n" +
                           "Media das idades: " + String.format("%.2f", media) + " anos";
                           
        JOptionPane.showMessageDialog(null, resultado);
    }
}