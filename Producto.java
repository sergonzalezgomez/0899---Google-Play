
public abstract class Producto
{
    private String nombreProducto;
    private int vecesComprado;
    
    public Producto(String nombreProducto)
    {
        this.nombreProducto = nombreProducto;
        vecesComprado = 0;
    }
    
    public String getNombreProducto(){
        return nombreProducto;
    }
    
    public void incrementarVecesComprado(){
       vecesComprado++;
    }
    
    public abstract double getPrecio();
    
    public int getVecesComprado(){
        return vecesComprado;
    }
    
    public void vender() {
        vecesComprado++;
    }
}

