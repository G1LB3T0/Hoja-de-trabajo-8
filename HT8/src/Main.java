package src;

/**
 *
 */

/**
 * @author Luis Gilberto Gonzales
 * @author Camila Richter
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ProcessPriorityQueue processQueue = new ProcessPriorityQueue();

        // Lee el archivo de texto y procesa cada línea
        try (BufferedReader br = new BufferedReader(new FileReader("procesos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Divide la línea en partes utilizando la coma como separador
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    // Extrae los datos del proceso
                    String processName = parts[0];
                    String userName = parts[1];
                    int niceValue = Integer.parseInt(parts[2]);

                    // Crea un nuevo proceso y lo inserta en la cola de prioridad
                    Process process = new Process(processName, userName, niceValue);
                    processQueue.insertProcess(process);
                } else {
                    System.err.println("Error: Formato incorrecto en línea - " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

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

