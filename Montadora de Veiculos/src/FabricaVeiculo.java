public abstract class FabricaVeiculo {

    public abstract Veiculo criarVeiculo();
    public void prepararVeiculo() {
        Veiculo v = criarVeiculo();
        System.out.println("\n--- Preparando veículo ---");
        v.descrever();
        v.ligar();
        v.acelerar();
    }
}