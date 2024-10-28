/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megasena;

/**
 *
 * @author Noa
 */
public class MegaSena {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    int numerosSorteados[] = new int[6];
    int acertos = 0;
    int chutes[] = new int[6]; // Array para armazenar os chutes do usuário

    // gerar os números
    int min = 0;
    int max = 60;
    for (int i = 0; i < 6; i++) {
        numerosSorteados[i] = (int) (Math.random() * (max - min) + min);
    }

    // ler chutes do usuário
    for (int i = 0; i < 6; i++) {
        int chute = Entrada.leiaInt("Chute um número entre 0 e 60");
        chutes[i] = chute; // Armazena o chute no array

        for (int j = 0; j < 6; j++) {
            if (chute == numerosSorteados[j]) {
                acertos++;
            }
        }
    }

    // Exibir os números que o usuário digitou
    System.out.println("Números digitados pelo usuário: ");
    for (int i = 0; i < 6; i++) {
        System.out.print(chutes[i] + " - ");
    }
    System.out.println(); // Nova linha para separar

    // Exibir o número de acertos e os números sorteados
    System.out.println("Número de acertos: " + acertos);
    System.out.println("Números sorteados: ");
    for (int i = 0; i < 6; i++) {
        System.out.print(numerosSorteados[i] + " - ");
    }

    System.exit(0);  
}

}

