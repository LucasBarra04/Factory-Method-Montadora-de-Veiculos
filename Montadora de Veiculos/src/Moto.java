public class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto: pressionando o botão de partida...");
    }
    @Override
    public void acelerar() {
        System.out.println("Moto: girando o punho do acelerador.");
    }
    @Override
    public void descrever() {
        System.out.println("Sou uma moto — 2 rodas, leve e ágil nas ruas.");
    }
}