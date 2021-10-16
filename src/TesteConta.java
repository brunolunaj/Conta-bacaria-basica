public class TesteConta {
    public static void main(String[] Args){
        Conta conta = new Conta();
        conta.setNome("BRUNO LUNA");
        conta.setNumConta("123456");
        conta.setSaldo(0);
        conta.depositar(100);
        conta.sacar(50f);


            System.out.println("Dados da conta:");
            System.out.println("Cliente:" + conta.getNome());
            System.out.println("Número da conta:" + conta.getNumConta());
            System.out.println("Seu saldo é: "+ "R$ " + conta.getSaldo());

        }
        

}

