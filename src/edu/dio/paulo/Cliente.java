package edu.dio.paulo;

public class Cliente {
    public static void main(String[] args) {
        BancoTerminal cliente = new BancoTerminal();

        //etapa 1
        cliente.atualizarSaldo(25);
        cliente.sacar(18);

        //etapa 2
        cliente.atualizarSaldo(15);
        cliente.sacar(22);


    }
}

