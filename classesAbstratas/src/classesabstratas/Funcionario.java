package classesabstratas;

public abstract class Funcionario {
    
    private final String cpf;
    private String nome;

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public abstract double salBruto();
        
    public abstract double descontos();
    
    public double salLiquido() { return salBruto() - descontos(); }
}
