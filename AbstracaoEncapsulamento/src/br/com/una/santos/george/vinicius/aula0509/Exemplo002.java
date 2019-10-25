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
Ocultando informa��o
� o processo de manter decis�es de projeto ocultas do usu�rio. Em Java, isto pode conseguido por meio de especificadores de acesso:
�         public: membros p�blicos podem ser acessados em qualquer lugar do  programa;
�         private: membros privados s�o acess�veis apenas na pr�pria classe;
�         protected: membros protegidos s�o acess�veis pela classe e suas subclasses.
�         sem especificador: membros declarados sem modificador de acesso s�o acess�veis apenas pelas classes do mesmo pacote.
*/

/*
Como podemos, nesta nova implementa��o, acessar informa��es como dia, m�s e ano?
Atrav�s dos membros p�blicos da classe (interface da classe).
 */
