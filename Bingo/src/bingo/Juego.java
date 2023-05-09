package bingo;

import java.util.ArrayList;

public class Juego {
	
	private ArrayList<Carton> cartonesJugando;

	
	public Juego(Carton carton, Carton carton1) {
		
		cartonesJugando = new ArrayList<Carton>();
		
		cartonesJugando.add(carton1);
		cartonesJugando.add(carton);	
	}
	
	public void addJugador(Carton carton) {
		
		cartonesJugando.add(carton);
		
	}
	
	public Carton jugar(){
		
		Carton ganador = null;
		
		boolean hayganador = false;
		
		Bombo bingoo = new Bombo();
		while(!hayganador){
			
			int bola = bingoo.pedirNumero();
			
			for(Carton carton: cartonesJugando) {
				
				carton.comprobarNumero(bola);
				
				if(carton.estaVacio()) {
					hayganador = true;
					ganador = carton;
				}
			}
			
			
		}
		
		return ganador;
	}

	public ArrayList<Carton> getCartonesJugando() {
		return cartonesJugando;
	}
	
	
}
