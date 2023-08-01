package Convierte;

import javax.swing.JOptionPane;

public class Operacion {

    static void convertir(double deValor, double aValor, String pais){
        // El ingreso del valor a convertir
        String input = JOptionPane.showInputDialog("Introduce el valor que quieres convertir");
        //Uso de la validación de numero
        if(ValidarNumero(input) == true){
            double cantidad = Double.parseDouble(input);

            //La operación de conversión
            double cambio = (cantidad * aValor) / deValor;
        
            cambio = (double) Math.round(cambio * 100d)/100;

            //Salida de resultado
            JOptionPane.showConfirmDialog(null,  "Tienes: " + cambio + " " + pais, "Resultado", JOptionPane.DEFAULT_OPTION);
        } else{
        //Validación fallida
        JOptionPane.showConfirmDialog(null, "Escribe un numero válido sin letras o caracteres especiales", "Error", JOptionPane.DEFAULT_OPTION);
        }
        
        
    }
    //Validación de numero 0-9 sin caracteres especiales
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
