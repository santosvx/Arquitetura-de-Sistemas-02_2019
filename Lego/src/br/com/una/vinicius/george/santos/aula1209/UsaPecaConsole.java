package br.com.una.vinicius.george.santos.aula1209;

public class UsaPecaConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PecaLego pecaSimples = new PecaLego("Verde", "Pequena", 2, 4);
		CabecaLego cabeca1 = new CabecaLego("Amarela", "Pequena", "Sorrindo");
		CabecaLego cabeca2 = new CabecaLego("Cinza", "Pequena", "Triste");
		TroncoLego tronco1 = new TroncoLego("Branco", "Pequena", "Piloto");
		TroncoLego tronco2 = new TroncoLego("Vermelho", "Pequena", "Bombeiro");
		PernaLego perna1 = new PernaLego("Branco", "Pequena", "Piloto");
		PernaLego perna2 = new PernaLego("Vermelho", "Pequena","Bombeiro");
		
		
		
		
		BonecoLego boneco1, boneco2, boneco3;
		
		boneco1 = new BonecoLego(cabeca1, tronco2, perna1);
		boneco2 = new BonecoLego(cabeca2, tronco1, perna2);
		boneco3 = new BonecoLego(cabeca2, tronco1, perna1);
		
		System.out.println("Boneco 1: Cabeça " +
							boneco1.getCabeca().getCor()+ " " +
							boneco1.getCabeca().getFace() + " " +
							boneco1.getTronco().getCor() + " " +
							boneco1.getTronco().getEstampa() + " " +
							boneco1.getTronco().getAnguloBracoDireito() + " " +
							boneco1.getTronco().getAnguloBracoEsquerdo() + " " +
							boneco1.getPerna().getCor() + " " +
							boneco1.getPerna().getEstampa() + " " +
							boneco1.getPerna().getAnguloPernaDireito() + " " +
							boneco1.getPerna().getAnguloPernaEsquerda() + " " );
		
		System.out.println("Peça Simples: " + 
		
				pecaSimples.getCor() + " " +
				pecaSimples.getTamanho() + " " +
				pecaSimples.getPinosX() + " " +
				pecaSimples.getPinosY() + " ");
		
		System.out.println("Cabeça 1: " + 
				
			cabeca1.getCor() + " " +
			cabeca1.getTamanho() + " " +
			cabeca1.getFace() + " ");
		
		System.out.println("Cabeça 2: " + 
				
			cabeca2.getCor() + " " +
			cabeca2.getTamanho() + " " +
			cabeca2.getFace() + " ");
		
		System.out.println("Tronco 1: " + 
				
			tronco1.getCor() + " " +
			tronco1.getTamanho() + " " +
			tronco1.getPinosX() + " " +
			tronco1.getPinosY() + " " +
			tronco1.getEstampa() + " " +
			tronco1.getAnguloBracoDireito() + " " +
			tronco1.getAnguloBracoEsquerdo() + " " );
		
		System.out.println("Tronco 2: " + 
				
			tronco1.getCor() + " " +
			tronco1.getTamanho() + " " +
			tronco1.getPinosX() + " " +
			tronco1.getPinosY() + " " +
			tronco1.getEstampa() + " " +
			tronco1.getAnguloBracoDireito() + " " +
			tronco1.getAnguloBracoEsquerdo() + " " );

	}

}
