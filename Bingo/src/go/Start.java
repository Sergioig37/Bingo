package go;

import java.util.ArrayList;
import java.util.HashSet;

import bingo.Bombo;
import bingo.Carton;
import bingo.Juego;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carton carton1 = new Carton("Pedro");
		Carton carton2 = new Carton("Mario");
		Carton carton3 = new Carton("Juan");
		Carton carton4 = new Carton("Rodri");
		Carton carton5 = new Carton("David");
		
		Juego bingo = new Juego(carton1, carton2);
		bingo.addJugador(carton5);
		bingo.addJugador(carton3);
		bingo.addJugador(carton4);
			
	
		
		
		for(Carton carton: bingo.getCartonesJugando()) {
			carton.rellenarCarton();
		}
		System.out.println(carton1.getNumerosCarton().size());
		System.out.println(carton2.getNumerosCarton().size());
		System.out.println(carton3.getNumerosCarton().size());
		System.out.println(carton4.getNumerosCarton().size());
		System.out.println(carton5.getNumerosCarton().size());
		
		for(Carton carton: bingo.getCartonesJugando()) {
			
			System.out.println(carton);
			
		}
		
		Carton elganador = bingo.jugar();
		
		System.out.println("Ha ganado " +elganador.getNombre());
		
		
		
		
		
			
		
	}
		
		
	

}
