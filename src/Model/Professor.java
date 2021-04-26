package Model;

public class Professor extends Pessoa {
    private Materia materia;
    private String rp;

    public Professor(String nome, String dataNasc, char sexo, String documento, String email, String dataCadastro) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro, 1);
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }
}
