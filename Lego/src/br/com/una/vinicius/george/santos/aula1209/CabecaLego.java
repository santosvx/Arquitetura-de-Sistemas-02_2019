package br.com.una.vinicius.george.santos.aula1209;

public class CabecaLego extends PecaLego
{
	private String face;
	
	CabecaLego(String cor, String tamanho, String face){
		super(cor, tamanho, 1, 1);
		this.face = face;
	}
	
	public String getFace() {return face;}
}