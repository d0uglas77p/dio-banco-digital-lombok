package model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Cliente {

    private String nome;
    private int idade;
    private List<Conta> contas;

}
