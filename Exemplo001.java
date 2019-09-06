package br.com.una.santos.george.vinicius.aula0509;

public class Exemplo001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario;
		
		Data d1;	/* d1 é uma "variável" do tipo Data
					Na realidade d1 é uma referência para Data */
		
		salario = 1000.50;
		
		// por que não funciona ? Objeto não foi criado!
		d1.dia = 3;
		
		d1 = new Data(); // aqui estamos criando objeto
		d1.iniciaData(1, 1, 3000);
		
		// por que chamar o método se podemos fazer:
		d1.dia = 1;		d1.mes = 1;		d1.ano = 3000;
		
		// porque podemos fazer:
		d1.dia = -60;		d1.mes = 18;		d1.ano = -3000;
		
		
	}

}
