public class Caminhao implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Caminhão: acionando o motor a diesel...");
    }
    @Override
    public void acelerar() {
        System.out.println("Caminhão: engatando a marcha lentamente.");
    }
    @Override
    public void descrever() {
        System.out.println("Sou um caminhão — muitas rodas, grande capacidade de carga.");
    }
}