package br.com.una.santos.george.vinicius.aula0509;

public class Exemplo002 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Objeto criado!
		Data002 d1 = new Data002();
		
		d1.dia = 1;		// erro de acesso
		d1.mes = 1;		// erro de acesso
		d1.ano = 3000;  // erro de acesso
		
		d1.iniciaData(1, 1, 3000);
		d1.exibe();
		
		d1.iniciaData(40, 18, -3000);
		d1.exibe();
	}

}

/*
Ocultando informação
É o processo de manter decisões de projeto ocultas do usuário. Em Java, isto pode conseguido por meio de especificadores de acesso:
·         public: membros públicos podem ser acessados em qualquer lugar do  programa;
·         private: membros privados são acessíveis apenas na própria classe;
·         protected: membros protegidos são acessíveis pela classe e suas subclasses.
·         sem especificador: membros declarados sem modificador de acesso são acessíveis apenas pelas classes do mesmo pacote.
*/

/*
Como podemos, nesta nova implementação, acessar informações como dia, mês e ano?
Através dos membros públicos da classe (interface da classe).
 */
