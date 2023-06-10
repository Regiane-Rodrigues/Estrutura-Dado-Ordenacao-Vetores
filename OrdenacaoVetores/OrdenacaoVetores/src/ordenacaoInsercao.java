import javax.swing.JOptionPane;

public class ordenacaoInsercao {

    public void OrdenacaoInsercao() {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int[] vetor = new int[tamanho];
        int chave, j, i;

        for (i = 0; i < tamanho; i++) {

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

        }

         StringBuilder apresentaVetor = new StringBuilder();
         for(i = 0; i < tamanho; i++){

            apresentaVetor.append("Posição: [").append(i).append("] => ").append(vetor[i]).append("\n");    

         }
         JOptionPane.showMessageDialog(null,"Foi adicionado um vetor de "+tamanho+" posições. \n"+apresentaVetor );
        for (i = 0; i < tamanho; i++) {
            chave = vetor[i];
            j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }

            vetor[j + 1] = chave;

        }
       
        StringBuilder vetorOrdenado = new StringBuilder();
        for (i = 0; i < tamanho; i++) {
            
            
            vetorOrdenado.append("Posição ["+i+"] => ").append(vetor[i]).append("\n");

        }
        
        JOptionPane.showMessageDialog(null, "Seu vetor ordenado: \n" + vetorOrdenado);

    }

}
