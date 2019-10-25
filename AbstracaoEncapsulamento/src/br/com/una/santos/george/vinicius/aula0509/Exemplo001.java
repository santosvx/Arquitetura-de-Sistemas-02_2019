package br.com.una.santos.george.vinicius.aula0509;

public class Exemplo001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario;
		
		Data d1;	/* d1 � uma "vari�vel" do tipo Data
					Na realidade d1 � uma refer�ncia para Data */
		
		salario = 1000.50;
		
		// por que n�o funciona ? Objeto n�o foi criado!
		d1.dia = 3;
		
		d1 = new Data(); // aqui estamos criando objeto
		d1.iniciaData(1, 1, 3000);
		
		// por que chamar o m�todo se podemos fazer:
		d1.dia = 1;		d1.mes = 1;		d1.ano = 3000;
		
		// porque podemos fazer:
		d1.dia = -60;		d1.mes = 18;		d1.ano = -3000;
		
		
	}

}

/*
Objetivo

Apresentar os conceitos b�sicos de abstra��o e encapsulamento, atrav�s da ado��o dos conceitos de classes, objetos, visibilidade de atributos e m�todos e tamb�m a sintaxe b�sica da linguagem Java, que ser� adotada como ferramenta na disciplina.

Utilizando o Eclipse

Objetos e Classes

Classe
� o mecanismo para defini��o de um Tipo Abstrato de Dados (TAD) - modelo para estrutura��o (atributos) e manipula��o (m�todos) de um conjunto de objetos semelhantes.

Objetos
� uma inst�ncia de classe. �� uma  vari�vel de mem�ria�. 

Note: float sal�rio - salario � um a vari�vel do tipo float. 
*/
