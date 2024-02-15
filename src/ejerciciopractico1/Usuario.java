/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Venta PC
 */
public class Usuario {
    private String nombre;
    private int cedula;
    private int dinero;
    private Vehiculo vehiculo = null;

    public Usuario(String nombre, int cedula, int dinero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.dinero = dinero;
    }
    
    public void comprar(){
        if(500<=dinero && dinero <2000){
            vehiculo= new Caballo("Americano", 3, "Hambriento");
            System.out.println("Vehiculo comprado: "+vehiculo.getInfo());
        }else if(2000<=dinero && dinero < 50000){
            vehiculo = new Automovil("Dodge", 2006, "Charger", 3);
            System.out.println("Vehiculo comprado: "+vehiculo.getInfo());
        }else if(50000<=dinero){
            vehiculo = new Avion("Boeing 2707", 1960, 93, 4);
            System.out.println("Vehiculo comprado: "+vehiculo.getInfo());
        }else{
            System.out.println("No puede comprar ningún vehículo");
        }
    }
    
    
    public void manejar(){
        if (vehiculo!=null){
            int manejar = 0;
            while(manejar == 0){
                String temp =JOptionPane.showInputDialog("Vehiculo: "+vehiculo.getInfo()+ "\nOpciones: \n1.Acelerar\n2.Desacelerar\n3.Frenar\n4.Salir");
                
                if("1".equals(temp)){
                    vehiculo.aumentarLaVelocidad();
                }else if("2".equals(temp)){
                    vehiculo.disminuirLaVelocidad();
                }else if("3".equals(temp)){
                    vehiculo.frenar();
                }else{
                    manejar = 1;
                }
            }
        }else{
            System.out.println("No tiene un vehiculo");
        }
    }
}
