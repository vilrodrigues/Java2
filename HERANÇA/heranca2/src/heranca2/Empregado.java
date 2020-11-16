package heranca2;

public class Empregado {
    
    private final String nome;
    private final String cpf;
    private double salario;

    public Empregado(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(float novoSalario) {
        this.salario = novoSalario;
    }
    
    public double calcularDescontos(){
        return salario * 0.08;
    }
    public double salarioLiquido(){
        return salario - calcularDescontos();
    }
    
    
    
    
    
}
