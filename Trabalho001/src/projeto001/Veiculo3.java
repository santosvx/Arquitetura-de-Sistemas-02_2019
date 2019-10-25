package projeto001;

public class Veiculo3 extends Veiculo {
	
	private int potencia;
	private int alturaSuspensao;
	
	public int getPotencia()
	{
		return potencia;
	}
	
	public int getAlturaSuspensao () {
		return alturaSuspensao;
	}
	
	public void setPotencia(final int potencia) {
		this.potencia = potencia;
	}
	
	public void setAlturaSuspensao (final int alturaSuspensao)
	{
		this.alturaSuspensao = alturaSuspensao;
	}
	
	public enum ModoDirigir {
		SPORT, COMFORT, ECONOMY
	}
}
