package tp2_Ejercicio3;
import tp2_Ejercicio2.BinaryTree;
import java.util.List;
import java.util.ArrayList;

public class ContadorArbol {
private BinaryTree <Integer> arbol;

	public ContadorArbol(BinaryTree<Integer> arbol) {
		this.arbol = arbol;
	}
	
	// Devuelve una lista de los numeros pares de un arbol con recorrido "inOrden"
	
	public List<Integer> numerosParesInOrden() {
	       List<Integer> numerosPares = new ArrayList<>();
	       inOrden(arbol, numerosPares);
	       return numerosPares;
	}
	
	private void inOrden (BinaryTree <Integer> arbol, List<Integer> L){
		if (arbol == null) {
			return;
		}
	    // Recorrer el subárbol izquierdo
	    if (arbol.hasLeftChild()) {
	        inOrden(arbol.getLeftChild(), L);
	    }

	    // Procesar el nodo actual (la raíz)
	    if (arbol.getData() != null && arbol.getData() % 2 == 0) {
	    L.add(arbol.getData());
	    }

	    // Recorrer el subárbol derecho
	    if (arbol.hasRightChild()) {
	        inOrden(arbol.getRightChild(), L);
	}
	}
	
	// Devuelve una lista de los numeros pares de un arbol con recorrido "postOrden"
	public List<Integer> numerosParesPostOrden(){
		List <Integer> numerosPares = new ArrayList<>();
		postOrden(arbol, numerosPares);
		return numerosPares;
	}
	
	private void postOrden (BinaryTree<Integer> arbol, List<Integer> L) {
		if (arbol == null) {
			return;
		}
		if (arbol.hasLeftChild()) {
			postOrden(arbol.getLeftChild(), L);
		}
		if (arbol.hasRightChild()) {
			postOrden(arbol.getRightChild(), L);
		}
		
		if (arbol.getData() != null && arbol.getData() %2 == 0) {
			L.add(arbol.getData());
		}
	}
	
	
}
