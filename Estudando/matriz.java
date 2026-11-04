import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);


        int[][] matriz = new int[2] [4];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++){
                System.out.printf("Digite o valor para [%d] [%d]: ", i, j);
                matriz[i] [j] = ler.nextInt();

            }
        }
        System.out.println("\nMatriz informada:");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i] [j] + "\t");
            }
            System.out.println();
        }

        ler.close();

    }    
}
