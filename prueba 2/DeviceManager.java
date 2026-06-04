public class DeviceManager {
    public void connectDevice(MedicalDevice device) {
        device.connect();
        device.sendData();
    }
}

