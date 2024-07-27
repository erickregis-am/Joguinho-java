package caneta;

public class JogadorSamurai extends Jogador {

	public void aumentardano(Espada x) {
		super.dano += 2;
		super.nomedaclasse = "Samurai";
	}
	
	public void espadadeaço(Espada x) {
		super.durabilidade += 4;
	}
	

}
