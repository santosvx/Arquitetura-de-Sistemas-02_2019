package aulaPOO;

public class Arquivo {
	
	String nome;
	String extensao;
	int tamanho;
	String codificacao;
	
	abrir();
	fechar();
	criar();
	copiar();
	renomear();

}

class ArquivoEditavel extends Arquivo {
	editar();
	salvar();
}

class ArquivoNaoEditavel extends Arquivo {
	//
	
}

class ArquivoPDF extends ArquivoNaoEditavel {
	
}

