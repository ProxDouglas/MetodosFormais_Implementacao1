package Model;

import java.sql.Date;

public class Aluno extends Pessoa{
    private String curso;
    private String matricula = ((Integer)getId()).toString();

    Aluno(String nome, Date dataNasc, char sexo, String documento, String email, Date dataCadastro, int id) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro, id);
    }

    public String getMatricula() { return matricula; }
}
