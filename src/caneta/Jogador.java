package caneta;

import java.util.Scanner;
public class Jogador extends Espada{
	float vida = 10;
	String nome;
	float stamina = 5;
	String nomedaclasse;
	
	Scanner ler = new Scanner(System.in);
	
	 
	
	public void verStatus(String nome){
		System.out.println("Vida - " + vida);
		System.out.println("Nome - " + nome);
		System.out.println("Stamina - " + stamina);
		System.out.println("Nome da Classe - " + nomedaclasse);
	}
	
	public String verstatusarma = ler.next();{
		System.out.println("Nome da arma - " + nomedaespada);
		System.out.println("Tipo de espada - " + tipodeespada);
		System.out.println("Descrição da arma - " + descrição);
		System.out.println("Dano da arma - " + dano);
		System.out.println("Durabilidade - " + durabilidade);
		
	}
	

}
