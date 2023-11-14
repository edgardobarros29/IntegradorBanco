package modelo;

public class Usuario {

    private String DNI;
    private String Usuario;
    private String Contraseña;
    
    public Usuario(String contraseña){
        this.Contraseña = contraseña;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Contrase\u00f1a=" + Contraseña + '}';
    }
    
    
}
