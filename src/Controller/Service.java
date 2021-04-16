package Controller;

import Model.Categoria;

public class Service {

    public void service(Categoria categoria){
        String acao = null;

        if(categoria == Categoria.ADMINISTRADOR){
            //acao =
            serviceAdmin(acao);
        }if(categoria == Categoria.PROFESSOR){

            serviceProfessor(acao);
        }if(categoria == Categoria.ALUNO){

            serviceAluno(acao);
        }
    }

    private void serviceAdmin(String acao){

        if(acao.equals("adicionar")){
            // formulario com categoria

        }if(acao.equals("alterar")) {
            //perguntar categoria
            //usar formulario para alterar
        }
    }

    private void serviceProfessor(String acao){

        if(acao.equals("adicionar aula")){

        }if(acao.equals("marcar presenca")){

        }if(acao.equals("preparar provas")){

        }
    }

    private void serviceAluno(String acao){


    }



}
