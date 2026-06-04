public class HospitalConfig {

    private String hospitalName;
    private String databaseUrl;

    public HospitalConfig() {
        this.hospitalName = "Hospital Central";
        this.databaseUrl = "localhost";
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }
}