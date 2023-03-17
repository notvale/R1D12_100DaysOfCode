package com.poo.minimarket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.minimarket.models.Categoria;
import com.poo.minimarket.models.Producto;

@SpringBootApplication
public class MinimarketApplication {

//Creación de objetos

Categoria categoriaDefault = new Categoria();
Categoria categoriaCompleta = new Categoria(null, null);

Producto productoDefault = new Producto();
Producto productoCompleto = new Producto(null, null, null, null);



//Boleta: fx que permite guardar un arreglo de una cierta cantidad de productos y que luego los muestra

 
public static void Boleta (ArrayList<Integer> boleta){
Integer suma = 0;

for(int i=0; i<= boleta.size()-1; i++){
	suma = suma + boleta.get(i);

}

System.out.println("El valor total de la boleta ingresada es: " + suma);


}


	public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);


System.out.println("*************************************************************************************");
System.out.println("Bienvenido al sistema de ingreso de boletas, por favor ingrese los siguientes datos: ");
System.out.print("Cantidad de productos vendidos: ");
Integer inQProductos = teclado.nextInt();


Integer inPrecioProducto = 0; 
String inNombreProducto =  "";

//HashMap <String, Integer> ingresoVenta = new HashMap <String, Integer>(); 
ArrayList <Integer> bolets = new ArrayList<Integer>();

//for (int i=1; i<=inQProductos; i++){

//System.out.print("Ingrese nombre del producto "+i + ": ");
//inNombreProducto = teclado.nextLine();

for (int x=1; x<=inQProductos; x++){
System.out.print("Ingrese precio del producto "+x+ ": ");
inPrecioProducto = teclado.nextInt();	

bolets.add(inPrecioProducto);

}

//productoCompleto.setPrecioVenta(inPrecioProducto);

//ingresoVenta.put(inNombreProducto, inPrecioProducto);

/* 
for(String i: ingresoVenta.keySet()){
	System.out.println("key: "+ i + "valor: " + ingresoVenta.get(i));
}

System.out.println(" La boleta ingresa corresponde a los siguientes productos" +ingresoVenta);
*/

//Boleta.add(inPrecioProducto);

Boleta(bolets);
	}
}

	


