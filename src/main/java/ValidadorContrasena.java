public class ValidadorContrasena{
    public boolean esLongitudValida(String contrasena){
        return contrasena != null && contrasena.length() >= 8;
    }
    public boolean contieneNumero(String contrasena){
        return contrasena != null && contrasena.matches(".*\\d.*");
    }
    public boolean contieneMayuscula(String contrasena){
        return contrasena != null && contrasena.matches(".*[A-Z].*");
    }
    public boolean contieneCaracterspecial(String contrasena){
        return contrasena.matches(".*[@#!$%^&*(),.?\":{}|<>].*");
    }
    public boolean contieneMinuscula(String contrasena){
        return contrasena != null && contrasena.matches(".*[a-z].*");
    }
}
