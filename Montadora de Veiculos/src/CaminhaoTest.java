import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CaminhaoTest {

    @Test
    void deveCriarInstanciaDeVeiculo() {
        Veiculo caminhao = new Caminhao();
        assertNotNull(caminhao);
    }

    @Test
    void deveImplementarInterfaceVeiculo() {
        Veiculo caminhao = new Caminhao();
        assertInstanceOf(Veiculo.class, caminhao);
    }

    @Test
    void ligarNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Caminhao().ligar());
    }

    @Test
    void acelerarNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Caminhao().acelerar());
    }

    @Test
    void descreverNaoDeveLancarExcecao() {
        assertDoesNotThrow(() -> new Caminhao().descrever());
    }
}