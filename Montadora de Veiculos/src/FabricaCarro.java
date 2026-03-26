public class FabricaCarro extends FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}