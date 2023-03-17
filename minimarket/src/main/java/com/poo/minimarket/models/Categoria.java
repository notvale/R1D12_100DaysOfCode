package com.poo.minimarket.models;


public class Categoria {
    public String CategoriaProducto;
    public String Proveedor;


    public Categoria() {
    }


    public Categoria(String categoriaProducto, String proveedor) {
        CategoriaProducto = categoriaProducto;
        Proveedor = proveedor;
    }


    public String getCategoriaProducto() {
        return CategoriaProducto;
    }


    public void setCategoriaProducto(String categoriaProducto) {
        CategoriaProducto = categoriaProducto;
    }


    public String getProveedor() {
        return Proveedor;
    }


    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    @Override
    public String toString() {
     
        return super.toString();
    }

}