package br.com.una.vinicius.george.santos.aula1209;

public class PecaLego {
	
	private String cor;
	private String tamanho;
	private int pinosX;
	private int pinosY;

	PecaLego (String cor, String tamanho, int pinosX, int pinosY)
	{
		this.cor = cor;
		this.tamanho = tamanho;
		this.pinosX = pinosX;
		this.pinosY = pinosY;
	}
	
	public String getCor() {return cor;}
	public String getTamanho() {return tamanho;}
	public int getPinosX() {return pinosX;}
	public int getPinosY() {return pinosY;}
	
	}
