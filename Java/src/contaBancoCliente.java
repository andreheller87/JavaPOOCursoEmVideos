public class contaBancoCliente {
    private contaBancoCliente(){
        contaBanco pessoa1 = new contaBanco();
        contaBanco pessoa2 = new contaBanco();
        contaBanco pessoa3 = new contaBanco();
        pessoa1.abrirConta("CC");
        pessoa2.abrirConta("CP");
        pessoa3.abrirConta("CP");
        pessoa1.setNumConta(1000);
        pessoa2.setNumConta(1001);
        pessoa3.setNumConta(1002);
        pessoa1.setDono("Andre Heller");
        pessoa2.setDono("Enzo Gabriel");
        pessoa3.setDono("Marcia");
        
        pessoa2.fecharConta();
        pessoa2.sacar(150);
        pessoa2.fecharConta();
        

        pessoa1.estadoDaConta();
        pessoa2.estadoDaConta();
        pessoa3.estadoDaConta();
        
        

    }

    public static void main(String[] args) {
        new contaBancoCliente();
    }
}
