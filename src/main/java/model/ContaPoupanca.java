package model;

import lombok.ToString;

@ToString(callSuper = true)
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n********** Extrato Conta Poupança **********");
        super.imprimirInfosComuns();
        System.out.println("********************************************");
    }

}

