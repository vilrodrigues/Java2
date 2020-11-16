package classesabstratas;

public class Comissionado extends Funcionario {
    
    private double valorVendas, percComissao;

    public Comissionado(String cpf, String nome, float percComissao) {
        super(cpf, nome);
        this.percComissao = percComissao;
    }
    public double getValorVendas() { return valorVendas; }
    public void setValorVendas(double valorVendas) { this.valorVendas = valorVendas; }
    public double getPercComissao() { return percComissao; }
    public void setPercComissao(double percComissao) { this.percComissao = percComissao; }
    
    @Override
    public double salBruto(){
        return (valorVendas * percComissao) / 100;
    }
    
    @Override
    public double descontos(){
        return  salBruto() * 0.05;
        
    }
    
    
}
