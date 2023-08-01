package Convierte;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        //Mensaje de inicio
        Object[] inicio = {"siguiente", "cancelar"};
        JOptionPane.showOptionDialog(null, "¡Bienvenido al conversor de monedas!", "Bienvenido", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, inicio, inicio[0]);

       //Selector de moneda de origen
        boolean ejecutar = true;

        while(ejecutar) {
            String origen = JOptionPane.showInputDialog(null, "Elije la moneda de origen", "1. Origen", JOptionPane.QUESTION_MESSAGE, null, new String[]{"MXN","USD","EUR","GBP","JPY","KRW"}, "Seleccione una opción").toString();
            switch(origen) {
                case "MXN":
                Funcion.segundoPaso(Monedas.MXN);
                break;
                case "USD":
                Funcion.segundoPaso(Monedas.USD);
                break;
                case "EUR":
                Funcion.segundoPaso(Monedas.EUR);
                break;
                case "GBP":
                Funcion.segundoPaso(Monedas.GBP);
                break;
                case "JPY":
                Funcion.segundoPaso(Monedas.JPY);
                break;
                case "KRW":
                Funcion.segundoPaso(Monedas.KRW);
                break;
            }
            // Finalizador
            int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
            if (JOptionPane.OK_OPTION == respuesta){
            System.out.println("Selecciona opción Afirmativa");
            }else{
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;                       
            }
  
        }
        
    }
}
