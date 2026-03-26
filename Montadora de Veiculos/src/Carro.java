public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro: girando a chave de ignição...");
    }
    @Override
    public void acelerar() {
        System.out.println("Carro: pisando no acelerador suavemente.");
    }
    @Override
    public void descrever() {
        System.out.println("Sou um carro — 4 rodas, motor dianteiro, ideal para passeio.");
    }
}