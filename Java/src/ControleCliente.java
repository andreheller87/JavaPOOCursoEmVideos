public class ControleCliente {
    public static void main(String[] args) {
        
        ControleRemoto control1 = new ControleRemoto();

        control1.ligar();
        control1.maisVolume();
        control1.ligarMudo();
        control1.desligarMudo();
        control1.play();
        control1.menosVolume();
        control1.pause();


        control1.abriMenu();



    }
    
}
