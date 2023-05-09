package bingo;

public class Juego {

	public static String jugar(Carton carton1,Carton carton2,Carton carton3,Carton carton4,Carton carton5){
		
		String devolver = "";
		
		boolean hayganador = false;
		
		
		Bombo bingoo = new Bombo();
		while(!hayganador){
			
			int bola = bingoo.pedirNumero();
			
			carton1.comprobarNumero(bola);
			carton2.comprobarNumero(bola);
			carton3.comprobarNumero(bola);
			carton4.comprobarNumero(bola);
			carton5.comprobarNumero(bola);
			
			
			if(carton1.getNumerosCarton().size()==0) {
				hayganador = true;
				devolver = "Ha ganado "+carton1.getNombre();
			}
			else if(carton2.getNumerosCarton().size()==0) {
				hayganador = true;
				devolver = "Ha ganado "+carton2.getNombre();
			}
			else if(carton3.getNumerosCarton().size()==0) {
				hayganador = true;
				devolver = "Ha ganado "+carton3.getNombre();
			}
			else if(carton4.getNumerosCarton().size()==0) {
				hayganador = true;
				devolver = "Ha ganado "+carton4.getNombre();
			}
			else if(carton5.getNumerosCarton().size()==0) {
				hayganador = true;
				devolver = "Ha ganado "+carton5.getNombre();
			}
			
			
		}
		
		
		
		return devolver;
		
		
		
	}
}
