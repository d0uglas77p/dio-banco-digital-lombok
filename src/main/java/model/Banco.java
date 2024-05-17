package model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Banco {

    private String nome;
    private List<Conta> contas;

}
