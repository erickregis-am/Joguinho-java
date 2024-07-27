package caneta;

public class JogadorNinja extends Jogador {
		
	public void passossombrios() {
		super.stamina += 6;
		super.nomedaclasse = "Ninja";
		
	}
	
	public void corteinvisível() {
		super.chancedeacerto = 0;
		
	}
	
	
	
}
