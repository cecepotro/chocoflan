/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.chocoflan.ui;

import java.util.List;
import java.util.Scanner;
import mx.itson.chocoflan.entidades.Impuesto;
import mx.itson.chocoflan.entidades.Producto;

/**
 *
 * @author jesus
 */
public class Main {
    
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduza el nombre:");
        String nombre =in.nextLine();
        
        System.out.println("Introduza la descripción:");
        String descripcion = in.nextLine();
        
        System.out.println("Introduza el precio:");
        double precio = in.nextDouble();
        
        System.out.println("Indique 1 si es producto o 2 si es servicio:");
        int tipo = in.nextInt();
        
        if(tipo == 1){
            System.out.println("Introduza la cantidad:");
            int cantidad = in.nextInt();
            
            Producto p = new Producto();
            p.setNombre(nombre);
            p.setDescripcion(descripcion);
            p.setPrecio(precio);
            p.setCantidad(cantidad);
            
            System.out.println("***************************");
            System.out.println(p.toString());
            
            System.out.println("SUBTOTAL: " + p.calcularTotal());
            
            List<Impuesto> impuestos = p.calcularImpuestos();
            for(Impuesto i : impuestos){
                System.out.println(i.getNombre() + " = " + i.getMonto());
            }
            
            System.out.println("TOTAL: " + p.calcularTotal(impuestos));
                    
            
        }
    }
}
