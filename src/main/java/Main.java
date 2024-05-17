import lombok.Getter;
import lombok.Setter;

import model.*;
import exceptons.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        Cliente douglas = new Cliente();
        douglas.setNome("Douglas");

        Conta corrente = new ContaCorrente(douglas, banco);
        Conta poupanca = new ContaPoupanca(douglas, banco);

        try {
            corrente.depositar(100);
            poupanca.depositar(50);

            corrente.transferir(20, poupanca);

            List<Conta> contas = new ArrayList<>();
            contas.add(corrente);
            contas.add(poupanca);
            banco.setContas(contas);

            corrente.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (SaldoInsuficienteException | OperacaoInvalidaException e) {
            System.out.println("Operação falhou: " + e.getMessage());
        }
    }
}
