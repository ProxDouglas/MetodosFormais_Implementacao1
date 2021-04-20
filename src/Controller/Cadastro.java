package Controller;

import Model.*;


public class Cadastro {
    Banco banco = new Banco();

    public void cadastrarProfessor(Professor professor){
        banco.adicionaProfessor(professor);
    }

    public void cadastrarAluno(Aluno aluno){
        banco.adicionaAluno(aluno);
    }

    public void cadastrarMateria(Materia materia){
        banco.adicionaMateria(materia);
    }

    public void alterarCadastroProfessor(int id){
        Pessoa pessoa = buscarIDProfessor(id);
    }

    public void alterarCadastroAluno(String matricula){
        Pessoa pessoa = buscarMatriculaAluno(matricula);
    }

    public Professor buscarIDProfessor(int id){
        return banco.buscaProfessorId(id);
    }

    public Aluno buscarMatriculaAluno(String matricula){
        return banco.buscaAlunoMatricula(matricula);
    }

    public Professor buscaNomeProfessor(String nome){
        return banco.buscaProfessorNome(nome);
    }

    public Aluno buscaNomeAluno(String nome){
        return banco.buscaAlunoNome(nome);
    }

    public Materia buscaNomeMateria(String nome){
        return banco.buscarMateriaNome(nome);
    }

    public Banco getBanco() { return banco; }
}
