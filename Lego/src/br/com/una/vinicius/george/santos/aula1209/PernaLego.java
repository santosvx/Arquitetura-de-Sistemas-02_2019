package br.com.una.vinicius.george.santos.aula1209;

public class PernaLego {

	private String estampa;
	private int anguloPernaDireito;
	private int anguloPernaEsquerda;
	
	PernaLego(String cor, String tamanho, String estampa)
	{
		super(cor, tamanho, 1, 1);
		this.estampa =  estampa;
		this.anguloPernaDireito = 180;
		this.anguloPernaEsquerda = 180;
	}
	
	public String getEstampa () {return estampa;}
	public int getAnguloPernaDireito () {return anguloPernaDireito;}
	public int getAnguloPernaEsquerda () {return anguloPernaEsquerda;}
	
	public void setAnguloBracoDireito(int anguloBracoDireito) {
		this.anguloPernaDireito =  anguloBracoDireito;
	}
	
	public void setAnguloBracoEsquerdo(int anguloBracoEsquerdo) {
		this.anguloPernaEsquerda =  anguloBracoEsquerdo;
	}
	
}
