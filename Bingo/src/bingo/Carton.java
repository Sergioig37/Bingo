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
		//arregalo
		for(int i=0;i<=8;i++) {
			int	numeroSuma = (int)(Math.random()*10)+1;
			for(int j=0;j<2;j++) {
					if(i==0) {
						while(numerosCarton.contains(numeroSuma)) {
							numeroSuma = (int)(Math.random()*10)+1;
						}
					}
					else if(i>0) {
						if(numerosCarton.contains(numeroSuma)) {
							while(numerosCarton.contains(numeroSuma)) {
								numeroSuma = (int)(Math.random()*10)+1;
								numeroSuma = i*10+numeroSuma;
							}
					 }
					}
					numerosCarton.add(numeroSuma);
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
