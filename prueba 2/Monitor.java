public class Monitor implements Cloneable {

    private String monitorId;
    private int batteryLevel;

    public Monitor(String monitorId, int batteryLevel) {
        this.monitorId = monitorId;
        this.batteryLevel = batteryLevel;
    }

    public void showStatus() {
        System.out.println("Monitor ID: " + monitorId);
        System.out.println("Nivel de Bateria: " + batteryLevel + "%");
    }

    public void establishConnection() {
        System.out.println("Connection established");
    }

    public void transmitInformation() {
        System.out.println("Transmitting medical data");
    }
    

    @Override
    public Monitor clone() {
        try {
            return (Monitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}