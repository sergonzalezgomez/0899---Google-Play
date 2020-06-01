import java.util.ArrayList;

public class GooglePlay {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    public GooglePlay() {
        usuarios = new ArrayList<Usuario>();
        productos = new ArrayList<>();
    }
    
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public int getNumeroUsuarios(){
        return usuarios.size();
    }
    
    public void addProducto(Producto producto){
        productos.add(producto);
    }

    public int getNumeroProductos(){
        return productos.size();
    }
    
    public double comprar(String nombreCuenta, String nombreProducto){
        double precio = -1;
        for(Usuario usuarioActual : usuarios){
            if(!nombreCuenta.equals(usuarioActual)){
                precio = -1;
            }

        }
        if(precio != -1){
            for(Producto productoActual : productos){
                if(nombreProducto.equals(productoActual)){
                    precio = productoActual.getPrecio();
                    productoActual.incrementarVecesComprado();
                }
                else{
                    precio = -1;
                }
            }
        }
        return precio;
    }
}

