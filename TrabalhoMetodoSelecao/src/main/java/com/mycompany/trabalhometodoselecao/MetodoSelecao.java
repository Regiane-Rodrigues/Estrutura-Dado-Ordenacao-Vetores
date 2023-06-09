/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhometodoselecao;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MetodoSelecao {

    int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do Vetor"));
    int[] vetor = new int[tamanho];

    public void testeMensagem() {

        JOptionPane.showMessageDialog(null, "Foi criado um vetor com o tamanho de " + tamanho + " Posições");

    }

    public void SelecaoMensagem() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros para ser implementados no Vetor"));
        }
        String msg = "Numeros inseridos no Vetor\n";
        for (int i = 0; i < vetor.length; i++) {
            msg += "posição: [" + i + "] =>" + vetor[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, msg);
        
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
        msg = "Vetor ordenado:\n";
        for (int i = 0; i < vetor.length; i++) {
            msg += "posição [" + i + "]: " + vetor[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

}
