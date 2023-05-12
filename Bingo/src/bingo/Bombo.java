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
		
		int numeroAleatorio = (int)(Math.random()*numerosBombo.size());
		
		int devolver = numerosBombo.get(numeroAleatorio);
		numerosBombo.remove(numeroAleatorio);
		
			
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
