package br.com.una.santos.george.vinicius.aula0509;

public class Exemplo004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data004 d1, d2;
		

		d1 = new Data004(15, 4, 3000);
		d1.exibe();
		
		System.out.println("Hoje é dia " + d1.getDia());
		
		d2 = new Data004();
		d2.exibe();
		
		System.out.println("Hoje é dia " + d2.getDia());
	}

}
