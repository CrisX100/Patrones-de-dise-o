public class LegacyMonitor implements Cloneable {

    private String monitorId;
    private int batteryLevel;

    public LegacyMonitor(String monitorId, int batteryLevel) {
        this.monitorId = monitorId;
        this.batteryLevel = batteryLevel;
    }

    public void showStatus() {
        System.out.println("Monitor ID: " + monitorId);
        System.out.println("Nivel de Bateria: " + batteryLevel + "%");
    }

    public void establishConnection() {
        System.out.println("Legacy connection established");
    }

    public void transmitInformation() {
        System.out.println("Sending medical data");
    }

    @Override
    public LegacyMonitor clone() {
        try {
            return (LegacyMonitor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }


    }
}