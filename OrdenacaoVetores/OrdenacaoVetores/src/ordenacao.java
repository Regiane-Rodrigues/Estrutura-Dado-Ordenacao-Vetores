import javax.swing.JOptionPane;


public class Ordenacao {
    public static void main(String[] args){
        
      int escolha = -1;
      
      
      while(escolha != 0){

        escolha = Integer.parseInt(JOptionPane.showInputDialog(
            "Escolha o tipo de ordenação: \n" +
            "1 - Ordenação por inserção \n" +
            "2 - Ordenação por seleção \n" +
            "3 - Ordenação tipo bolha (bubble sort) \n"+
            "0 - sair"));
            
            switch(escolha){
                case 1:
                    Insercao();
                break;
                case 2:
                    Selecao();
                break;
                case 3:
                    Bolha();
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

        OrdenacaoInsercao insercao = new OrdenacaoInsercao();
        insercao.OrdenacaoInsercao();
      }


     public static void Selecao(){
        OrdenacaoSelecao metodo = new OrdenacaoSelecao();
        metodo.testeMensagem();
        metodo.SelecaoMensagem();

     }
     
     public static void Bolha(){

        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort();
     }
}

