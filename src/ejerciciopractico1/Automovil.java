/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Venta PC
 */
public class Automovil extends Vehiculo{
    private String marca;
    private int year;
    private String modelo;
    private int tmnMotor;
    
    private int velocidad=0;
    
    @Override
    public void aumentarLaVelocidad(){
        if (velocidad < 150){
            velocidad += 15;
            System.out.println("Velocidad aumentada -- Velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("Velocidad máxima alcanzada -- Velocidad actual: "+velocidad+"km/h");
        }
    }

    @Override
    public void disminuirLaVelocidad(){
        if (velocidad > 0){
            velocidad -= 15;
            System.out.println("Velocidad disminuida -- Velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("No puede desacelerar más -- Velocidad actual: "+velocidad+"km/h");
        }
    }
    
    
    @Override
    public void frenar(){
        velocidad = 0;
        System.out.println("Frenado exitoso -- Velocidad actual: "+velocidad+"km/h");
    }
    
    @Override
    public void encenderAlarma(){
        System.out.println("Encendiendo alarma");
        for (int i = 0; i < 10; i++) {
            System.out.println("Bip bip");
        }
    }
    
    
    @Override
    public String getInfo(){
        return "Marca: "+marca+" /Año: "+year+" /Modelo: "+modelo+ " /Tamaño del motor: "+tmnMotor+"m3";
    }

    public Automovil(String marca, int year, String modelo, int tmnMotor) {
        this.marca = marca;
        this.year = year;
        this.modelo = modelo;
        this.tmnMotor = tmnMotor;
    }
    
    
}
