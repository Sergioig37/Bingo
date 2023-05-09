package bingo;

import java.util.ArrayList;

public class Carton {

	private String nombre;
	private ArrayList<Integer> numerosCarton;
	
	public Carton(String nombre) {
		
		this.nombre = nombre;
		numerosCarton = new ArrayList<Integer>();
			
		
	}
	
	public void comprobarNumero(int numero) {
		
		if(numerosCarton.contains(numero)){
			
			numerosCarton.remove(numerosCarton.indexOf(numero));
			
		}
		
		
	}


	public void rellenarCarton() {
		for(int i=0;i<=8;i++) {
			for(int j=0;j<2;j++) {
				int	numeroSuma = (int)(Math.random()*10)+1;
				int numeroAdd = 0;
				if(i==0) {
				 numeroAdd = numeroSuma;
				 if(numerosCarton.contains(numeroAdd)) {
					while(numerosCarton.contains(numeroAdd)) {
						numeroSuma = (int)(Math.random()*10)+1;
						numeroAdd = numeroSuma;
					}
				 }
				}
				else {
					numeroAdd = i*10+numeroSuma;
					 if(numerosCarton.contains(numeroAdd)) {
						while(numerosCarton.contains(numeroAdd)) {
							numeroSuma = (int)(Math.random()*10)+1;
							numeroAdd = i*10+numeroSuma;
							}
				}
				
				}
				numerosCarton.add(numeroAdd);
			}
		}
	}
	
	public boolean estaVacio() {
		
		 return numerosCarton.isEmpty();
		
	}
		
		
		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public ArrayList<Integer> getNumerosCarton() {
			return numerosCarton;
		}


		public void setNumerosCarton(ArrayList<Integer> numerosCarton) {
			this.numerosCarton = numerosCarton;
		
	}
		
		
		@Override
		public String toString() {
			return "Carton de " + nombre + "[" + numerosCarton + "]";
		}
}
