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

    public void estadoDaConta(){
        System.out.println("-----------------------------------------");
        System.out.println("Numero Da Conta: "  + this.getNumConta());
        System.out.println("Tipo Da Conta  : "  + this.getTipo());
        System.out.println("Dono Da Conta  : "  + this.getDono());
        System.out.println("Saldo Da Conta : "  + this.getSaldo());
        System.out.println("Status DaConta : "  + this.getStatus());
        System.out.println("-----------------------------------------");
    }
    

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
            this.setStatus(false);
        }
        

    }

    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
        } else{
            System.out.println("Conta não esta aberta, impossivel fazer o deposito");
        }
    }

    public void sacar(float v){
        if(this.getStatus()){
            if(this.saldo >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso");
                System.out.println("Saldo: " + this.getSaldo());
            }else{
                System.out.println("Saldo insuficiente");
            }
        } else{
            System.out.println("Conta não esta aberta, impossivel fazer o saque");
        }
    }

    public void pagarMensal(){
        float CC = 12;
        float CP = 20;
        if(this.getStatus() == true ){
            if(this.getTipo() == "CC" && this.getSaldo() > CC){
                 this.setSaldo(this.getSaldo() - CC);
                System.out.println("Pagamento da mensalidade valor " + CC);
            }else{
                if(this.getTipo() == "CP" && this.getSaldo() > CP){
                    this.setSaldo(this.getSaldo() - CP);
                   System.out.println("Pagamento da mensalidade valor " + CP);
               }
            }

        }else{
            System.out.println("Conta não esta aberta, impossivel fazer o pagamento");
        }
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
