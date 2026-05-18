import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidadorContrasenaTest {
    private final ValidadorContrasena validador = new ValidadorContrasena();

    @Test 
    void contrasenaConMenosDeOchoCaracteresDebeSerInvalida(){
        assertFalse(validador.esLongitudValida("Abc12"));
    }
    @Test
    void contrasenaSinNumeroDebeSerInvalida(){
        assertFalse(validador.contieneNumero("TextoSinNumeros"));
    }
    @Test 
    void contrasenasSinMayusculaDebeSerInvalida(){
        assertFalse(validador.contieneMayuscula("todoenminuscula123"));
    }
    
    @Test 
    void contrasenaConCaracterEspecialValida(){
        assertTrue(validador.contieneCaracterspecial("Mayuscula!123"));
    }

    @Test
    void contrasenaSinMinusculaDebeSerInvalida(){
        assertFalse(validador.contieneMinuscula("SOLOMAYUSCULAS123!"));
    }

}
