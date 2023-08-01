package Convierte;

import javax.swing.JOptionPane;

public class Funcion {
    //Función que describe la selección de la segunda moneda

    Operacion operacion = new Operacion();
    
    static void segundoPaso(double deValor){
        String destino = JOptionPane.showInputDialog(null, "Elije la moneda de destino", "2. Destino", JOptionPane.QUESTION_MESSAGE, null, new String[]{"MXN","USD","EUR","GBP","JPY","KRW"}, "Seleccione una opción").toString();
        switch(destino) {
            case "MXN":
            Operacion.convertir(deValor, Monedas.MXN, "Pesos Mexicanos");
            break;
            case "USD":
            Operacion.convertir(deValor, Monedas.USD, "Dolares Estadounidenses");
            break;
            case "EUR":
            Operacion.convertir(deValor, Monedas.EUR, "Euros");
            break;
            case "GBP":
            Operacion.convertir(deValor, Monedas.GBP, "Libras Esterlinas");
            break;
            case "JPY":
            Operacion.convertir(deValor, Monedas.JPY, "Yenes Japoneses");
            break;
            case "KRW":
            Operacion.convertir(deValor, Monedas.KRW, "Wones Coreanos");
            break;
        }
    }
    

    
}
