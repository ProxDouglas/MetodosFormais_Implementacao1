package View;


import Controller.Cadastro;
import Model.Categoria;
import Model.Usuario;

public class Login {
    public boolean realizarLoginAdmin(Cadastro cadastro) {
        Usuario usuario = new Usuario("admin", "admin", Categoria.ADMINISTRADOR);
        return cadastro.getBanco().loginAdmin(usuario);
    }

    public boolean realizarLoginProfessor(Cadastro cadastro) {
        Usuario usuario = new Usuario("Bren", "999999999", Categoria.PROFESSOR);
        return cadastro.getBanco().login(usuario);
    }

    public boolean realizarLoginAluno(Cadastro cadastro) {
        Usuario usuario = new Usuario("Ste", "999999999", Categoria.PROFESSOR);
        return cadastro.getBanco().login(usuario);
    }
}
