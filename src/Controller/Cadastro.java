package Controller;

import Model.Banco;
import Model.Categoria;
import Model.Materia;
import Model.Pessoa;


public class Cadastro {
    Banco banco = new Banco();

    public void cadastrar(Pessoa pessoa){
        banco.adiciona(pessoa);
    }

    public void alterarCadastro(int id, Categoria categoria){
        Pessoa pessoa = buscarIDPessoa(id, categoria);

    }

    public Pessoa buscarIDPessoa(int id, Categoria cat){
        Pessoa pessoa = null;
        if(cat == Categoria.PROFESSOR){
            pessoa = banco.buscaProfessorId(id);
        }else if(cat == Categoria.ALUNO){
            pessoa = banco.buscaAlunoId(id);
        }
        return pessoa;
    }

    public Pessoa buscaNomePessoa(String nome, Categoria cat){
        Pessoa pessoa = null;
        if(cat == Categoria.PROFESSOR){
            pessoa = banco.buscaProfessorNome(nome);
        }else if(cat == Categoria.ALUNO){
            pessoa = banco.buscaAlunoNome(nome);
        }
        return pessoa;
    }

    public Materia buscaNomeMateria(String nome){
        Materia materia;
        materia = banco.buscarMateriaNome(nome);
        return materia;
    }

}
