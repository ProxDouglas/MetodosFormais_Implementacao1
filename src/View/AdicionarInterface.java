package View;

import Controller.Cadastro;
import Model.Aluno;
import Model.Materia;
import Model.Professor;


public class AdicionarInterface {
    private final Cadastro cadastro ;

    public AdicionarInterface(Cadastro cadastro){
        this.cadastro = cadastro;
    }

    public void alunoADD(){
        Aluno aluno1 = new Aluno("Ste", "05/04/2021", 'F',
                "999999999", "ste@data.com", "05/04/2021");
        Aluno aluno2 = new Aluno("Tata", "05/04/2021", 'F',
                "999999999", "ste@data.com", "05/04/2021");

        cadastro.cadastrarAluno(aluno1);
        cadastro.cadastrarAluno(aluno2);

    }

    public void professorADD(){
        Professor professor1 = new Professor("Bren", "05/04/2021",
                'M', "999999999", "@data.com", "05/04/2021");
        Professor professor2 = new Professor("joao", "05/04/2021",
                'M', "999999999", "@data.com", "05/04/2021");
        cadastro.cadastrarProfessor(professor1);
        cadastro.cadastrarProfessor(professor2);

    }

    public void matériaADD(){
        Materia materia1 = new Materia("matematica", 2,  60, "Computacao", "10/09/2021");
        cadastro.cadastrarMateria(materia1);
    }



}
