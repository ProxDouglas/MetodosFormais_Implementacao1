package View;

import Controller.Cadastro;
import Model.Aluno;
import Model.Materia;


public class AdicionarInterface {
    Cadastro cadastro ;

    public AdicionarInterface(Cadastro cadastro){
        this.cadastro = cadastro;
    }


    public void alunoADD(){
        String nome = "Ste";
        String dataNasc = "10/09/2002";
        char sexo = 'F';
        String documento = "999999999";
        String email = "ste@data.com";
        String dataCadastro = "10/04/2021";
        int id = 1;

        Aluno aluno1 = new Aluno("Ste", "10/09/2002", 'F',
                "999999999", "ste@data.com", "10/04/2021");

        Aluno aluno2 = new Aluno("Tata", "10/09/2002", 'F',
                "999999999", "ste@data.com", "10/04/2021");

        cadastro.cadastrarAluno(aluno1);
        cadastro.cadastrarAluno(aluno2);

    }

    public void professorADD(){

        Aluno professor1 = new Aluno("Bren", "10/09/2000",
                'M', "999999999", "@data.com", "10/04/2021");

        Aluno professor2 = new Aluno("joao", "10/09/2000",
                'M', "999999999", "@data.com", "10/04/2021");

        cadastro.cadastrarAluno(professor1);
        cadastro.cadastrarAluno(professor2);

    }

    public void matériaADD(){

        Materia materia1 = new Materia("matematica", 2,  60, "Computacao", "10/09/2021");

        cadastro.cadastrarMateria(materia1);

    }



}
