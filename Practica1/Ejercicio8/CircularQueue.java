package tp1_Ejercicio8;

public class CircularQueue <T> extends Queue<T>{

	// Rota los elementos de la cola y retorna el elemento rotado
	
	public T shift () {
		if (isEmpty()) {
            throw new RuntimeException("La cola está vacía. No se puede rotar.");
        }
		T dato = this.dequeue();
		this.enqueue(dato);
		return dato;
	}
}
