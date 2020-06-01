
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
        if(resolucion == 1080){
            resolucionHD = "FullHD";
        }
        else{
            resolucionHD = "HD";
        }
        return resolucionHD;
    }
    
    public double getPrecio(){
        double precio = 0;
        if(getCalidad().equals("FullHD")){
            precio = 10;
        }
        else{
            precio = 5;
        }
        if(getAno() < 2000){
            precio = (precio * 0.50);
        }
        return precio;
    }
}