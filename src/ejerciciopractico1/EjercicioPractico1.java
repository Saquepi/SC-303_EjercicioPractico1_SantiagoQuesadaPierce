/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1;

import javax.swing.JOptionPane;

/**
 *
 * @author Venta PC
 */
public class EjercicioPractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean principal = true;
        while(principal){
            try{
                String name = JOptionPane.showInputDialog("Introduzca su nombre");
                int cedula = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su número de cédula"));
                int dinero = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido "+name +" "+ cedula+", introduzca cuanto dinero desea gastar"));

                Usuario user = new Usuario(name,cedula,dinero);


                while(principal){
                    String temp = JOptionPane.showInputDialog("\nOpciones: \n1.Comprar\n2.Manejar\n3.Salir");

                    if("1".equals(temp)){
                        user.comprar();
                    }else if("2".equals(temp)){
                        user.manejar();
                    }else{
                        principal=false;
                    }

                }
            }catch(NumberFormatException e){
                System.out.println("Error al introducir la información");
            }
        }
    }
    
}
