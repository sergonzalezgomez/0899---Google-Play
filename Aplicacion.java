public class Aplicacion extends Producto
{
    private double espacio;
    private Categoria categoria;
    

    public Aplicacion(String nombreProducto, double espacio, Categoria categoria)
    {
        super(nombreProducto);
        this.espacio = espacio;
        this.categoria = categoria;
    }

    public String getNombre(){
        return getNombreProducto();
    }

    public double getTamanoEnMB(){
        return espacio;
    }

    public String getCategoria(){
        String categ = "";
        switch(categoria.toString()){
            case "JUEGOS": 
            categ = "Juegos"; 
            break;

            case "COMUNICACIONES": 
            categ = "Comunicaciones"; 
            break;

            case "PRODUCTIVIDAD": 
            categ = "Productividad"; 
            break;

            case "MULTIMEDIA": 
            categ = "Multimedia"; 
            break;
        }
        return categ;
    }
    
    public double getPrecio(){
        double precio = 0;
        if(getVecesComprado() >= 2){
            if(getCategoria().equals("Juegos")){
                precio = 5;
            }
            if(getCategoria().equals("Comunicaciones")){
                precio = 2;
            }
            if(getCategoria().equals("Productividad")){
                precio = 10;
            }
            if(getCategoria().equals("Multimedia")){
                precio = 2;
            }
        }
        else{
            precio = 0.99;
        }
        return precio;
    }
}
