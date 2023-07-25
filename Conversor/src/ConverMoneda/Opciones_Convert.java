package ConverMoneda;
import javax.swing.JOptionPane;

public class Opciones_Convert {
	
	C_Moneda monedas = new C_Moneda();
	
	public void C_Moneda(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"Pesos a Dólar", "Pesos a Euro", "Pesos a Libras Esterlinas", "Pesos a Yen Japonés", "Pesos a Won sub-coreano", "Dólar a Pesos", "Euro a Pesos", "Libras Esterlinas a Pesos", "Yen Japonés a Pesos", "Won sub-coreano a Pesos"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "Pesos a Dólar": 
		monedas.Convert_PesosArgentinoDolares(valor);
		break;
	
	case "Pesos a Euro": 
		monedas.Convert_PesosArgentinoEuros(valor);
		break;
		
	case "Pesos a Libras Esterlinas":
		monedas.Convert_PesosArgentinoLibra(valor);
		break;
		
	case "Pesos a Yen Japonés":
		monedas.Convert_PesosArgentinoYen(valor);
		break;
		
	case "Pesos a Won sub-coreano":
		monedas.Convert_PesosArgentinoWon(valor);
		break;
	
	case "Dólar a Pesos":
		monedas.Convert_DolaresPesosArgentino(valor);
		break;
		
	case "Euro a Pesos":
		monedas.Convert_EurosPesosArgentino(valor);
		break;
		
	case "Libras Esterlinas a Pesos":
		monedas.Convert_LibraPesosArgentino(valor);
		break;
	 
	case "Yen Japonés a Pesos":
		monedas.Convert_YenPesosArgentino(valor);
		break;
		
	case "Won sub-coreano a Pesos":
		monedas.Convert_WonPesosArgentino(valor);
		break;
	}
	}

}
