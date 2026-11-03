import javax.swing.JOptionPane;

public class EleicaoDoWhile {
    public static void main(String[] args) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, brancos = 0, nulos = 0;
        int voto;
        
        do {
            String input = JOptionPane.showInputDialog("Digite o codigo do voto (1 a 4 = Candidatos, 5 = Branco, Outro = Nulo, 0 = Sair):");
            voto = Integer.parseInt(input);
            
            if (voto != 0) {
                if (voto == 1) c1++;
                else if (voto == 2) c2++;
                else if (voto == 3) c3++;
                else if (voto == 4) c4++;
                else if (voto == 5) brancos++;
                else nulos++;
            }
        } while (voto != 0);
        
        String resultado = "Resultado da Eleicao:\n" +
                           "Candidato 1: " + c1 + " votos\n" +
                           "Candidato 2: " + c2 + " votos\n" +
                           "Candidato 3: " + c3 + " votos\n" +
                           "Candidato 4: " + c4 + " votos\n" +
                           "Votos Brancos: " + brancos + "\n" +
                           "Votos Nulos: " + nulos;
                           
        JOptionPane.showMessageDialog(null, resultado);
    }
}
