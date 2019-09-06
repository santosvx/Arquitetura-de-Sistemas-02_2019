package br.com.una.santos.george.vinicius.aula0509;

public class Data003 {

	public int dia, mes, ano;
	
	public void iniciaData (int d, int m, int a) {
		dia = (d > 0) && (d <= 31)? d : 1;
		mes = (m > 0) && (m <= 12)? m : 1;
		ano = a > 0 ? a : 2000;
		//ano = (a > 0)? a : 2000;
	}
	public void exibe ( ) { System.out.println(dia + " / " + mes + " / " + ano);
}
	public void setDia (int d) { dia = d; }
	public void setMes (int m) { dia = m; }
	public void setAno (int a) { dia = a; }
	public int getDia ( ) { return dia; }
	public int getMes ( ) { return mes; }
	public int getAno ( ) { return ano; }
}
