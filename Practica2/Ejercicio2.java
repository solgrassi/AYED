package tp2_Ejercicio2;
import java.util.Queue;
import java.util.LinkedList;


public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		if (this.getData() == null) {
			return 0;
		}
		if (isLeaf()) {
			return 1;
		}
		
		int ladoIzquierdo = hasLeftChild() ? getLeftChild().contarHojas(): 0;
		int ladoDerecho = hasRightChild() ? getRightChild().contarHojas(): 0;
		
	return (ladoIzquierdo + ladoDerecho);
	}
	
	public BinaryTree<T> espejo() {
		if (this.getData() == null) {
	        return null; // Retornar un árbol vacío si esta vacio
	    }
		BinaryTree<T> arbolNuevo = new BinaryTree<>(this.getData());
		
		if (hasLeftChild()) {
			arbolNuevo.addRightChild(getLeftChild().espejo());
		}
		if (hasRightChild()) {
			arbolNuevo.addLeftChild(getRightChild().espejo());
		}
		return arbolNuevo;
	}
	

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		if (this == null || this.getData() == null) {
	        System.out.println("El árbol está vacío.");
	        return;
	    }

	    Queue <BinaryTree<T>> cola = new LinkedList<>();
	    cola.add(this);
	    cola.add(null);

	    int nivelActual = 0;
	    boolean sigue = true;
	    while (!cola.isEmpty() && sigue) {
	        BinaryTree<T> ab = cola.poll();

	        if (ab != null) {
	            // Imprimir el nodo solo si el nivel actual está en el rango [n, m]
	            if (nivelActual >= n && nivelActual <= m) {
	                System.out.print(ab.getData() + " ");
	            }

	            // Encolar los hijos del nodo actual
	            if (ab.hasLeftChild()) {
	                cola.add(ab.getLeftChild());
	            }
	            if (ab.hasRightChild()) {
	                cola.add(ab.getRightChild());
	            }
	        } else {
	            // Cambio de nivel
	            System.out.println(); // Salto de línea para separar niveles
	            nivelActual++;

	            // Si hemos superado el nivel m, terminamos
	            if (nivelActual > m) {
	                sigue = false;
	            }

	            // Añadir marcador para el siguiente nivel si quedan nodos
	            if (!cola.isEmpty()) {
	                cola.add(null);
	            }
	        }
	    }
	    
	}
	
	public void preOrden () {
		System.out.print(this.getData() + " /// ");
    	if (this.hasLeftChild()) {
    		this.getLeftChild().preOrden();
    	}
    	if (this.hasRightChild()) {
    		this.getRightChild().preOrden();
    	}
    }
		
}
