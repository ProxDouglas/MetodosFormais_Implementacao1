package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Banco {

    private Integer chaveSequencialProfessor = 1;
    private Integer chaveSequencialAluno = 1;
    private Integer chaveSequencialMateria = 1;

    private Usuario admin;
    private List<Professor> listaProfessores = new LinkedList<>();
    private List<Aluno> listaAlunos = new LinkedList<>();
    private List<Materia> listMaterias = new ArrayList<>();
    private List<Usuario> listLogin = new LinkedList<>();

    public Banco() {
        this.admin = new Usuario("admin", "admin", Categoria.ALUNO);
    }

    public boolean loginAdmin(Usuario admin) {
        return admin.ehIgual(admin.getLogin(), admin.getSenha(), admin.getCategoria());
    }

    public void adicionaProfessor(Professor professor) {
        professor.setId(chaveSequencialProfessor++);
        this.listaProfessores.add(professor);
        adicionarLoginProf(professor);
    }

    public void adicionaAluno(Aluno aluno) {
        aluno.setId(chaveSequencialAluno++);
        this.listaAlunos.add(aluno);
        adicionarLoginAlu(aluno);
    }

    public void adicionaMateria(Materia materia) {
        materia.setId(chaveSequencialMateria++);
        this.listMaterias.add(materia);
    }

    public Professor buscaProfessorId(Integer id) {
        Professor professor = null;
        int i = 0;
        while (listaProfessores.get(i).getId() != id) {
            i++;
        }
        if (listaProfessores.get(i).getId() == id) {
            professor = listaProfessores.get(i);
        }
        return professor;
    }

    public Aluno buscaAlunoMatricula(String matricula) {
        Aluno aluno = null;
        int i = 0;
        while (listaAlunos.get(i).getMatricula() != matricula) {
            i++;
        }
        if (listaAlunos.get(i).getMatricula() == matricula) {
            aluno = listaAlunos.get(i);
        }
        return aluno;
    }

    public Professor buscaProfessorNome(String nome) {
        Professor professor = null;
        int i = 0;
        while (!listaProfessores.get(i).getNome().equals(nome)) {
            i++;
        }
        if (listaProfessores.get(i).getNome().equals(nome)) {
            professor = listaProfessores.get(i);
        }
        return professor;
    }

    public Aluno buscaAlunoNome(String nome) {
        Aluno aluno = null;
        int i = 0;
        while (!listaAlunos.get(i).getNome().equals(nome)) {
            i++;
        }
        if (listaAlunos.get(i).getNome().equals(nome)) {
            aluno = listaAlunos.get(i);
        }
        return aluno;
    }

    public Materia buscarMateriaNome(String nome) {
        Materia materia = null;
        int i = 0;
        while (!listMaterias.get(i).getNome().equals(nome)) {
            i++;
        }
        if (listaAlunos.get(i).getNome().equals(nome)) {
            materia = listMaterias.get(i);
        }
        return materia;
    }

    private void adicionarLoginProf(Professor professor) {
        Usuario usuario = new Usuario(professor.getNome(), professor.getDocumento(), Categoria.PROFESSOR);
        this.listLogin.add(usuario);
    }

    private void adicionarLoginAlu(Aluno aluno) {
        Usuario usuario = new Usuario(aluno.getNome(), aluno.getDocumento(), Categoria.ALUNO);
        this.listLogin.add(usuario);
    }

    public boolean login(Usuario usuario) {
        return listLogin.stream().anyMatch(usuario::ehIgual);
    }
}

