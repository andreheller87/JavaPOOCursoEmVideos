
public class Ex1Computador {
 private double placaMae;
 private double hd;
 private double memoria;
 private double processador;
 private int volume;
 private int garantia;
 private double placaVideo;
 private String configuracao;
 
 
 
 
 
 
public Ex1Computador() {
	
}


public Ex1Computador(double placaMae, double hd, double memoria, double processador, int volume, int garantia,
		double placaVideo, String configuracao) {

	this.placaMae = placaMae;
	this.hd = hd;
	this.memoria = memoria;
	this.processador = processador;
	this.volume = volume;
	this.garantia = garantia;
	this.placaVideo = placaVideo;
	this.configuracao = configuracao;
}


public double getPlacaMae() {
	return placaMae;
}
public void setPlacaMae(double placaMae) {
	this.placaMae = placaMae;
}
public double getHd() {
	return hd;
}
public void setHd(double hd) {
	this.hd = hd;
}
public double getMemoria() {
	return memoria;
}
public void setMemoria(double memoria) {
	this.memoria = memoria;
}
public double getProcessador() {
	return processador;
}
public void setProcessador(double processador) {
	this.processador = processador;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}
public int getGarantia() {
	return garantia;
}
public void setGarantia(int garantia) {
	this.garantia = garantia;
}
public double getPlacaVideo() {
	return placaVideo;
}
public void setPlacaVideo(double placaVideo) {
	this.placaVideo = placaVideo;
}
public String getConfiguracao() {
	return configuracao;
}
public void setConfiguracao(String configuracao) {
	this.configuracao = configuracao;
}

public double calcularPreco() {
		return 0;
}
 
public void imprime() {
	
	
}
public void imprimeGarantia() {}
 
 
 
}
