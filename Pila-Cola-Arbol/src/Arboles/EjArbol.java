package Arboles;

import java.util.Scanner;

public class EjArbol {
	public static void main(String[] args) {
		ArbolB A = new ArbolB();
		int indice;
		int opc = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("****BIENVENIDO A ÁRBOL BINARIO ORDENADO****");
		do {
			System.out.println("MENÚ\n");
			System.out.println("1.Insertar");
			System.out.println("2.Eliminar");
			System.out.println("3.Recorrido en Pre orden");
			System.out.println("4.Recorrido en In orden");
			System.out.println("5.Recorrido en Pos orden");
			System.out.println("6.Salir");
			System.out.println("seleccione opción --->\n");
			opc = leer.nextInt();
			switch (opc) {
			case 1:
				System.out.println("Dame el número a insertar\n");
				int p = leer.nextInt();
				A.InsertaNodo(p);
				break;
			case 2:
				break;
			case 3:
				System.out.print("El recorrido en Preorden es: ");
				A.Preorden(A.raiz);
				System.out.println();
				break;
			case 4:
				System.out.print("El recorrido en Inorden es: ");
				A.Inorden(A.raiz);
				System.out.println();
				break;
			case 5:
				System.out.print("El recorrido en Postorden es: ");
				A.PostOrden(A.raiz);
				System.out.println();
				break;
			}// fin switch
		} while (opc != 6);// fin do
	}
}
