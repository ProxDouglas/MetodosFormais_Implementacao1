package Model;

import java.sql.Date;

public class Professor extends Pessoa{
    private Materia materia;

    Professor(String nome, Date dataNasc, char sexo, String documento, String email, Date dataCadastro, int id) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro, id);
    }
}
