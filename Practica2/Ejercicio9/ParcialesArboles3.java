package tp2_Ejercicio9;
import tp2_Ejercicio2.BinaryTree;

public class ParcialArboles3 {

public ParcialArboles3() {
}

public BinaryTree<Nodo> sumAndDif(BinaryTree<Integer> arbol) {
    return calcularSumayDif(arbol,0, 0);
}

 private BinaryTree<Nodo> calcularSumayDif (BinaryTree <Integer> arbol, int suma, int padre ) {
    if (arbol == null) {
		return null; 
	}
    
    Nodo nod = new Nodo();
    nod.setSuma(arbol.getData() + suma);
    nod.setDiferencia(arbol.getData() - padre);
    
    
    BinaryTree<Nodo> nuevoArbol = new BinaryTree<>(nod);
    if (arbol.hasLeftChild()) {
        nuevoArbol.addLeftChild(calcularSumayDif(arbol.getLeftChild(), nod.getSuma(), arbol.getData()));
    }
    if (arbol.hasRightChild()) {
        nuevoArbol.addRightChild(calcularSumayDif(arbol.getRightChild(), nod.getSuma(), arbol.getData()));
    }

    return nuevoArbol; 
 }
 
 
 public static void printTree(BinaryTree<Nodo> tree) {
     if (tree == null || tree.getData() == null) {
         return;
     }
     System.out.println("Suma: " + tree.getData().getSuma() + ", Diferencia: " + tree.getData().getDiferencia());
     printTree(tree.getLeftChild());
     printTree(tree.getRightChild());
 }

 
 public static void main(String[] args) {
     BinaryTree<Integer> arbol = new BinaryTree<>(10); 
     arbol.addLeftChild(new BinaryTree<>(5));
     arbol.addRightChild(new BinaryTree<>(15));


     arbol.getLeftChild().addLeftChild(new BinaryTree<>(3)); 
     arbol.getLeftChild().addRightChild(new BinaryTree<>(7)); 

     arbol.getRightChild().addLeftChild(new BinaryTree<>(12)); 
     arbol.getRightChild().addRightChild(new BinaryTree<>(20));

     ParcialArboles3 parcial = new ParcialArboles3();
     BinaryTree<Nodo> resultado = parcial.sumAndDif(arbol);

     printTree(resultado);
 }

}

