import javax.swing.JOptionPane;

public class OrdenacaoInsercao {

    int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
    int[] vetor = new int[tamanho];

    public void ordenacaoInsercao() {
        int chave, j, i;

        for (i = 0; i < tamanho; i++) {

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        }

        long inicioExecucao = System.currentTimeMillis();
        StringBuilder apresentaVetor = new StringBuilder();
        for (i = 0; i < tamanho; i++) {

            apresentaVetor.append("Posição: [").append(i).append("] => ").append(vetor[i]).append("\n");

        }
        JOptionPane.showMessageDialog(null, "Foi adicionado um vetor de " + tamanho + " posições. \n" + apresentaVetor);
        for (i = 0; i < tamanho; i++) {
            chave = vetor[i];
            j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }

            vetor[j + 1] = chave;

        }

        long fimExecucao = System.currentTimeMillis();
        long tempoExecucao = fimExecucao - inicioExecucao;

        StringBuilder vetorOrdenado = new StringBuilder();
        for (i = 0; i < tamanho; i++) {

            vetorOrdenado.append("Posição [" + i + "] => ").append(vetor[i]).append("\n");

        }

        JOptionPane.showMessageDialog(null,"Tempo de execução:" +tempoExecucao+ "\nSeu vetor ordenado: \n" + vetorOrdenado);

    }

    public void buscaBinaria() {
        int chave = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Informe o número a ser pesquisado"));

        int posicao = pesquisaBinaria(chave, vetor);

        if (posicao >= 0) {
            JOptionPane.showMessageDialog(null, "O Elemento " + chave + " está localizado na "
                    + "posição: " + posicao);
        } else {
            JOptionPane.showMessageDialog(null,
                    "O Elemento " + chave + " não foi localizado na lista");
        }

    }

    public static int pesquisaBinaria(int chave, int[] vet) {
        int esquerda, meio, direita;
        esquerda = 0;
        direita = vet.length - 1;

        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (chave == vet[meio]) {
                return meio;
            }
            if (chave > vet[meio]) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }

        }
        return -1;
    }

    public void buscaLinear() {
        int chave = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Informe o número a ser pesquisado"));

        int posicao = pesquisaLinear(chave, vetor);

        if (posicao >= 0) {
            JOptionPane.showMessageDialog(null, "O Elemento " + chave + " está localizado na "
                    + "posição: " + posicao);
        } else {
            JOptionPane.showMessageDialog(null,
                    "O Elemento " + chave + " não foi localizado na lista");
        }
    }

    public static int pesquisaLinear(int chave, int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (chave == vet[i])
                return i;
        }
        return -1;
    }

    public void MenuInsercaoOrdenacao() {
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Escolha o tipo de Pesquisa desejada:\n" +
                        "1 - Pesquisa Binaria \n" +
                        "2 - Pesquisa Linear \n"));
        if (opcao == 1) {
            buscaBinaria();
        }
        if (opcao == 2) {
            buscaLinear();
        }
    }

}
