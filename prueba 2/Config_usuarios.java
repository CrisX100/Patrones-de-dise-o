public class Config_usuarios implements Cloneable {
    private String username;
    private String role;

    public Config_usuarios(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public void showConfig() {
        System.out.println("Username: " + username);
        System.out.println("Role: " + role);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }
    
}
