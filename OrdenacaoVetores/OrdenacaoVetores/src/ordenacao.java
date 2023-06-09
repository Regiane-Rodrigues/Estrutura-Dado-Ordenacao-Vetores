import java.util.Vector;

import javax.swing.JOptionPane;


public class ordenacao {
    public static void main(String[] args) throws Exception {
        
      int escolha = -1;
      
      
      while(escolha != 0){

        escolha = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha o tipo de ordenação" +
            "1 - Ordenação por inserção" +
            "2 - Ordenação por seleção" +
            "3 - Ordenação tipo bolha (bubble sort)"+
            "0 - sair"));
            
            switch(escolha){
                case 1:
                    Insercao();
                break;
                case 2:
                break;
                case 3:
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

      }
      
    }

    public static void Insercao(){

        ordenacaoInsercao insercao = new ordenacaoInsercao();
        insercao.OrdenacaoInsercao();
      }
}

