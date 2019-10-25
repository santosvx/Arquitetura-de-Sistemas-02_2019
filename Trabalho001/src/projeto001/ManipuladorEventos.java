package projeto001;

// Corrija o código digitado no passo 01, de maneira que seja possível a aplicação do princípio SOLID do Aberto /  Fechado (OCP)

public class ManipuladorEventos extends Veiculo3 {

	private Veiculo3 veiculo3;
	
	public ManipuladorEventos (final Veiculo3 veiculo3)
	{
		this.veiculo3 = veiculo3;
	}
	
	public void mudarModoDirigir (final ModoDirigir modoDirigir)
	{
		switch (modoDirigir) {
			case SPORT :
				veiculo3.setPotencia(500);
				veiculo3.setAlturaSuspensao(10);
				break;
			case COMFORT:
				veiculo3.setPotencia(400);
				veiculo3.setAlturaSuspensao(15);
				break;
			case ECONOMY:
				veiculo3.setPotencia(200);
				veiculo3.setAlturaSuspensao(20);
				break;
			default:
				veiculo3.setPotencia(300);
				veiculo3.setAlturaSuspensao(20);
				break;
		
		}
	}
}
