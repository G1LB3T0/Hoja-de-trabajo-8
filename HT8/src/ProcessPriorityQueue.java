import java.util.Comparator;

public class ProcessPriorityQueue {
    private PriorityQueueUsingHeap<Integer, Process> queue;

    public ProcessPriorityQueue() {
        Comparator<Integer> priorityComparator = Comparator.reverseOrder();
        this.queue = new PriorityQueueUsingHeap<>(priorityComparator);
    }

    public void insertProcess(Process process) {
        queue.insert(process.getPriority(), process);
    }

    public Process removeProcess() {
        return queue.remove();
    }

    public Process peekProcess() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

