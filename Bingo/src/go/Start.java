package go;

import java.util.ArrayList;
import java.util.HashSet;

import bingo.Bombo;
import bingo.Carton;
import bingo.Juego;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bombo bombito = new Bombo();
		
		Carton carton1 = new Carton("Pedro");
		Carton carton2 = new Carton("Mario");
		Carton carton3 = new Carton("Juan");
		Carton carton4 = new Carton("Rodri");
		Carton carton5 = new Carton("David");
		
		carton1.rellenarCarton();
		carton2.rellenarCarton();
		carton3.rellenarCarton();
		carton4.rellenarCarton();
		carton5.rellenarCarton();

		
		System.out.println(Juego.jugar(carton1, carton2, carton3, carton4, carton5));
		
		
		
			
		
	}
		
		
	

}
