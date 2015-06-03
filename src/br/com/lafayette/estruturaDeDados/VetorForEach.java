package br.com.lafayette.estruturaDeDados;

import javax.swing.JOptionPane;

public class VetorForEach {
    public static void main (String[] args) {
        String amigos[] = new String[10];
        
        for (int i =1; i <= amigos.length; i++) {
            String str = "Amigos " + i;
            str = JOptionPane.showInputDialog(null, str);
            if (str == null) break;
            str = str.trim();
            amigos[i - 1] = str;
        }
        
        String mensagem = "Lista de amigos:";
        for (String nome : amigos) {
            if (nome == null) break;
            mensagem += "\n- " + nome;
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}