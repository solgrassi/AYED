/*Escriba tres métodos de clase (static) que reciban por parámetro dos números enteros (tipo 
int) a y b e impriman todos los números enteros comprendidos entre a; b (inclusive), uno por 
cada línea en la salida estándar. Para ello, dentro de una nueva clase escriba un método por 
cada uno de los siguientes incisos: 
a. Que realice lo pedido con un for. 
b. Que realice lo pedido con un while. 
c. Que realice lo pedido sin utilizar estructuras de control iterativas (for, while, do 
while).
*/

package tp1_Ejercicio1;

public class EntreNumeros {

	public static void ImprimirConFor (int a, int b) {
		for (int i=a; i<=b; i++) {
			System.out.println(i);
		}
	}
	
	public static void ImprimirConWhile (int a, int b) {
		int i= a;
		while (i<=b) {
			System.out.println(i);
			i++;
		}
			
	}
	
	public static void ImprimirRecursivo (int a, int b) {
		if (a > b) {
			return;
		}
		System.out.println(a);
		ImprimirRecursivo(a + 1,b);
	}
	
	
	public static void main(String[] args) {
        int a = 4;
        int b = 15;
        System.out.println("Imprimo con recursivo");
        ImprimirRecursivo(a, b);
        System.out.println("-----------------------------");
        System.out.println("Imprimo con for");
        ImprimirConFor(a,b);
        System.out.println("-----------------------------");
        System.out.println("Imprimo con recursivo");
        ImprimirConWhile(a,b);
    }
	
}
