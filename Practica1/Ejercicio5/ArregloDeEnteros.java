package tp1_Ejercicio5;


/*Dado un arreglo de valores tipo entero se desea calcular el valor máximo, mínimo, y promedio 
en un único método. Escriba tres métodos de clase, donde respectivamente: 
a. Devuelva lo pedido por el mecanismo de retorno de un método en Java ("return"). 
b. Devuelva lo pedido interactuando con algún parámetro (el parámetro no puede ser de 
tipo arreglo). 
c. Devuelva lo pedido sin usar parámetros ni la sentencia "return".*/


public class ArregloDeEnteros {

	public static int [] devolverConReturn (int [] arreglo) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int cant = 0;
		int suma = 0;
		for (int num : arreglo) {
			if (num<min) {
				min = num;
			}
			if (num>max) {
				max = num;
			}
			cant++;
			suma = suma + num;
		}
		int [] arr = new int[]{min,max, (suma/cant)};
		return arr;
	}
	
	public static class Resultados {
	    public int maximo;
	    public int minimo;
	    public int promedio;
	}
	
	public static void devolverConParametro (int [] arreglo, Resultados res) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int cant = 0;
		int suma = 0;
		for (int num : arreglo) {
			if (num<min) {
				min = num;
			}
			if (num>max) {
				max = num;
			}
			cant++;
			suma += num;
		}
		res.maximo = max;
		res.minimo = min;
		res.promedio = (suma/cant);
	}
	
	public class CalculadoraGlobal {
	    public static int maximo;
	    public static int minimo;
	    public static int promedio;

	    public static void calcularValores(int[] arreglo) {
	        maximo = Integer.MIN_VALUE;
	        minimo = Integer.MAX_VALUE;
	        int suma = 0;
	        for (int valor : arreglo) {
	            if (valor > maximo) maximo = valor;
	            if (valor < minimo) minimo = valor;
	            suma += valor;
	        }
	        promedio = suma / arreglo.length;
	    }
	}
	
	public static void main(String[] args) {
		int [] arreglo = new int[] {1,16,7,9};
		Resultados resul = new Resultados();
		int [] resultado = new int[3];
		
		resultado = devolverConReturn(arreglo);
		System.out.println("min: " + resultado[0] + ", max: " + resultado[1] + ", prom: " + resultado[2]);
		devolverConParametro(arreglo,resul);
		System.out.println("min: " + resul.minimo + ", max: " + resul.maximo + ", promedio: " + resul.promedio );
	}
}
