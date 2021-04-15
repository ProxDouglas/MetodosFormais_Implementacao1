package Model;

import java.sql.Date;
import java.util.List;

public class Materia {
    String nome;
    String periodo;
    int cargaHoraria;
    String cursoquePertence;
    Date dataCriação;
    int id;
    //List<Pessoa> listAlunos;
    //cargaHorairia >= 20h
    //pk: id

    Materia(String nome, String periodo, int cargaHoraria, String cursoquePertence, Date dataCriacao){
        setNome(nome);
        setPeriodo(periodo);
        setCargaHoraria(cargaHoraria);
        setCursoquePertence(cursoquePertence);
        setDataCriação(dataCriacao);
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getPeriodo() { return periodo; }

    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public int getCargaHoraria() { return cargaHoraria; }

    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public String getCursoquePertence() { return cursoquePertence; }

    public void setCursoquePertence(String cursoquePertence) { this.cursoquePertence = cursoquePertence; }

    public Date getDataCriação() { return dataCriação; }

    public void setDataCriação(Date dataCriação) { this.dataCriação = dataCriação; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }
}
