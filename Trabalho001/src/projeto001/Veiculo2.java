package projeto001;

// Corrija o código digitado no passo 01, de maneira que seja possível a aplicação do princípio SOLID da responsabilidade única (SRP)

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
