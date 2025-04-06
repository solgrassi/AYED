package tp2_Ejercicio3;
import tp2_Ejercicio2.BinaryTree;
import java.util.List;

public class TestContador {
	public static void main (String args[]) {
		BinaryTree<Integer> arbol = new BinaryTree<>(10); 
		arbol.addLeftChild(new BinaryTree<>(4));
		arbol.addRightChild(new BinaryTree<>(15));
		arbol.getLeftChild().addLeftChild(new BinaryTree<>(2));
		arbol.getLeftChild().addRightChild(new BinaryTree<>(8));
		
		ContadorArbol contador = new ContadorArbol(arbol);
		
		System.out.println("Números pares (InOrden):");
		List <Integer> numerosParesInOrden = contador.numerosParesInOrden();
		System.out.println(numerosParesInOrden);

		System.out.println("Números pares (PostOrden):");
		List<Integer> numerosParesPostOrden = contador.numerosParesPostOrden();
		System.out.println(numerosParesPostOrden);
	}
}
