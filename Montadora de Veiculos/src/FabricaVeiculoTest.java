import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaVeiculoTest {

    @Test
    void fabricaCarroDeveProduzirCarro() {
        FabricaVeiculo fabrica = new FabricaCarro();
        Veiculo veiculo = fabrica.criarVeiculo();
        assertInstanceOf(Carro.class, veiculo);
    }

    @Test
    void fabricaMotoDeveProduzirMoto() {
        FabricaVeiculo fabrica = new FabricaMoto();
        Veiculo veiculo = fabrica.criarVeiculo();
        assertInstanceOf(Moto.class, veiculo);
    }

    @Test
    void fabricaCaminhaoDeveProduzirCaminhao() {
        FabricaVeiculo fabrica = new FabricaCaminhao();
        Veiculo veiculo = fabrica.criarVeiculo();
        assertInstanceOf(Caminhao.class, veiculo);
    }

    @Test
    void produtoDeveImplementarInterfaceVeiculo() {
        FabricaVeiculo fabrica = new FabricaCarro();
        Veiculo veiculo = fabrica.criarVeiculo();
        assertInstanceOf(Veiculo.class, veiculo);
    }

    @Test
    void cadaChamadaDeveRetornarNovaInstancia() {
        FabricaVeiculo fabrica = new FabricaCarro();
        Veiculo v1 = fabrica.criarVeiculo();
        Veiculo v2 = fabrica.criarVeiculo();
        assertNotSame(v1, v2);
    }

    @Test
    void prepararVeiculoNaoDeveLancarExcecao() {
        FabricaVeiculo fabrica = new FabricaMoto();
        assertDoesNotThrow(fabrica::prepararVeiculo);
    }

    @Test
    void produtoNuncaDeveSerNulo() {
        assertNotNull(new FabricaCarro().criarVeiculo());
        assertNotNull(new FabricaMoto().criarVeiculo());
        assertNotNull(new FabricaCaminhao().criarVeiculo());
    }
}