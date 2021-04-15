package Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Banco {

    List<Pessoa> listaProfessores = new LinkedList<Pessoa>();
    List<Pessoa> listaAlunos = new LinkedList<Pessoa>();
    List<Materia> listMaterias = new ArrayList<Materia>();

    private static Integer chaveSequencialProfessor = 1;
    private static Integer chaveSequencialAluno = 1;
    private static Integer chaveSequencialMateria = 1;


    public void adiciona(Pessoa pessoa) {
        if(pessoa.categoria == Categoria.PROFESSOR){
            pessoa.setId(Banco.chaveSequencialProfessor++);
            this.listaProfessores.add(pessoa);
        }else if(pessoa.categoria == Categoria.ALUNO){
            pessoa.setId(Banco.chaveSequencialAluno++);
            this.listaAlunos.add(pessoa);
        }
    }

    public void adicionaMateria(Materia materia) {
        materia.setId(Banco.chaveSequencialMateria++);
        this.listMaterias.add(materia);
    }

    public List<Pessoa> getListProfessor(){
        return this.listaProfessores;
    }

    public List<Pessoa> getListaAlunos(){
        return this.listaAlunos;
    }

    public Pessoa buscaProfessorId(Integer id) {
        Pessoa pessoa = null;
        int i = 0;
        while(listaProfessores.get(i).getId() != id){
            i++;
        }
        if(listaProfessores.get(i).getId() == id){
            pessoa =  listaProfessores.get(i);
        }
        return pessoa;
    }

    public Pessoa buscaAlunoId(Integer id) {
        Pessoa pessoa = null;
        int i = 0;
        while(listaAlunos.get(i).getId() != id){
            i++;
        }
        if(listaAlunos.get(i).getId() == id){
            pessoa =  listaAlunos.get(i);
        }
        return pessoa;
    }

    public Pessoa buscaProfessorNome(String nome) {
        Pessoa pessoa = null;
        int i = 0;
        while(!listaProfessores.get(i).getNome().equals(nome)){
            i++;
        }
        if(listaProfessores.get(i).getNome().equals(nome)){
           pessoa =  listaProfessores.get(i);
        }
        return pessoa;
    }

    public Pessoa buscaAlunoNome(String nome) {
        Pessoa pessoa = null;
        int i = 0;
        while(!listaAlunos.get(i).getNome().equals(nome)){
            i++;
        }
        if(listaAlunos.get(i).getNome().equals(nome)){
            pessoa =  listaAlunos.get(i);
        }
        return pessoa;
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

