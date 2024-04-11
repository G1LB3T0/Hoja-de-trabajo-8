package TEST;
import src.Process;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProcessTest {

    @Test
    public void testGetPriority() {
        Process process = new Process("ls", "maria30", -20);
        assertEquals(100, process.getPriority());
    }

    @Test
    public void testToString() {
        Process process = new Process("ls", "maria30", -20);
        assertEquals("ls,maria30,-20,PR=100", process.toString());
    }
}
