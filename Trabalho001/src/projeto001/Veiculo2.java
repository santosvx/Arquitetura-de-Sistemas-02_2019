package projeto001;

// Corrija o c�digo digitado no passo 01, de maneira que seja poss�vel a aplica��o do princ�pio SOLID da responsabilidade �nica (SRP)

public class Veiculo2 {
	
	private final int capacidadeTanque;
	private int quantidadeTanque;
	
	Veiculo2 (final int capacidadeTanque)
	{
		this.capacidadeTanque = capacidadeTanque;
		this.quantidadeTanque = capacidadeTanque;
	}
	public void encherTanque()
	{
		quantidadeTanque = capacidadeTanque;
	}
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public int getQuantideTanque() {
		return quantidadeTanque;
	}
	public void setQuantidadeTanque (int quantidadeTanque)
	{
		this.quantidadeTanque = quantidadeTanque;
	}
	public void acelerar()
	{
		quantidadeTanque--;
	}
}
