package Model;

import java.sql.Date;

public class Professor extends Pessoa{
    private Materia materia;
    private String rp;

    Professor(String nome, Date dataNasc, char sexo, String documento, String email, Date dataCadastro, int id) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro, id);
    }

    public Materia getMateria() {return materia;}

    public void setMateria(Materia materia) {this.materia = materia;}

    public String getRp() { return rp; }

    public void setRp(String rp) { this.rp = rp; }
}
