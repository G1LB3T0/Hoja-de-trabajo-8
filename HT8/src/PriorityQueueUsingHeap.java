import java.util.Comparator;

public class PriorityQueueUsingHeap<P, V> {
    private HeapUsingIterativeBinaryTree<P, V> heap;

    // Utiliza el comparador proporcionado para inicializar el heap
    public PriorityQueueUsingHeap(Comparator<P> priorityComparator) {
        this.heap = new HeapUsingIterativeBinaryTree<>(priorityComparator);
    }

    // Inserta un elemento con su prioridad en la cola de prioridad
    public void insert(P priority, V value) {
        heap.Insert(priority, value);
    }

    // Elimina y retorna el elemento con la mayor prioridad de la cola de prioridad
    public V remove() {
        return heap.remove();
    }

    // Obtiene sin remover el elemento con la mayor prioridad de la cola de prioridad
    public V peek() {
        return heap.get();
    }

    // Verifica si la cola de prioridad está vacía
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Retorna el número de elementos en la cola de prioridad
    public int size() {
        return heap.count();
    }
}
