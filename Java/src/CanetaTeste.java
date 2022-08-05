public class CanetaTeste {
    private CanetaTeste(){

        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();

        c1.modelo = "bic";
        c1.cor = "Azul";
        c1.ponta = 1.0f;
        c1.carga = 80;
        c1.tampada = true;

       
        c2.modelo = "Atomic";
        c2.cor = "Verde";
        c2.ponta = 0.5f;
        c2.carga = 100;
        c2.tampada = false;

        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.status();


        c2.status();
        c2.rabiscar();
        c2.tampar();
        c2.status();





    

    }
    public static void main(String[] args) throws Exception {
        new CanetaTeste();
}
}