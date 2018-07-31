class ContaCorrente{
    private float saldo = 0;
    public float deposito(float num){
        saldo+=num;
        return saldo;
    }

    public float getSaldo(){
        return saldo;
    }

    public float saque(float num){
        if(num>saldo){
            System.out.println("Voce nao tem dinheiro o suficiente para fazer este saque. ("+saldo+")");
            return 0;
        }
        saldo-=num;
        return saldo;
    }

    public float transferencia(float num, ContaCorrente cc){
        saque(num);
        cc.deposito(num);
        return saldo;
    } 
}