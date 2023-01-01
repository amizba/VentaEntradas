/**
* Aprende Java desde cero (https://empezandojava.blogspot.com)
*
* @author Amparo Izquierdo Bañez
* @mail amizba@gmail.com
*/
import java.util.Scanner;

public class SalaConciertos {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Zona Primera = new Zona(500);
	Zona Segunda = new Zona(150);
	Zona Tercera = new Zona(50);
	int opcion = 0;
	int opcion2 = 0;
	int n = 0;
	do {
		System.out.println("\n\nSALA CONCIERTOS");
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		System.out.println("Elige una opción: ");
		opcion = sc.nextInt();
		if (opcion == 1) {
			System.out.println("\n\nEn la zona principal hay " + Primera.getEntradasPorVender());
			System.out.println("En la zona de compra venta hay " + Segunda.getEntradasPorVender());
			System.out.println("En la zona vip hay " + Tercera.getEntradasPorVender());
		}
		if (opcion == 2) {
			System.out.println("\n\n1. Primera");
			System.out.println("2. Segunda");
			System.out.println("3. Tercera");
			System.out.print("Elige la zona para la que quieres comprar las entradas: ");
			opcion2 = sc.nextInt();
			System.out.print("¿Cuántas entradas quieres? ");
			n = sc.nextInt();
			switch (opcion2) {
			case 1:
				Primera.vender(n);
				break;
			case 2:
				Segunda.vender(n);
				break;
			case 3:
				Tercera.vender(n);
				break;
			default:
			}
		}
	} while (opcion < 3); // menú principal
	}
	}
