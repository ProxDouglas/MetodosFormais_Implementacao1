package Controller;

import Model.Categoria;
import View.Login;
import View.AdicionarInterface;

public class Service {
    Cadastro cadastro = new Cadastro();

    public void service(Categoria categoria) {
        String acao = "null";
        Login login = new Login();

        if (categoria == Categoria.ADMINISTRADOR) {
            //1)Login
            login.realizarLoginAdmin(this.cadastro);
            //2)Ação (caso login seja um sucesso)
            acao = "adicionar";
            serviceAdmin(acao);
        }
        if (categoria == Categoria.PROFESSOR) {
            login.realizarLoginProfessor(this.cadastro);
            serviceProfessor(acao);
        }
        if (categoria == Categoria.ALUNO) {
            login.realizarLoginAluno(this.cadastro);
            serviceAluno(acao);
        }
    }

    private void serviceAdmin(String acao) {
        if (acao.equals("adicionar")) {
            // formulario com categoria

            AdicionarInterface test = new AdicionarInterface(this.cadastro);

            test.alunoADD();
            test.professorADD();
            test.matériaADD();
        }
        if (acao.equals("alterar")) {
            //perguntar categoria
            //usar formulario para alterar
        }
    }

    private void serviceProfessor(String acao) {
        if (acao.equals("adicionar aula")) {

        }
        if (acao.equals("marcar presenca")) {

        }
        if (acao.equals("preparar provas")) {

        }
    }

    private void serviceAluno(String acao) {

    }

}
