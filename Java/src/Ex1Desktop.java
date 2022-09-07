import javax.swing.JOptionPane;

public class Ex1Desktop extends Ex1Computador{
private double estabilizador;
private double teclado;


public Ex1Desktop() {

}
public Ex1Desktop(double placaMae, double hd, double memoria, double processador, int volume, int garantia,
		double placaVideo, String configuracao,double estabilizador, double teclado) {
	super(placaMae, hd, memoria, processador, volume, garantia, placaVideo, configuracao);
	this.estabilizador = estabilizador;
	this.teclado = teclado;
	
	
}
public double getEstabilizador() {
	return estabilizador;
}
public void setEstabilizador(double estabilizador) {
	this.estabilizador = estabilizador;
}
public double getTeclado() {
	return teclado;
}
public void setTeclado(double teclado) {
	this.teclado = teclado;
}

public double calcularPreco() {
	return this.getPlacaMae() + this.getHd()+this.getMemoria()+this.getProcessador() + this.getEstabilizador() + this.getTeclado() + this.getPlacaVideo();
}

public void imprime() {

JOptionPane.showMessageDialog(null, "Dados do desktop escolhido:\n" + this.getConfiguracao() + "\n" + "Valor total: R$" + calcularPreco());
}

public void imprimeGarantia() {

JOptionPane.showMessageDialog(null, "Dados do desktop escolhido:\n" + this.getConfiguracao() + "\n" + "Valor total: R$" + (calcularPreco()*1.10));
}





}




