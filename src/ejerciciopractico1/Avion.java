/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Venta PC
 */
public class Avion extends Vehiculo{
    private String marca;
    private int year;
    private int size;
    private int cantMotores;
    
    private int velocidad=0;

    public Avion(String marca, int year, int size, int cantMotores) {
        this.marca = marca;
        this.year = year;
        this.size = size;
        this.cantMotores = cantMotores;
    }
    
    
    
    @Override
    public void aumentarLaVelocidad(){
        if (velocidad < 900){
            velocidad += 60;
            System.out.println("Velocidad aumentada -- Velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("Velocidad máxima alcanzada -- Velocidad actual: "+velocidad+"km/h");
        }
    }

    @Override
    public void disminuirLaVelocidad(){
        if (velocidad > 0){
            velocidad -= 60;
            System.out.println("Velocidad disminuida -- Velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("No puede desacelerar más -- Velocidad actual: "+velocidad+"km/h (Avión en caída)");
        }
    }
    
    
    @Override
    public void frenar(){
        velocidad = 0;
        System.out.println("Frenado exitoso -- Velocidad actual: "+velocidad+"km/h (Avión en caída)");
    }
    
    @Override
    public void encenderAlarma(){
        System.out.println("Encendiendo alarma");
        for (int i = 0; i < 10; i++) {
            System.out.println("HONK HONK");
        }
    }
    
    
    @Override
    public String getInfo(){
        return "Marca: "+marca+" /Año: "+year+" /Tamaño: "+size+"m /Cantidad de motores: "+cantMotores;
    }
}
