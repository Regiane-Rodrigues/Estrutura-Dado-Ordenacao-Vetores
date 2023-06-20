import javax.swing.JOptionPane;

public class OrdenacaoSelecao {

   int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Vetor"));
    int[] vetor = new int[tamanho];

    public void testeMensagem() {

        JOptionPane.showMessageDialog(null, "Foi criado um vetor com o tamanho de " + tamanho + " Posições");

    }
    long inicioExecucao = System.currentTimeMillis();
    public void ordnarVetor() {
        for (int i = 0; i < vetor.length - 1; i++) {
            int posicaoMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            if (posicaoMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }

        }
    }

    long fimExecucao = System.currentTimeMillis();
    long tempoExecucao = System.currentTimeMillis();

    public void SelecaoMensagem() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Digite os numeros para ser implementados no Vetor"));
        }
        String msg = "Numeros inseridos no Vetor\n";
        for (int i = 0; i < vetor.length; i++) {
            msg += "posição: [" + i + "] =>" + vetor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);

        ordnarVetor();

        msg = "Tempo de execução: "+ tempoExecucao + "\nVetor ordenado:\n";
        for (int i = 0; i < vetor.length; i++) {
            msg += "posição [" + i + "]: " + vetor[i] + "\n";

        }
        JOptionPane.showMessageDialog(null, msg);
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

    public void MenuSelecaoOrdenacao() {
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
