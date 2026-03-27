import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveCriarInstanciaDeVeiculo() {
        Veiculo moto = new Moto();
        assertNotNull(moto);
    }

    @Test
    void deveImplementarInterfaceVeiculo() {
        Veiculo moto = new Moto();
        assertInstanceOf(Veiculo.class, moto);
    }

    @Test
    void ligarNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Moto().ligar());
    }

    @Test
    void acelerarNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Moto().acelerar());
    }

    @Test
    void descreverNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Moto().descrever());
    }
}