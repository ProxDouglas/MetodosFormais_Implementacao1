package View;


import Controller.Cadastro;
import Model.Banco;
import Model.Usuario;

import java.util.Scanner;

public class Login {
    public boolean realizarLoginAdmin(Cadastro cadastro){
        Banco banco = cadastro.getBanco();
        Usuario usuario ;
        Scanner keyboard = new Scanner (System.in);

        //String inpUser = keyboard.nextLine();
        //String inpPass = keyboard.nextLine();

        //usuario = new Usuario(inpUser, inpPass);
        usuario = new Usuario("admin", "admin");

        boolean resultado = banco.loginAdmin(usuario);
        return resultado;
    }
}
