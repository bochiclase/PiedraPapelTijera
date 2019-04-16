import java.util.Random;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		Random r = new Random(); 
		int ia;
		Objetos contadores = new Objetos();
		
		while(contadores.getContadorjugador() == 3 || contadores.getContadoria() == 3) {
		ia =r.nextInt(4)+1;
		System.out.println("¿Piedra, papel o tijera?");
		System.out.println("Seleciona una opcion:");
		System.out.println("1. Piedra");
		System.out.println("2. Papel");
		System.out.println("3. Tijera");
		int opcion = s.nextInt();
		contadores.jugar(opcion, ia);
		}
		s.close();
		
	}
}
