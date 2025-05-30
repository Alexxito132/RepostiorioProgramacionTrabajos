import UsuarioSeguro.UsuarioSeguro;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro u = new UsuarioSeguro();

        System.out.println("Usuario:");
        String nom = sc.nextLine();
        u.setNombreUsuario(nom);

        System.out.println("Contrasena:");
        u.setPassword(sc.nextLine());

        if (u.getNombreUsuario() != null && u.getPassword() != null) {
            System.out.println("Creado");
            System.out.println("Ingresa tu usuario");
            String usuario2 = sc.nextLine();
            System.out.println("Ingresa tu contrasena:");
            String intento = sc.nextLine();
            if (u.Autenticar(usuario2, intento)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
        } else {
            System.out.println("Error");
        }


    }
}
