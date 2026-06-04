public class Alarma  implements Cloneable {

    private String alarmId;
    private int severityLevel;

    public Alarma(String alarmId, int severityLevel) {
        this.alarmId = alarmId;
        this.severityLevel = severityLevel;
    }

    public void showStatus() {
        System.out.println("Alarm ID: " + alarmId);
        System.out.println("Severity Level: " + severityLevel);
    }

     @Override
    public Alarma clone() {
        try {
            return (Alarma) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void triggerAlarm() {
        System.out.println("Alarm triggered!");
    }
    
}
