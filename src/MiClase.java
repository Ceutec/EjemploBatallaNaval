import java.util.Scanner;


public class MiClase {
	
	static void imprimirTablero(char tablero[][])
	{
		for(int fila = 0; fila < 5; fila++)
		{
			for(int col = 0; col < 5; col++)
			{
				System.out.print(tablero[fila][col]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String args[])
	{
		char tablero[][] = new char[5][5];
		for(int fila = 0; fila < 5; fila++)
		{
			for(int col = 0; col < 5; col++)
			{
				tablero[fila][col] = '-';
			}
		}
		
		imprimirTablero(tablero);
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Ingrese fila: ");
			int fila = s.nextInt();
			
			System.out.print("Ingrese columna: ");
			int columna = s.nextInt();
			
			tablero[fila][columna] = 'X';
			
			imprimirTablero(tablero);
		}
		
//		int notas[][] = new int[4][3];
//		Scanner s = new Scanner(System.in);
//		while(true)
//		{
//			System.out.print("Ingrese 1 para ver notas 2 para ingresar y 3 para salir: ");
//			int opcion = s.nextInt();
//			if(opcion==1)
//			{
//				System.out.print("Ingrese el numero del alumno: ");
//				int alumno = s.nextInt();
//				for(int i = 0; i < 3; i++)
//				{
//					System.out.println(notas[alumno][i]);
//				}
//			}
//			if(opcion==2)
//			{
//				System.out.print("Ingrese el numero del alumno: ");
//				int alumno = s.nextInt();
//				for(int i=0; i < 3; i++)
//				{
//					System.out.print("Ingrese una nota: ");
//					notas[alumno][i] = s.nextInt();
//				}
//			}
//			if(opcion==3)
//			{
//				break;
//			}
//		}
	}
}
