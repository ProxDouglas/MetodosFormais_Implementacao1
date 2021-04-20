import Controller.Service;
import Model.Categoria;

public class teste {

    public static void main(String[] args){

        Service service = new Service();
        service.service(Categoria.ADMINISTRADOR);
    }

}

