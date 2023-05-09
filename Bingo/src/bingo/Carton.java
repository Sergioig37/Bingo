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
			
			int indice = numerosCarton.indexOf(numero);
			
			numerosCarton.remove(indice);
			
		}
		
		
	}


	public void rellenarCarton() {
		
		int numero = 0;
		for(int i=1;i<=9;i++) {
			
			switch(i) {
				case(1): for(int j=0; j<2;j++) {
					
						numero=(int)(Math.random()*10)+1;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+1;
						
					}
					numerosCarton.add(numero);
					
					}
				break;
				case(2): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+11;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+11;
						
					}
					
						numerosCarton.add(numero);
					
					
					}
				break;
				case(3): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+21;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+21;
						
					}
					
						numerosCarton.add(numero);
					
					
					}
				break;
				case(4): for(int j=0; j<2;j++) {
					numero=(int)(Math.random()*10)+31;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+31;
						}
					
						numerosCarton.add(numero);
					
					
					}
				break;
				case(5): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+41;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+41;
						
					}
						numerosCarton.add(numero);
					
					
					}
				break;
				case(6): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+51;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+51;
						
				}
						numerosCarton.add(numero);
					
					
					}
				break;
				case(7): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+61;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+61;
						
					}
						numerosCarton.add(numero);
					
					
					}
				break;
				case(8): for(int j=0; j<2;j++) {
					numero=(int)(Math.random()*10)+71;
						while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+71;
						
				}
						numerosCarton.add(numero);
					
					
					}
				break;
				case(9): for(int j=0; j<2;j++) {
					
					numero=(int)(Math.random()*10)+81;
					while(numerosCarton.contains(numero)) {
							numero=(int)(Math.random()*10)+81;
						}
					
					numerosCarton.add(numero);
					
					
					}
				break;
				
			}
		}
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
			return "Carton [nombre=" + nombre + ", numerosCarton=" + numerosCarton + "]";
		}
}
