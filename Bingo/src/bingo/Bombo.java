package bingo;

import java.util.ArrayList;
import java.util.HashSet;

public class Bombo {

	private ArrayList<Integer> numerosBombo;
	
	public Bombo(){
		
		numerosBombo = new ArrayList<Integer>();
		
		for(int i=1;i<91;i++) {
			
			numerosBombo.add(i);
			
		}
		
	}
	
	
	public int pedirNumero(){
		
		int devolver = 0;
		
		int numeroAleatorio = (int)(Math.random()*90)+1;
		
		
		if(!numerosBombo.contains(numeroAleatorio)) {
			
			numeroAleatorio = (int)(Math.random()*90)+1;
			
		}
		else {
			devolver = numeroAleatorio;
			int indice = numerosBombo.indexOf(numeroAleatorio);
			numerosBombo.remove(indice);
		}
		
		
		
		return devolver;
		
	}


	public ArrayList<Integer> getNumerosBombo() {
		return numerosBombo;
	}


	public void setNumerosBombo(ArrayList<Integer> numerosBombo) {
		this.numerosBombo = numerosBombo;
	}


	@Override
	public String toString() {
		return "Bombo [numerosBombo=" + numerosBombo + "]";
	}
	
	
	
}
