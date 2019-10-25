package br.com.una.vinicius.george.santos.aula1209;

public class TroncoLego {
	
	private String estampa;
	private int anguloBracoDireito;
	private int anguloBracoEsquerdo;
	
	TroncoLego(String cor, String tamanho, String estampa)
	{
		super(cor, tamanho, 1, 1);
		this.estampa =  estampa;
		this.anguloBracoDireito = 90;
		this.anguloBracoEsquerdo = 90;
	}
	
	public String getEstampa () {return estampa;}
	public int getAnguloBracoDireito () {return anguloBracoDireito;}
	public int getAnguloBracoEsquerdo () {return anguloBracoEsquerdo;}
	
	public void setAnguloBracoDireito(int anguloBracoDireito) {
		this.anguloBracoDireito =  anguloBracoDireito;
	}
	
	public void setAnguloBracoEsquerdo(int anguloBracoEsquerdo) {
		this.anguloBracoEsquerdo =  anguloBracoEsquerdo;
	}
}
