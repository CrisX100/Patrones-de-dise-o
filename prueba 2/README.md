# hospital-system
# Descripción de cada archivo:

Main.java: Clase principal

HospitalConfig.java: Configuración "global" del hospital. Actualmente se pueden crear múltiples configuraciones:
    HospitalConfig a = new HospitalConfig();
    HospitalConfig b = new HospitalConfig();

ICURoom.java:(Sala de cuidados intensivos). Crear una sala requiere:
    ICURoom room1 = new ICURoom();
    ICURoom room2 = new ICURoom();
    ICURoom room3 = new ICURoom();

LegacyMonitor.java: Monitor del nuevo fabricante

DeviceManager.java: Software interno que espera trabajar con cualquier dispositivo médico mediante la interfaz "MedicalDevice"

Estuve implementando el patrone prototype para la creación de las salas medicas
con los monitores cardiacos, alarmas, parámetros de red, configuración de usuarios y protocolos medicos.
Falta implementar el patron singleton y a mi compañero le falta el patrón adapter para el centro de control hospitalario e integracion de equipos de externos respectivamente.



