package Model;

import java.sql.Date;

public class Aluno extends Pessoa{
    private String curso;
    private String matricula = ((Integer)getId()).toString();

    public Aluno(String nome, String dataNasc, char sexo, String documento, String email, String dataCadastro) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro);
    }

    public String getMatricula() { return matricula; }
}
