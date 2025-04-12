package tp2_Ejercicio7;
import tp2_Ejercicio2.BinaryTree;

public class ParcialArboles {
private BinaryTree <Integer> arbol = new BinaryTree<>();

	public ParcialArboles (BinaryTree<Integer> ar) {
		this.arbol = ar;
	}
	public boolean isLeftTree (int num) {
		BinaryTree<Integer> nodo = buscarNodo(arbol,num);
		if (nodo == null) {
			return false;
		}
			else {
				int nodosIzq = 0;
				if (nodo.hasLeftChild()) {
					nodosIzq = contarUnicos(nodo.getLeftChild());
				}
				else {
					nodosIzq = -1;
				}
		    	int nodosDer = 0;
		    	if (nodo.hasRightChild()) {
		    		nodosDer = contarUnicos(nodo.getRightChild());
		    	}
		    	else
		    		nodosDer = -1;
		    	
		    	return nodosIzq > nodosDer;
			}
	}
	
	private BinaryTree<Integer> buscarNodo (BinaryTree<Integer> ar, int num) {
		
		if (ar == null) {
			return null;
		}
		if (ar.getData() == num ) {
			return  ar;
		}
		BinaryTree<Integer> nodo = null;
		if (ar.hasLeftChild()) {
			nodo = buscarNodo(ar.getLeftChild(), num);
		}
		if (nodo == null && ar.hasRightChild()) {
			nodo = buscarNodo(ar.getRightChild(), num);
		}
		
		return nodo;
	}
	
	private int contarUnicos (BinaryTree<Integer> nodo) {
		if (nodo == null) {
			return 0;
		}
		
		int cantHijos = 0;
		
		if (nodo.hasLeftChild() && !nodo.hasRightChild() || nodo.hasRightChild() && !nodo.hasLeftChild()) {
			cantHijos += 1;
		}
		if (nodo.hasLeftChild()) {
	        cantHijos += contarUnicos(nodo.getLeftChild());
	    }
	    if (nodo.hasRightChild()) {
	        cantHijos += contarUnicos(nodo.getRightChild());
	    }

	    return cantHijos;
		
		}
	
	public static void main(String args[]) {
		BinaryTree<Integer> ar = new BinaryTree<>();
		// raiz
		ar.setData(2);
		// izquierda
		ar.addLeftChild(new BinaryTree<>(7));
		ar.getLeftChild().addRightChild(new BinaryTree <>(6));
		ar.getLeftChild().addLeftChild(new BinaryTree <>(23));
		ar.getLeftChild().getLeftChild().addLeftChild(new BinaryTree <>(-3));
		//derecha
		ar.addRightChild(new BinaryTree<>(-5));
		ar.getRightChild().addLeftChild(new BinaryTree <>(19));
		ar.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(4));
		ar.getRightChild().getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(18));
		
		ParcialArboles prueba = new ParcialArboles(ar);
		System.out.print(prueba.isLeftTree(2));
		
		
	}
}
