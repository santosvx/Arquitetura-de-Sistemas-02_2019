package br.com.una.santos.george.vinicius.aula0509;

public class Data {
	
		public int dia, mes, ano;
		
		public void iniciaData (int d, int m, int a) {
			if ((d > 0) && (d <= 31)) dia = d;
			if ((m > 0) && (d <= 12)) mes = m;
			if (a > 0) ano = a;
		}
		public void exibe ( ) { System.out.println(dia + " / " + mes + " / " + ano);
	}
}
