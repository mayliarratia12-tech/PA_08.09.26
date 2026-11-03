import javax.swing.JOptionPane;

public class GrupoDoWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int totalSatisfezem = 0;
        String continuar;
        
        do {
            final String sexo = JOptionPane.showInputDialog("Digite o sexo (F / M):");
            String inputIdade = JOptionPane.showInputDialog("Digite a idade:");
            int idade = Integer.parseInt(inputIdade);
            String estadoCivil = JOptionPane.showInputDialog("Digite o estado civil (S = Solteiro, C = Casado, etc):");
            
            if (sexo.equalsIgnoreCase("F") && idade < 21 && estadoCivil.equalsIgnoreCase("S")) {
                totalSatisfezem++;
            }
            
            continuar = JOptionPane.showInputDialog("Deseja continuar a leitura dos dados? (S/N)");
        } while (continuar.equalsIgnoreCase("S"));
        
        JOptionPane.showMessageDialog(null, "Total de pessoas que satisfazem os criterios: " + totalSatisfezem);
    }
}
