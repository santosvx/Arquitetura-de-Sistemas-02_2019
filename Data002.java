package br.com.una.santos.george.vinicius.aula0509;

public class Data002 {
	
	public int dia, mes, ano;
	
	public void iniciaData (int d, int m, int a) {
		if ((d > 0) && (d <= 31)) dia = d;
		else dia = 1;
		if ((m > 0) && (d <= 12)) mes = m;
		else mes = 1;
		if (a > 0) ano = a;
		else ano = 2000;
	}
	public void exibe ( ) { System.out.println(dia + " / " + mes + " / " + ano);
}

}
