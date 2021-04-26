package Model;

public class Usuario {

    private String login;
    private String senha;
    private Categoria categoria;

    public Usuario(String login, String senha, Categoria categoria) {
        this.login = login;
        this.senha = senha;
        this.categoria = categoria;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean ehIgual(String login, String senha, Categoria categoria) {
        return this.login.equals(login) && this.senha.equals(senha) && this.categoria.equals(categoria);
    }

    public boolean ehIgual(Usuario usuario) {
        return this.ehIgual(usuario.getLogin(), usuario.getSenha(), usuario.getCategoria());
    }
}
