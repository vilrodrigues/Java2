package heranca;

public class Veiculo {
    
    private final String marca, modelo, renavam;
    private String placa;
    private final int ano;
    
    public Veiculo(String placa, String marca, String modelo, String renavam, int ano){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.renavam = renavam;
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getRenavam() {
        return renavam;
    }
    public int getAno() {
        return ano;
    }
    public void setPlaca(String novaPlaca) {
        this.placa = novaPlaca;
    }
}
