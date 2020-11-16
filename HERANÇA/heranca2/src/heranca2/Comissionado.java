package heranca2;

public class Comissionado extends Empregado {
    
    private double totalVendas;
    
    public Comissionado(String nome, String cpf, double salario){
        super(nome, cpf, salario);
        this.totalVendas = 0;
    }
    public double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(){
        this.totalVendas = totalVendas;
    }
    
    @Override
    public double calcularDescontos(){
        return this.getSalario() * 0.08;
    }
    @Override
    public double salarioLiquido(){
        return (this.getSalario() - calcularDescontos()) + (totalVendas * 0.05);
    }
    
    
}
