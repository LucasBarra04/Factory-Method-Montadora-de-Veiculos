public class FabricaCaminhao extends FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao();
    }
}