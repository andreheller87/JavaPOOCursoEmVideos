public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    public void status(){
        System.out.println("modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("ponta: " + ponta);
        System.out.println("carga: " + carga);
        System.out.println("tampada: " + tampada);
    }

    public void rabiscar(){
        if(tampada){
            System.out.println("Não posso rabiscar, caneta tampada");
        } else{
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar(){
        System.out.println("Pronto caneta tampada");
        if(!tampada){
            this.tampada = true;
        }
    }

    public void destampar(){
        if(tampada){
            
            this.tampada = false;
            System.out.println("Pronto caneta destampada");
        }
    }
    

}
