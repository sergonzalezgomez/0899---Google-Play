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
        double costeDeCompra = -1;
        Usuario usuarioABuscar = null;
        Producto productoABuscar = null;
        
        for (int contador1 = 0; contador1 < usuarios.size() && usuarioABuscar == null; contador1++) {
            if (usuarios.get(contador1).getNombreCuenta().equals(nombreCuenta)) {
                usuarioABuscar = usuarios.get(contador1);
            }
        }
        for (int contador2 = 0; contador2 < productos.size() && productoABuscar == null; contador2++) {
            if (productos.get(contador2).getNombreProducto().equals(nombreProducto)) {
                productoABuscar = productos.get(contador2);
            }
        }
        if (usuarioABuscar != null && productoABuscar != null) {
            costeDeCompra = productoABuscar.getPrecio();
            productoABuscar.vender();
        }
        return costeDeCompra;
    }
}

