public class Conta {

    private String numConta;
    private String nome;
    private double saldo;

   public String getNumConta(){
       return numConta;
   }
   public void setNumConta(String numConta){
    this.numConta = numConta;
   }
    public String getNome(){
        return nome;
   }
    public void setNome(String nome){
        this.nome = nome;
   }
    public double getSaldo(){
       return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
   }
   public void depositar( double valordeposito){
       saldo += valordeposito;
   }
   public void sacar(float valorsaque){
       saldo -= valorsaque;
   }

}



