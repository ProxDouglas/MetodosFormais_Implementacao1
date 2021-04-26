package Model;

public class Pessoa {

    private String nome;
    private String dataNasc;
    private char sexo;
    private String documento;
    private String email;
    private String dataCadastro;
    private int id;

    public Pessoa(String nome, String dataNasc, char sexo, String documento, String email, String dataCadastro, int id) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.documento = documento;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
