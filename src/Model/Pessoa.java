package Model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pessoa {
    private String nome;
    private Date dataNasc;
    private char sexo;
    private String documento;
    private String email;
    private String cursoPertecente;
    private Date dataCadastro;
    Categoria categoria;

    int id;
    //pk:documento

    //constructor com tipo Date
    Pessoa(String nome, Date dataNasc, char sexo, String documento,
           String email, String cursoPertencente, Date dataCadastro, String categoria, int id){
        setNome(nome);
        setDataNasc(dataNasc);
        setSexo(sexo);
        setDocumento(documento);
        setEmail(email);
        setCursoPertecente(cursoPertencente);
        setDataCadastro(dataCadastro);
        categorizar(categoria);
        setId(id);
    }

    //constructor para string
    Pessoa(String nome, String dataNasc, char sexo, String documento,
           String email, String cursoPertencente, String dataCadastro, String categoria, int id){
        setNome(nome);
        setDataNasc(formatDate(dataNasc));
        setSexo(sexo);
        setDocumento(documento);
        setEmail(email);
        setCursoPertecente(cursoPertencente);
        setDataCadastro(formatDate(dataCadastro));
        categorizar(categoria);
        setId(id);
    }

    private Date formatDate(String dataRecebida) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = null;
        try {
            dataFormatada = (Date) formato.parse(dataRecebida);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dataFormatada;
    }

    private void categorizar(String categoria){
        if(categoria == "professor"){
            setCategoria(Categoria.PROFESSOR);
        }else if(categoria == "aluno"){
            setCategoria(Categoria.ALUNO);
        }
    }

    //getter e setter 
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Date getDataNasc() { return dataNasc; }

    public void setDataNasc(Date dataNasc) { this.dataNasc = dataNasc; }

    public char getSexo() { return sexo; }

    public void setSexo(char sexo) { this.sexo = sexo; }

    public String getDocumento() { return documento; }

    public void setDocumento(String documento) { this.documento = documento; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCursoPertecente() { return cursoPertecente; }

    public void setCursoPertecente(String cursoPertecente) { this.cursoPertecente = cursoPertecente; }

    public Date getDataCadastro() { return dataCadastro; }

    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }

    public Categoria getCategoria() { return categoria; }

    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public void setId(int id) {this.id = id;}

    public int getId() { return id; }

}
