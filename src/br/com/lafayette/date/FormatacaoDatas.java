package br.com.lafayette.date;

import static java.lang.System.out;
import java.text.DateFormat;
import java.util.Date;

public class FormatacaoDatas {
    public static void main(String[] args) {
        Date hoje = new Date();
        
        DateFormat df = DateFormat.getDateInstance();
        out.println("Classe do objeto:\t" + df.getClass().getName());
        out.println("Formato padrão:\t\t" + df.format(hoje));
        
        df = DateFormat.getDateInstance(DateFormat.SHORT);
        out.println("Formato curto:\t\t" + df.format(hoje));
        
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        out.println("Formato médio:\t\t" + df.format(hoje));
        
        df = DateFormat.getDateInstance(DateFormat.LONG);
        out.println("Formato longo:\t\t" + df.format(hoje));
        
        df = DateFormat.getDateInstance(DateFormat.FULL);
        out.println("Formato completo:\t\t" + df.format(hoje));
    }
}
