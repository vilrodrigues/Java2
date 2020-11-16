package heranca;

public class Moto extends Veiculo {
    
    private final int cilindrada;
    
    public Moto(String placa, String marca, String modelo, String renavam, int ano, int cilindrada){
        super(placa, marca, modelo, renavam, ano);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
}
