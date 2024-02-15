/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Venta PC
 */
public abstract class Vehiculo {
    
    //acciones manejar
    public void aumentarLaVelocidad(){
        
    }
    public void disminuirLaVelocidad(){
        
    }
    public void frenar(){
        
    }
    public void encenderAlarma(){
        
    }
    
    //acciones distintas
    public int getVelocidad(){
        return 0;
    }
    
    public boolean compra(int dinero){
        return false;
    }
    
    public String getInfo(){
        return "Error";
    }
}
