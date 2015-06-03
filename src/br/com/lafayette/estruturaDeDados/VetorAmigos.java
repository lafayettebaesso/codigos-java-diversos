package br.com.lafayette.estruturaDeDados;

import javax.swing.JOptionPane;

public class VetorAmigos {
    public static void main(String[] args) {
        int numero = 0;
        while(numero <= 0) {
            String str = "Número de amigos";
            str = JOptionPane.showInputDialog(null, str);
            if (str ==null) System.exit(0);
            numero = Integer.parseInt(str);
        }
        
        String amigos[] = new String[numero];
        for (int i = 1; i <= amigos.length; i++) {
            String str = "Amigo " + i;
            str = JOptionPane.showInputDialog(null, str);
            if (str == null) break;
            str = str.trim();
            amigos[i - 1] = str;
        }
        
        String mensagem = "Lista de amigos:";
        for (int posicao = 0; posicao < amigos.length; posicao++) {
            if (amigos[posicao] == null) break;
            mensagem += "\n- " + amigos[posicao];
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
}