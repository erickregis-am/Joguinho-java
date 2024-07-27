package caneta;

import java.util.Random;

public class Espada {
	Random gerador = new Random();
	
	float dano;
	float durabilidade;
	String nomedaespada;
	String tipodeespada;
	String descrição;
	int chancedeacerto;
	int danodurabilidade;
	int ataqueverif;
	 
	 
	
	public void ataque(Jogador destino) {
		danodurabilidade = gerador.nextInt(3);
		durabilidade -= danodurabilidade;  
		chancedeacerto = gerador.nextInt(2);
		if (chancedeacerto == 0) {
		destino.vida -= dano;
		System.out.println("Você conseguiu atacar!!! Seu dano foi de " + dano);System.out.println("Sua durabilidade caiu " + danodurabilidade);
		System.out.println("Sua durabilidade atual é " + durabilidade); System.out.print("A vida de " + destino.nome);
		System.out.print(" agora é " + destino.vida);ataqueverif = 0;}
		else {System.out.println("Seu ataque falhou!!!\n"); ataqueverif = 1;}
		
	}	
		
	public void bloquear(Jogador destino ,Jogador origem, Espada espadadestino) {
		danodurabilidade = gerador.nextInt(6);
		durabilidade -= danodurabilidade; 
		chancedeacerto = gerador.nextInt(2);
		if (chancedeacerto == 0 && ataqueverif == 0) {
		float danobloqueado = destino.vida  - (espadadestino.dano / 2);
		System.out.println("\n\nVocê conseguiu bloquear!!!");
		System.out.println("Você mitigou " + danobloqueado);
		System.out.println("Sua vida atual é " + origem.vida);
		System.out.println("A durabilidade atual da sua espada é " + durabilidade);}
		if (chancedeacerto != 0 && ataqueverif == 1){System.out.println("\nSeu bloqueio falhou!!!");origem.vida -= espadadestino.dano;
		System.out.println("Vocè tomou " + origem.vida);}
	}
	
	
	
}
