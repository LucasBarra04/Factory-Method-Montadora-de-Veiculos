public class FabricaMoto extends FabricaVeiculo {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}