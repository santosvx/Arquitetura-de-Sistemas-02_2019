package br.com.una.vinicius.george.santos.aula1209;

public class BonecoLego {
	private CabecaLego cabeca;
	private TroncoLego tronco;
	private PernaLego perna;
	
	BonecoLego(CabecaLego cabeca, TroncoLego tronco, PernaLego perna){
		this.cabeca = cabeca;
		this.tronco = tronco;
		this.perna = perna;
	}
	
	public CabecaLego getCabeca() {return cabeca;}
	public TroncoLego getTronco() {return tronco;}
	public PernaLego getPerna() {return perna;}
}
