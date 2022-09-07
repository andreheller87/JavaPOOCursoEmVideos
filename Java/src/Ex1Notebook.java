import javax.swing.JOptionPane;

public class Ex1Notebook extends Ex1Computador {
	private double carregador;
	private double pasta;
	
	public Ex1Notebook() {
	
	}

	public Ex1Notebook(double placaMae, double hd, double memoria, double processador, int volume, int garantia,
			double placaVideo, String configuracao, double carregador, double pasta) {
		super(placaMae, hd, memoria, processador, volume, garantia, placaVideo, configuracao);
		this.carregador = carregador;
		this.pasta = pasta;
		
	}

	public double getCarregador() {
		return carregador;
	}

	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}

	public double getPasta() {
		return pasta;
	}

	public void setPasta(double pasta) {
		this.pasta = pasta;
	}


public double calcularPreco() {
		return this.getPlacaMae() + this.getHd()+this.getMemoria()+this.getProcessador() + this.getCarregador() + this.getPasta() + this.getPlacaVideo();
}
 
public void imprime() {
	
	JOptionPane.showMessageDialog(null, "Dados do notebook escolhido:\n" + this.getConfiguracao() + "\n" + "Valor total: R$" + calcularPreco());
}

public void imprimeGarantia() {
	
	JOptionPane.showMessageDialog(null, "Dados do notebook escolhido:\n" + this.getConfiguracao() + "\n" + "Valor total: R$" + (calcularPreco()*1.12));
}
	
	
	

}
