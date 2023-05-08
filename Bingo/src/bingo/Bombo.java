package bingo;

import java.util.HashSet;

public class Bombo {

	private HashSet<Integer> numerosBombo;
	
	public Bombo(){
		
		numerosBombo = new HashSet<Integer>();
		
		for(int i=1;i<90;i++) {
			
			numerosBombo.add(i+1);
			
		}
		
	}
	
	
	public int pedirNumero(){
		
		int devolver = 0;
		
		int numeroAleatorio = (int)(Math.random()*91-1+1);
		
		
		if(!numerosBombo.contains(numeroAleatorio)) {
			
			numeroAleatorio = (int)(Math.random()*91-1+1);
			
			
		}
		else {
			devolver = numeroAleatorio;
			numerosBombo.remove(numeroAleatorio);
		}
		
		
		
		return devolver;
		
	}
}
