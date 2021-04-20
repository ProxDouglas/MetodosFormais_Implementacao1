package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Banco {

    private static Integer chaveSequencialProfessor = 1;
    private static Integer chaveSequencialAluno = 1;
    private static Integer chaveSequencialMateria = 1;

    private Usuario admin;
    private List<Professor> listaProfessores = new LinkedList<Professor>();
    private List<Aluno> listaAlunos = new LinkedList<Aluno>();
    private List<Materia> listMaterias = new ArrayList<Materia>();
    private List<Usuario> listLogin = new LinkedList<>();



    private void adminLogin(){
        admin.setLogin("admin");
        admin.setSenha("admin");
    }

    public boolean loginAdmin(Usuario admin){
        return this.admin.equals(admin);
    }

    public void adicionaProfessor(Professor professor) {
        professor.setId(Banco.chaveSequencialProfessor++);
        this.listaProfessores.add(professor);
    }

    public void adicionaAluno(Aluno aluno) {
        aluno.setId(Banco.chaveSequencialAluno++);
        this.listaAlunos.add(aluno);
    }

    public void adicionaMateria(Materia materia) {
        materia.setId(Banco.chaveSequencialMateria++);
        this.listMaterias.add(materia);
    }

    public List<Professor> getListProfessor(){
        return this.listaProfessores;
    }

    public List<Aluno> getListaAlunos(){
        return this.listaAlunos;
    }

    public Professor buscaProfessorId(Integer id) {
        Professor professor = null;
        int i = 0;
        while(listaProfessores.get(i).getId() != id){
            i++;
        }
        if(listaProfessores.get(i).getId() == id){
            professor =  listaProfessores.get(i);
        }
        return professor;
    }

    public Aluno buscaAlunoMatricula(String matricula) {
        Aluno aluno = null;
        int i = 0;
        while(listaAlunos.get(i).getMatricula() != matricula){
            i++;
        }
        if(listaAlunos.get(i).getMatricula() == matricula){
            aluno =  listaAlunos.get(i);
        }
        return aluno;
    }

    public Professor buscaProfessorNome(String nome) {
        Professor professor = null;
        int i = 0;
        while(!listaProfessores.get(i).getNome().equals(nome)){
            i++;
        }
        if(listaProfessores.get(i).getNome().equals(nome)){
           professor =  listaProfessores.get(i);
        }
        return professor;
    }

    public Aluno buscaAlunoNome(String nome) {
        Aluno aluno = null;
        int i = 0;
        while(!listaAlunos.get(i).getNome().equals(nome)){
            i++;
        }
        if(listaAlunos.get(i).getNome().equals(nome)){
            aluno =  listaAlunos.get(i);
        }
        return aluno;
    }

    public Materia buscarMateriaNome(String nome){
        Materia materia = null;
        int i = 0;
        while(!listMaterias.get(i).getNome().equals(nome)){
            i++;
        }
        if(listaAlunos.get(i).getNome().equals(nome)){
            materia =  listMaterias.get(i);
        }
        return materia;
    }

}

