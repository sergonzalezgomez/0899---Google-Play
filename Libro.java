public class Libro extends ProductoMultimedia 
{
    private int numPaginas;
    private boolean libroFiccion;

    public Libro(String nombreProducto, int anoCreacion, int numPaginas, boolean libroFiccion)
    {
        super(nombreProducto, anoCreacion);
        this.numPaginas = numPaginas;
        this.libroFiccion = libroFiccion;
    }
    
    public int getNumeroPaginas(){
        return numPaginas;
    }
    
    public boolean getFiccion(){
        return libroFiccion;
    }
    
    public double getPrecio(){
        double precio = 0;
        precio = (numPaginas / 100) * (getAno() - 2010);
        return precio;
    }
}