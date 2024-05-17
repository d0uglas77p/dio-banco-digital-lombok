package model;

import lombok.ToString;

@ToString(callSuper = true)
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n********** Extrato Conta Corrente **********");
        super.imprimirInfosComuns();
        System.out.println("********************************************");
    }

}
