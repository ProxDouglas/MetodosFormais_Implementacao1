package Model;

import java.sql.Date;

public class Professor extends Pessoa{
    private Materia materia;
    private String rp;

    Professor(String nome, String dataNasc, char sexo, String documento, String email, String dataCadastro, int id) {
        super(nome, dataNasc, sexo, documento, email, dataCadastro);
    }

    public Materia getMateria() {return materia;}

    public void setMateria(Materia materia) {this.materia = materia;}

    public String getRp() { return rp; }

    public void setRp(String rp) { this.rp = rp; }
}
