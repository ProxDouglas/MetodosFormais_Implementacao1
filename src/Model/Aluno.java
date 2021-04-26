package Model;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public Aluno(String nome, String dataNasc, char sexo, String documento, String email, String dataCadastro) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro, 1);
        this.matricula = ((Integer)getId()).toString();
    }

    public String getMatricula() {
        return matricula;
    }
}
