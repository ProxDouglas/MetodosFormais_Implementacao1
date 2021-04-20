package Model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pessoa {
    private String nome;
    private String dataNasc;
    private char sexo;
    private String documento;
    private String email;
    private String dataCadastro;
    int id;
    //pk:documento

    //constructor com tipo Date
    /*Pessoa(String nome, Date dataNasc, char sexo, String documento,
           String email, Date dataCadastro){
        setNome(nome);
        setDataNasc(dataNasc);
        setSexo(sexo);
        setDocumento(documento);
        setEmail(email);
        setDataCadastro(dataCadastro);
        setId(id);
    }*/


    //constructor para string
    Pessoa(String nome, String dataNasc, char sexo, String documento,
           String email, String dataCadastro){
        setNome(nome);
        setDataNasc(dataNasc);
        setSexo(sexo);
        setDocumento(documento);
        setEmail(email);
        setDataCadastro(dataCadastro);
        setId(id);
    }

    /*private Date formatDate(String dataRecebida) {
        SimpleDateFormat dataFormatada = null;
        try {
            SimpleDateFormat  = new SimpleDateFormat("dd/MM/yyyy").parse(dataRecebida);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dataFormatada;
    }*/

    //getter e setter
    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getDataNasc() { return dataNasc; }

    public void setDataNasc(String dataNasc) { this.dataNasc = dataNasc; }

    public char getSexo() { return sexo; }

    public void setSexo(char sexo) { this.sexo = sexo; }

    public String getDocumento() { return documento; }

    public void setDocumento(String documento) { this.documento = documento; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDataCadastro() { return dataCadastro; }

    public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }

    public void setId(int id) {this.id = id;}

    public int getId() { return id; }

}
