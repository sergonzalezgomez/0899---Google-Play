public class Usuario
{
    private String nombreUsuario;
    
    public Usuario(String nombreUsuario)
    {  
        this.nombreUsuario = nombreUsuario;
    }

    public void setUsuario(String usuarioNuevo) {
        nombreUsuario = usuarioNuevo;
    }
    
    public String getNombreCuenta() {
        return nombreUsuario;
    }
}
