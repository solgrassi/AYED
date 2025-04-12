package tp2_Ejercicio5;
import tp2_Ejercicio2.BinaryTree;
import tp1_Ejercicio8.Queue;

public class ProfundidadDeArbolBinario {
private BinaryTree <Integer> arbol = new BinaryTree<>(10);

private void cargarArbol (BinaryTree <Integer> ar) {
	ar.addLeftChild(new BinaryTree<>(5));
	ar.addRightChild(new BinaryTree<>(8));
	ar.getLeftChild().addLeftChild(new BinaryTree<>(7));
	ar.getLeftChild().addRightChild(new BinaryTree<>(9));
	ar.getRightChild().addRightChild(new BinaryTree<>(2));
	ar.getRightChild().addLeftChild(new BinaryTree <>(1));
	ar.getLeftChild().getLeftChild().addRightChild( new BinaryTree <>(1));
	}

public ProfundidadDeArbolBinario() {
	cargarArbol(arbol);
}

public int sumaElementosProfundidad (int p) {
	if (arbol.getData() == null) {
		return -1;
	}
	Queue<BinaryTree<Integer>> cola = new Queue<>();
	cola.enqueue(arbol);
	cola.enqueue(null);
	
	int profActual = 0;
	int suma = 0;
	
	while (!cola.isEmpty() && profActual<=p) {
		 BinaryTree<Integer> nodoActual = cola.dequeue();
		 
		 if (nodoActual != null) {
			 if (profActual == p) {
				 suma += nodoActual.getData();
			 }
			 else  if (profActual < p) {
	                if (nodoActual.hasLeftChild()) {
	                    cola.enqueue(nodoActual.getLeftChild());
	                }
	                if (nodoActual.hasRightChild()) {
	                    cola.enqueue(nodoActual.getRightChild());
	                }
			 }
		 }
		else {
			profActual++;
		if (profActual <= p) {
			if (!cola.isEmpty()) {
				cola.enqueue(null);
			}
		}
		}
	}
	return suma;
}

public static void main (String args[]){
	int nivel = 2;
	ProfundidadDeArbolBinario arbol = new ProfundidadDeArbolBinario();
	System.out.print("La suma en el nivel " + nivel + ", es de: " + arbol.sumaElementosProfundidad(nivel));
}
}
