package br.com.lafayette.estruturaDeDados;

public class Vetor {

    public static void main (String[] args) {
		java.io.PrintStream saida = System.out;

		//Declarando o vetor
		int it[];

		//Instanciando o vetor
		it = new int[3];

		//Inicializando o vetor
		it[0] = 65;
		it[1] = 66;
		it[2] = 67;

		//Consultando o vetor
		saida.println("Conteúdo do vetor it:");
		saida.print("it[0] = " + it[0] + "\t");
		saida.print("it[1] = " + it[1] + "\t");
		saida.print("it[2] = " + it[2] + "\n");
		saida.print("Quantidade de posições: " + it.length + "\n\n");

		//Declarando e Instanciando o vetor em um único comando
		double db[] = new double[2];
		
		//Inicializando o vetor
		db[0] = 1.25;
		db[1] = 2.54;

		//Consultando o vetor
		saida.println("Conteúdo do vetor db:");
		saida.print("db[0] = " + db[0] + "\t");
		saida.print("db[1] = " + db[1] + "\n");
		saida.print("Quantidade de posições: " + db.length + "\n\n");

		//Declarando, instanciando e inicializando o vetor em um único comando
		char ch[] = {'X', 'Y', 'Z'};

		//Consultando o vetor
		saida.println("Conteúdo do vetor ch:");
		for (int i = 0; i <ch.length; i++)
			System.out.print("ch[" + i + "] = " + ch[i] + "\t");
		saida.println("\nQuantidade de posições: " + ch.length);
		saida.println();
	}
}
