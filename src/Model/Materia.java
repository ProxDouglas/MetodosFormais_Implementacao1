package Model;

public class Materia {
    String nome;
    int periodo;
    int cargaHoraria;
    String cursoquePertence;
    String dataCriação;
    int id;

    public Materia(String nome, int periodo, int cargaHoraria, String cursoquePertence, String dataCriacao){
        setNome(nome);
        setPeriodo(periodo);
        setCargaHoraria(cargaHoraria);
        setCursoquePertence(cursoquePertence);
        setDataCriação(dataCriacao);
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public int getPeriodo() { return periodo; }

    public void setPeriodo(int periodo) { this.periodo = periodo; }

    public int getCargaHoraria() { return cargaHoraria; }

    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public String getDataCriação() { return dataCriação; }

    public void setDataCriação(String dataCriação) { this.dataCriação = dataCriação; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCursoquePertence() {return cursoquePertence; }

    public void setCursoquePertence(String cursoquePertence) {this.cursoquePertence = cursoquePertence; }
}
