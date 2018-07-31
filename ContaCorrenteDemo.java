import java.util.Scanner;


class ContaCorrenteDemo{
    public static void main(String args[]){
        Scanner keyboard=new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        //depositando na conta 1
        System.out.print("Deseja depositar na conta 1? (s/n)");
        String answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
            System.out.print("Quanto deseja depositar na conta 1? ");
            float input = keyboard.nextFloat();
            keyboard.nextLine();
            System.out.println("Saldo atual da conta 1: " + conta1.deposito(input));
        }
        //depositando na conta 2
        System.out.print("Deseja depositar na conta 2? (s/n)");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
            System.out.print("Quanto deseja depositar na conta 2? ");
            float input = keyboard.nextFloat();
            keyboard.nextLine();
            System.out.printf("Saldo atual da conta 2: $%.2f\n",conta2.deposito(input));
        }
        //sacando na conta 1
        System.out.print("Deseja sacar da conta 1? (s/n)");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
            System.out.print("Quanto deseja sacar da conta 1? ");
            float input = keyboard.nextFloat();
            keyboard.nextLine();
            System.out.printf("Saldo atual da conta 1: $%.2f\n",conta1.saque(input));
        }
        //sacando na conta 2
        System.out.print("Deseja sacar da conta 2? (s/n)");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
        System.out.print("Quanto deseja sacar da conta 2? ");
        float input = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.printf("Saldo atual da conta 1: $%.2f\n",conta2.saque(input));
        }
        //transferir da conta 1 para 2
        System.out.println("Saldo conta 1: "+conta1.getSaldo()+"\nSaldo conta 2: "+conta2.getSaldo());
        System.out.print("Deseja transferir para a conta 2? (s/n)");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
        System.out.print("Quanto deseja transferir para conta 2? ");
        float input = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Saldo atual da conta 1: "+conta1.transferencia(input,conta2));
        }
        //transferir da conta 2 para 1
        System.out.println("Saldo conta 1: "+conta1.getSaldo()+"\nSaldo conta 2: "+conta2.getSaldo());
        System.out.print("Deseja transferir para a conta 2? (s/n)");
        answer = keyboard.nextLine();
        if(answer.equalsIgnoreCase("s")){
        System.out.print("Quanto deseja transferir para conta 1? ");
        float input = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.printf("Saldo atual da conta 2: "+conta2.transferencia(input,conta1));
        }
        //saldos finais
         System.out.print("Dados das contas correntes:\nConta 1: $"+conta1.getSaldo()+"\nConta 2: $"+conta2.getSaldo());
    }
}