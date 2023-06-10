import javax.swing.JOptionPane;

public class bubbleSort {
    
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


}
