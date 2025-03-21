package tp1_Ejercicio2;

import java.util.Scanner; 
/*
Escriba un método de clase que dado un número n devuelva un nuevo arreglo de tamaño n 
con los n primeros múltiplos enteros de n mayores o iguales que 1. 
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {n*k donde k : 1..k} 
Agregue al programa la posibilidad de probar con distintos valores de n ingresandolos por 
teclado, mediante el uso de System.in. La clase Scanner permite leer de forma sencilla 
valores de entrada.
*/

public class Multiplos {

	public static int[] multiplosN (int i) {
			int [] multiplos = new int[i];
			for (int j =0; j<i; j++) {
				multiplos[j]= i * (j + 1);
			}
			return multiplos;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //incializo scanner.
        System.out.println("Ingrese el valor de n: ");
    	  int n = scanner.nextInt(); //leo de teclado un entero.
        // Corroboro el ingreso de una n válida. 
    	  boolean noValido = true;
        while (noValido) {
          if (n>=1) {
        	  noValido = false;
        	}
        	else {
        		System.out.println("Ingreso no valido, ingrese un número igual o mayor a 1");
        		n = scanner.nextInt(); //leo de teclado un entero
        	}
        }
        // Genero el arreglo con un valor de n válido;
        int[] multiplos = multiplosN(n);
        // Imprimo
        System.out.println("Los primeros " + n + " múltiplos de " + n + " son:");
        for (int i=0; i<n;i++) {
        	System.out.println(multiplos[i]);
        }
        scanner.close();
        }
    }

