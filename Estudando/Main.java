public class Main {

    public static void main(String[] args) {
        
        int[] numeros = {10, 20, 30, 40, 50};


        System.out.println("Primeiro elemento:" + numeros[0]); //10
        System.out.println("Trceiro elemento:" + numeros[2]); //30

        //3. Modificando o valor de uma posição
        numeros[1] = 25;
        System.out.println("Segundo elemento alterado: " + numeros[1]); //25

        //4. Percorrendo o valor com um laço for
        System.out.println("\nElementos do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice " + i + ": " + numeros[i]);
        }

    }
}
