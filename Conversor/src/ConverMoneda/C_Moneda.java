package ConverMoneda;
import javax.swing.JOptionPane;
public class C_Moneda {

	
	public void Convert_PesosArgentinoDolares(double valor) {
		double monedaDolar = valor / 137.68;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void Convert_PesosArgentinoEuros(double valor) {
		double monedaEuro = valor / 137.20;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void Convert_PesosArgentinoLibra(double valor) {
		double monedaLibra = valor / 161.52;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
	}
	
	public void Convert_PesosArgentinoYen(double valor) {
		double monedaYen = valor / 1;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yen Japonés");
	}
	
	public void Convert_PesosArgentinoWon(double valor) {
		double monedaWon = valor / 0.1;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Won sub-coreano");
	}
	
	public void Convert_DolaresPesosArgentino(double valor) {
		double monedaDolar = 137.68 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	
	public void Convert_EurosPesosArgentino(double valor) {
		double monedaEuro = valor * 137.20;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Euros " + monedaEuro + " en pesos");
	}
	
	public void Convert_LibraPesosArgentino(double valor) {
		double monedaLibra = valor * 161.52;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
	}
	
	public void Convert_YenPesosArgentino(double valor) {
		double monedaYen = valor * 1;
		monedaYen = (double)Math.round(monedaYen * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Yen Japonés " + monedaYen + " en pesos");
	}
	
	public void Convert_WonPesosArgentino(double valor) {
		double monedaWon = valor * 0.1;
		monedaWon = (double)Math.round(monedaWon * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
	}

}
