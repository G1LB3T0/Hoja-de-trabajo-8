package TEST;
import src.HeapUsingIterativeBinaryTree;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Comparator;

public class HeapUsingIterativeBinaryTreeTest {

    @Test
    public void testInsert() {
        Comparator<Integer> priorityComparator = Comparator.naturalOrder();
        HeapUsingIterativeBinaryTree<Integer, String> heap = new HeapUsingIterativeBinaryTree<>(priorityComparator);

        heap.Insert(10, "Value1");
        heap.Insert(5, "Value2");
        heap.Insert(15, "Value3");

        assertEquals(3, heap.count());
        assertFalse(heap.isEmpty());
    }

    @Test
    public void testRemove() {
        Comparator<Integer> priorityComparator = Comparator.naturalOrder();
        HeapUsingIterativeBinaryTree<Integer, String> heap = new HeapUsingIterativeBinaryTree<>(priorityComparator);

        heap.Insert(10, "Value1");
        heap.Insert(5, "Value2");
        heap.Insert(15, "Value3");

        assertEquals("Value3", heap.remove());
        assertEquals("Value1", heap.remove());
        assertEquals("Value2", heap.remove());
        assertTrue(heap.isEmpty());
    }
}
