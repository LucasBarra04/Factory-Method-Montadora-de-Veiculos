import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCriarInstanciaDeVeiculo() {
        Veiculo carro = new Carro();
        assertNotNull(carro);
    }

    @Test
    void deveImplementarInterfaceVeiculo() {
        Veiculo carro = new Carro();
        assertInstanceOf(Veiculo.class, carro);
    }

    @Test
    void ligarNaoDeveLancarExcecao() {
        Veiculo carro = new Carro();
        assertDoesNotThrow(carro::ligar);
    }

    @Test
    void acelerarNaoDeveLancarExcecao() {
        Veiculo carro = new Carro();
        assertDoesNotThrow(carro::acelerar);
    }

    @Test
    void descreverNaoDeveLancarExcecao() {
        Veiculo carro = new Carro();
        assertDoesNotThrow(carro::descrever);
    }
}