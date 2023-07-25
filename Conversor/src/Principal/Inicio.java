package Principal;

import javax.swing.*;
import ConverMoneda.Opciones_Convert;
import ConverTemperatura.Opciones_ConvertT;

public class Inicio {

	public static void main(String[] args) {
		
		Opciones_Convert conversion = new Opciones_Convert();
		Opciones_ConvertT conversionT = new Opciones_ConvertT();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();
			
			
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.C_Moneda(valorRecibido);
				
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				break;
				
			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);
				
				
				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				
				
		}
		break;
	}
	
}
	
}
