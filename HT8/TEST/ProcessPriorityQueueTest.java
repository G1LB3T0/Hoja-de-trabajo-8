package TEST;
import src.ProcessPriorityQueue;
import src.Process;
import static org.junit.Assert.*;
import org.junit.Test;

public class ProcessPriorityQueueTest {

    @Test
    public void testInsertAndRemoveProcess() {
        ProcessPriorityQueue queue = new ProcessPriorityQueue();
        Process process1 = new Process("ls", "maria30", -20);
        Process process2 = new Process("vi", "juan02", 0);

        queue.insertProcess(process1);
        queue.insertProcess(process2);

        assertEquals(process1, queue.removeProcess());
        assertEquals(process2, queue.removeProcess());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeekProcess() {
        ProcessPriorityQueue queue = new ProcessPriorityQueue();
        Process process = new Process("ls", "maria30", -20);
        queue.insertProcess(process);

        assertEquals(process, queue.peekProcess());
        assertFalse(queue.isEmpty());
    }
}
