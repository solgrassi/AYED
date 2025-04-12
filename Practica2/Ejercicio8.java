package tp2_Ejercicio8;
import tp2_Ejercicio2.BinaryTree;

public class ParcialArboles2 {
	
	public ParcialArboles2 () {
	}

	
	 public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
		 //llegue al final del arbol1
		 if (arbol1 == null) {
			 return true;
		 }
		 //arbol2 es null pero arbol1 no
		 if (arbol2 == null) {
			 return false;
		 }
		 //si los datos no coinciden
		 if (!arbol1.getData().equals(arbol2.getData())) {
			 return false;
		 }
		boolean prefIzq = true;
		if (arbol1.hasLeftChild()) {
			if (arbol2.hasLeftChild()) {
				//si ambos tienen hijo izquierdo
				prefIzq = esPrefijo(arbol1.getLeftChild(), arbol2.getLeftChild());
			}
			//si arbol1 tiene pero arbol2 no
			else
				return false;
		}
		boolean prefDer = true;
		if (arbol1.hasRightChild()) {
			if( arbol2.hasRightChild()) {
				prefDer= esPrefijo(arbol1.getRightChild(), arbol2.getRightChild());
			}
			else
				return false;
		}
		// ambos lados deben coincidir para que devuelva true
		 return prefIzq && prefDer;
	 }
	 
	 public static void main (String args[]) {
		// Crear Árbol 1 (Prefijo)
		 BinaryTree<Integer> arbol1 = new BinaryTree<>(7);
		 arbol1.addLeftChild(new BinaryTree<>(3));
		 arbol1.addRightChild(new BinaryTree<>(8));
		 arbol1.getLeftChild().addLeftChild(new BinaryTree<>(1));

		 // Crear Árbol 2 (Con Prefijo y extensión adicional)
		 BinaryTree<Integer> arbol2 = new BinaryTree<>(7);
		 arbol2.addLeftChild(new BinaryTree<>(3));
		 arbol2.addRightChild(new BinaryTree<>(8));
		 arbol2.getLeftChild().addLeftChild(new BinaryTree<>(1));
		 arbol2.getLeftChild().addRightChild(new BinaryTree<>(5));
		 arbol2.getLeftChild().getRightChild().addLeftChild(new BinaryTree<>(4));
		 arbol2.getLeftChild().getRightChild().addRightChild(new BinaryTree<>(6));

		 ParcialArboles2 prueba = new ParcialArboles2();
		 
		 System.out.print(prueba.esPrefijo(arbol1, arbol2));
	 }
}
