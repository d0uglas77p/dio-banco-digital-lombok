package exceptons;

import lombok.ToString;

@ToString
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}