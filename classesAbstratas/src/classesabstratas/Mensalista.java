package classesabstratas;

public class Mensalista extends Funcionario {
    
    private double salarioMensal;

    public Mensalista(String cpf, String nome, double salario) {
        super(cpf, nome);
        salarioMensal = salario;
    }
    public double getSalario() { return salarioMensal; }
    public void setSalario(double salario) { salarioMensal = salario; }
    
    @Override
    public double salBruto(){
        return salarioMensal;
    }
    
    @Override
    public double descontos(){
        return salarioMensal * 0.08;
    }
}
