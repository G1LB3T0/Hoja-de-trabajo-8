public class ExamplePriorityQueue {

    public static void main(String[] args) {
        ProcessPriorityQueue processQueue = new ProcessPriorityQueue();

        // Inserta los procesos en la cola
        processQueue.insertProcess(new Process("ls", "maria30", -20));
        processQueue.insertProcess(new Process("vi", "juan02", 0));
        processQueue.insertProcess(new Process("firefox", "rosa20", 5));
        processQueue.insertProcess(new Process("cat", "juan02", 5));

        // Imprime los procesos en el orden en que se retiran de la cola, según su prioridad
        while (!processQueue.isEmpty()) {
            Process process = processQueue.removeProcess();
            System.out.println(String.format("%s,%s,%d,PR=%d",
                    process.getProcessName(),
                    process.getUserName(),
                    process.getNiceValue(),
                    process.getPriority()));
        }
    }
}
