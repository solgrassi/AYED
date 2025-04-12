package tp2_Ejercicio6;
import tp2_Ejercicio2.BinaryTree;

public class Transformacion {
private BinaryTree<Integer> arbol = new BinaryTree<>();

	private void cargarArbol (BinaryTree <Integer> ar) {
		ar.setData(1);
		ar.addLeftChild(new BinaryTree<>(2));
		ar.getLeftChild().addRightChild(new BinaryTree <>(4));
		ar.addRightChild(new BinaryTree<>(3));
		ar.getRightChild().addRightChild(new BinaryTree <>(6));
		ar.getRightChild().addLeftChild(new BinaryTree<>(5));
		ar.getRightChild().getLeftChild().addLeftChild(new BinaryTree<>(7));
		ar.getRightChild().getLeftChild().addRightChild(new BinaryTree<>(8));
	}
	
	public Transformacion () {
		cargarArbol(arbol);
	}
	public BinaryTree<Integer> suma() {
		calcularSuma(arbol);
		return arbol;
	}
	
	private int calcularSuma (BinaryTree<Integer> nodo) {
		if (nodo == null) {
			return 0;
		}
		
		int sumaIzq = 0;
		if (nodo.hasLeftChild()) {
			 sumaIzq = calcularSuma(nodo.getLeftChild());
		}
		int sumaDer = 0;
		if (nodo.hasRightChild()) {
		 sumaDer = calcularSuma(nodo.getRightChild());
		}
		
		int original = nodo.getData();
		
		nodo.setData(sumaIzq + sumaDer);
		
		return original + nodo.getData();
		
	}

	public static void main (String args[]) {
		Transformacion t = new Transformacion();
		BinaryTree<Integer> arbol = new BinaryTree<>();
		arbol = t.suma();
		arbol.entreNiveles(0, 3);
	
}
}
