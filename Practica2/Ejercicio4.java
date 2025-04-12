package tp2_Ejercicio4;
import tp2_Ejercicio2.BinaryTree;

public class RedBinariaLlena {
private BinaryTree <Integer> ar = new BinaryTree<>(10);

	private void cargarArbol (BinaryTree <Integer> ar) {
		ar.addLeftChild(new BinaryTree<>(5));
		ar.addRightChild(new BinaryTree<>(8));
		ar.getLeftChild().addLeftChild(new BinaryTree<>(7));
		ar.getLeftChild().addRightChild(new BinaryTree<>(9));
		ar.getRightChild().addRightChild(new BinaryTree<>(2));
		ar.getRightChild().addLeftChild(new BinaryTree <>(9));
		ar.getLeftChild().getLeftChild().addRightChild( new BinaryTree <>(1));
		}
	
	public int retardoReenvio() {
		this.cargarArbol(ar);
		return mayorRetardo(ar);
	}
	
	
	private int mayorRetardo (BinaryTree<Integer> arbol) {
		if (arbol == null) {
			return 0;
		}
		
		int retardoIzquierdo = 0;
        int retardoDerecho = 0;
        
        if(arbol.hasLeftChild()) {
        	retardoIzquierdo = mayorRetardo(arbol.getLeftChild());
        }
        if(arbol.hasRightChild()) {
        	retardoDerecho = mayorRetardo(arbol.getRightChild()); 
        }

        return arbol.getData() + Math.max(retardoIzquierdo, retardoDerecho);
    }
		
	
	public static void main (String args[]) {
		RedBinariaLlena red = new RedBinariaLlena(); 
		System.out.println("El reenvio mas largo es de: " + red.retardoReenvio() + " segundos.");
	}

}
