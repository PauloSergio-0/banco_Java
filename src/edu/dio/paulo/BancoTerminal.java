package edu.dio.paulo;

public class BancoTerminal{
    double saldo = 25;


    public void atualizarSaldo(double newSaldo) {
        if(newSaldo >=0){
            this.saldo = newSaldo;
        }else{
            System.out.println("O saldo deve ser maior ou igual a 0");
        }
    }

    public void sacar(double valorSolicitado){

        if(this.saldo < valorSolicitado){
            System.out.println("Saldo insuficiente: " + this.saldo);
            System.out.println(" Valor desejado para sacar: " +  valorSolicitado);
        } else{
            this.saldo -= valorSolicitado;
            System.out.println("Saldo atual: "+ this.saldo);
        }

    }

}