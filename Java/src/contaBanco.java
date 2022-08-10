public class contaBanco {
    public contaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo == "CC") {
            this.setSaldo(50);
            
        } else if(tipo == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Você não pode fechar a conta, ainda tem saldo positivo");
        } else if(this.saldo<0){
            System.out.println("Você não pode fechar a conta, ainda tem saldo negativo");
        } else{
            System.out.println("Conta fechada com sucesso");
        }
        

    }

    public void depositar(){

    }

    public void sacar(){}

    public void pagarMensal(){

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
