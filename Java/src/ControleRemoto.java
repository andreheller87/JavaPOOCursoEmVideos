public class ControleRemoto implements ControleControlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    public ControleRemoto() {
        this.volume = 50;

    }
    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
   
   
    @Override
    public void abriMenu() {
        System.out.println("_____Menu_____");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 10; i <=  this.getVolume(); i+=10) {
            System.out.print("[]");
        }
        
    }
    @Override
    public void desligar() {
        this.setLigado(false);
        
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
           }
        
    }
    @Override
    public void fecharMemu() {
        System.out.println("Fechando Menu");
        
    }
    @Override
    public void ligar() {
       this.setLigado(true);
        
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
           }
        
    }
    @Override
    public void maisVolume() {
       if(this.getLigado()){
        this.setVolume(this.getVolume()+10);
       }
        
    }
    @Override
    public void menosVolume() {
       if(this.getLigado()){
        this.setVolume(this.getVolume()-10);
       }
        
    }
    @Override
    public void pause() {
        if(this.getLigado() == true && this.getTocando() == true){
            this.setTocando(false);
           }
            
    }
    @Override
    public void play() {
       if(this.getLigado() == true && this.getTocando() == false){
        this.setTocando(true);
       }
        
    }
    
}
