package UsuarioSeguro;

import javax.swing.*;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario.isEmpty() || nombreUsuario == null) {
            System.out.println("Ingrese un nombre correcto, no se aceptan cadenas vacias");

        }else{
            this.nombreUsuario = nombreUsuario;
        }

    }

    public String getPassword() {
        return password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setPassword (String password) {
        boolean contrasenaMayuscula = false;
        boolean contrasenaMinuscula = false;
        boolean contrasenaDigito = false;
        if(password.length()<8){
            System.out.println("Error la contraseña debe tener al menos 8 digitos");
        }
        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                contrasenaMayuscula = true;
            }
            if(Character.isLowerCase(password.charAt(i))){
                contrasenaMinuscula = true;
            }
            if(Character.isDigit(password.charAt(i))){
                contrasenaDigito = true;
            }
        }
        if(!contrasenaMayuscula){
            System.out.println("La contraseña debe de tener al menos una mayuscula");
        }
        if(!contrasenaMinuscula) {
            System.out.println("La contraseña debe de tener al menos una minuscula");
        }
        if(!contrasenaDigito) {
            System.out.println("La contraseña debe tener algun digito");
        }
        if(contrasenaMayuscula && contrasenaMinuscula && contrasenaDigito) {
            this.password = password;

        }
    }
    public boolean Autenticar(String nombreUsuario, String password){
        if(nombreUsuario.equals(this.nombreUsuario) && password.equals(this.password)) {
            System.out.println("Bienvenido");
            return true;
        }else {
            System.out.println("El usuario o la contrasena no coinciden");
        }
        return false;
    }



}