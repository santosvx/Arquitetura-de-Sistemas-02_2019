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

/*
Objetivo

Apresentar os conceitos básicos de abstração e encapsulamento, através da adoção dos conceitos de classes, objetos, visibilidade de atributos e métodos e também a sintaxe básica da linguagem Java, que será adotada como ferramenta na disciplina.

Utilizando o Eclipse

Objetos e Classes

Classe
É o mecanismo para definição de um Tipo Abstrato de Dados (TAD) - modelo para estruturação (atributos) e manipulação (métodos) de um conjunto de objetos semelhantes.

Objetos
É uma instância de classe. “É uma  variável de memória”. 

Note: float salário - salario é um a variável do tipo float. 
*/
