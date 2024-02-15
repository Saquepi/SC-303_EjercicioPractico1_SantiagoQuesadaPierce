/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Venta PC
 */
public class Caballo extends Vehiculo{
    private String raza;
    private int edad;
    private String hambre;
    private int velocidad = 0;

    public Caballo(String raza, int edad, String hambre) {
        this.raza = raza;
        this.edad = edad;
        this.hambre = hambre;
    }

    @Override
    public void aumentarLaVelocidad(){
        if (velocidad < 60){
            velocidad += 5;
            System.out.println("Velocidad aumentada -- Velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("Velocidad máxima alcanzada -- Velocidad actual: "+velocidad+"km/h");
        }
    }

    @Override
    public void disminuirLaVelocidad(){
        if (velocidad > 0){
            velocidad -= 5;
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
            System.out.println("Relincho");
        }
    }
    
    
    @Override
    public String getInfo(){
        return "Raza: " + raza + " /Edad: " + edad + " /Hambre: " +hambre;
    }
    
    
}
