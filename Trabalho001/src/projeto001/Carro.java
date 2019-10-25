package projeto001;

public class Carro extends Veiculo5 {

	@override
	public void mudarMarcha(Marcha marcha)
	{
		if Marcha.R.equals(marcha) && getMarcha().equals.(Marcha.D)){
			throw new RuntimeException ("Você não pode dar ré enquanto esta com a " + getMarcha().toString() +
					"marcha engatada!");
		}
	}
}
