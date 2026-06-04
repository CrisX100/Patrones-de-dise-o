public class Protocolo_medico  implements Cloneable {

    private String protocoloId;
    private String version;
    private int securityLevel;
    
    public Protocolo_medico(String protocoloId, String version, int securityLevel) {
        this.protocoloId = protocoloId;
        this.version = version;
        this.securityLevel = securityLevel;
    }

    public void showStatus() {
        System.out.println("Protocolo ID: " + protocoloId);
        System.out.println("Version: " + version);
        System.out.println("Security Level: " + securityLevel);
    }
    
    public void establishConnection() {
        System.out.println("Protocolo connection established");
    }

    public void transmitInformation() {
        System.out.println("Sending medical data through Protocolo");
    }

    @Override
    public Protocolo_medico clone() {
        try {
            return (Protocolo_medico) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    
}
