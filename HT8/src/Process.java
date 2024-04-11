public class Process {
    private String processName;
    private String userName;
    private int niceValue;
    private int priority; // PR en el rango ajustado de 100 a 139

    public Process(String processName, String userName, int niceValue) {
        this.processName = processName;
        this.userName = userName;
        this.niceValue = niceValue;
        // Calcula PR y lo ajusta al rango de 100 a 139 directamente
        this.priority = 20 + niceValue + 100; // Ajusta el PR al rango correcto sumando 100 directamente
    }

    // Getters
    public String getProcessName() {
        return processName;
    }

    public String getUserName() {
        return userName;
    }

    public int getNiceValue() {
        return niceValue;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return processName + "," + userName + "," + niceValue + ",PR=" + priority;
    }
}

