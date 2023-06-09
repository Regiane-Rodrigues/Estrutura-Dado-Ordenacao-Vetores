import javax.swing.JOptionPane;

public class ordenacaoInsercao {
    
    /**
     * @param tamanho
     */
    public void OrdenacaoInsercao(){
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor: "));
        int[] vetor = new int[tamanho];
        int chave, j;
    

        for(int i = 0; i < tamanho; i++){

            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
 
        }
        
        for(int i = 0; i < tamanho; i++){
            chave = vetor [i];
            j = i - 1;

             while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }

            vetor[j+1] = chave;
        }

        StringBuilder vetorOrdenado = new StringBuilder();
        for(int i = 0; i < tamanho; i++){

            vetorOrdenado.append(vetor[i]).append(" ");

        }

        JOptionPane.showMessageDialog(null, " seu vetor:" +vetorOrdenado);

    }
    

}
