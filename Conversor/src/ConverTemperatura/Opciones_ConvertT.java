package ConverTemperatura;
import javax.swing.JOptionPane;

public class Opciones_ConvertT {

	C_Temperatura temperatura = new C_Temperatura();
	
	public void ConvertirTemperaturas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la Temperaturas que quieras Convertir ",  "Temperaturas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankine", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Fahrenheit a Rankine",
							"Kelvin a Celsius", "Kelvin a Fahrenheit", "Kelvin a Rankine", "Rankine a Celsius", "Rankine a Fahrenheit", "Rankine a Kelvin"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "Celsius a Fahrenheit":
		temperatura.Convert_CelsiusFahrenheit(valor);
		break;
	
	case "Celsius a Kelvin": 
		temperatura.Convert_CelisusKelvin(valor);
		break;
		
	case "Celsius a Rankine":
		temperatura.Convert_CelsiusRankine(valor);
		break;
		
	case "Fahrenheit a Celsius":
		temperatura.Convert_FahrenheitCelsius(valor);
		break;
		
	case "Fahrenheit a Kelvin":
		temperatura.Convert_FahrenheitKelvin(valor);
		break;
	
	case "Fahrenheit a Rankine":
		temperatura.Convert_FahrenheitRankine(valor);
		break;
		
	case "Kelvin a Celsius":
		temperatura.Convert_KelvinCelsius(valor);
		break;
		
	case "Kelvin a Fahrenheit":
		temperatura.Convert_KelvinFahrenheit(valor);
		break;
	 
	case "Kelvin a Rankine":
		temperatura.Convert_KelvinRankine(valor);
		break;
		
	case "Rankine a Celsius":
		temperatura.Convert_RankineCelsius(valor);
		break;
		
	case "Rankine a Fahrenheit":
		temperatura.Convert_RankineFahrenheit(valor);
		break;
		
	case "Rankine a Kelvin":
		temperatura.Convert_RankineKelvin(valor);
		break;
	}
	}
	}



