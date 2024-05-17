package model;

import exceptions.SaldoInsuficienteException;

public interface IConta {

    void sacar(double valor) throws SaldoInsuficienteException, SaldoInsuficienteException;
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino) throws SaldoInsuficienteException;
    void imprimirExtrato();

}
