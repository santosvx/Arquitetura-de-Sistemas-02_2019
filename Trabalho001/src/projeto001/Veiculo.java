package projeto001;

public class Veiculo {
	
	private final int capacidadeTanque;
	private int quantidadeTanque;
	
	Veiculo (final int capacidadeTanque)
	{
		this.capacidadeTanque = capacidadeTanque;
		//this.quantidadeTanque = quantidadeTanque;
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
