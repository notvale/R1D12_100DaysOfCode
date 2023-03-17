package com.poo.minimarket.models;

public class Producto extends Categoria{
    public String NombreProducto;
    public String PrecioVenta;
   

    

public Producto() {
}

public Producto(String categoriaProducto, String proveedor) {
        super(categoriaProducto, proveedor);
    }

public Producto(String categoriaProducto, String proveedor, String nombreProducto, String precioVenta) {
    super(categoriaProducto, proveedor);
    NombreProducto = nombreProducto;
    PrecioVenta = precioVenta;
}

public String getNombreProducto() {
    return NombreProducto;
}

public void setNombreProducto(String nombreProducto) {
    NombreProducto = nombreProducto;
}

public String getPrecioVenta() {
    return PrecioVenta;
}

public void setPrecioVenta(String precioVenta) {
    PrecioVenta = precioVenta;
}

@Override
public String toString() {
    return super.toString() + "Producto [NombreProducto=" + NombreProducto + ", PrecioVenta=" + PrecioVenta + "]";
}

}
