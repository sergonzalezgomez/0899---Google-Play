
public class Pelicula extends ProductoMultimedia 
{
    private int duracion;
    private int resolucion;
    private String resolucionHD;
    
    public Pelicula(String nombreProducto, int anoCreacion, int duracion, int resolucion)
    {
        super(nombreProducto, anoCreacion);
        this.resolucion = resolucion;
        this.duracion = duracion;
    }
    
    public int getDuracion(){
        return duracion;
    }
    
    public String getCalidad(){
        String resolucionHD = "";
        return resolucionHD;
    }
    
    public double getPrecio(){
        double precio = 0;
        return precio;
    }
}