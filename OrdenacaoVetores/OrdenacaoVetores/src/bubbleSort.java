import javax.swing.JOptionPane;

public class BubbleSort {

    public void bubbleSort() {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor"));
        int[] vetor = new int[tamanho];
        boolean troca = true;
        int i;

        for (i = 0; i < tamanho; i++) {

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        }

        StringBuilder apresentaVetor = new StringBuilder();
        for (i = 0; i < tamanho; i++) {

            apresentaVetor.append("Posição: [").append(i).append("] => ").append(vetor[i]).append("\n");

        }
        JOptionPane.showMessageDialog(null, "Foi adicionado um vetor de " + i + " posições. \n" + apresentaVetor);

        long inicioExecucao = System.currentTimeMillis();

        while (troca) {

            troca = false;

            for (i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }

        long fimExecucao = System.currentTimeMillis();
        long tempoExecucao = fimExecucao - inicioExecucao;

        StringBuilder vetorOrdenado = new StringBuilder();
        for (i = 0; i < vetor.length; i++) {

            vetorOrdenado.append("Posição [" + i + "] => ").append(vetor[i]).append("\n");

        }
        JOptionPane.showMessageDialog(null,"Tempo de execução: " + tempoExecucao + "\nSeu vetor ordenado: \n" + vetorOrdenado);
    }
}
