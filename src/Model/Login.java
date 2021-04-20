package Model;

import Model.Banco;
import java.util.Scanner;

public class Login {
    public boolean realizarLoginAdmin(){
        Banco banco = new Banco();
        Usuario usuario = new Usuario();
        Scanner keyboard = new Scanner (System.in);
    
        String inpUser = keyboard.nextLine();
        String inpPass = keyboard.nextLine();

        boolean resultado = banco.loginAdmin(inpUser,inpPass);
        return resultado;
    }    
}
