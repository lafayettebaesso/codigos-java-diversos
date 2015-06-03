package br.com.lafayette.estruturaDeDados;

import javax.swing.JOptionPane;

public class VetorConvidados {

    public static void main(String[] args) {
        //Vetor que armazenará os 20 nomes dos convidados
        String convidados[] = new String[20];
        
        //Estrutura de repetição para captar e armazenar (no vetor declarado anteriormente) o nome de cada convidado
        for (int numero = 1; numero <= convidados.length; numero++) {
            String str = "Convidado " + numero;
            str = JOptionPane.showInputDialog(null, str);
            if (str == null) break; //Analisa se a caixa de diálogo foi cancelada
            str = str.trim(); //Elimina espaço que porventura tenha sido inseridos antes ou depois dos nomes
            convidados[numero - 1] = str; //Armazena o nome que foi informado
        }
        
        //Montagem do texto contendo todos os nomes dos convidados que foram registrados
        String mensagem = "Relação de convidados:";
        //Laço responsável por percorrer todas as posições do vetor e recuperá-las e adicioná-las a String "mensagem"
        for (int posicao = 0; posicao < convidados.length; posicao++) {
            if (convidados[posicao] == null) break;
            mensagem += "\n- " + convidados[posicao];
        }
        
        
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
    
}
