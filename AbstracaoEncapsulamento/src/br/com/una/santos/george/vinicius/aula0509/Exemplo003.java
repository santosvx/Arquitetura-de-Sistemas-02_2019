package br.com.una.santos.george.vinicius.aula0509;

public class Exemplo003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objeto criado!
		Data003 d1 = new Data003();
		
		d1.iniciaData(1, 1, 3000);
		d1.setDia(10);
		
		System.out.println("Hoje � dia " + d1.getDia());
	}

}

/*
Construtora

No c�digo anterior qual era o objetivo de iniciaData(...)?
Em Java � poss�vel definir um m�todo denominado Construtor que � automaticamente invocado quando um objeto for criado.
Este(s) m�todo(s) deve(m) ter o mesmo nome da classe e n�o podem retornar valor.
*/
