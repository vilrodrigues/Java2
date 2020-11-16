package classesabstratas;

public class Horista extends Funcionario {
    
    private double valorHora, horas;

    public Horista(String cpf, String nome, double valorHora) {
        super(cpf, nome);
        this.valorHora = valorHora;
    }
    public double getHoras() { return horas; }
    public void setHoras(double hrs) { horas = hrs; }
    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHr) { this.valorHora = valorHr; }
    
    @Override
    public double salBruto(){
        return horas * valorHora;
    }
    
    @Override
    public double descontos(){
        double salarioBruto = salBruto();
        if(horas > 150){
            return salarioBruto * 0.08;
        }
        else {
            return salarioBruto * 0.04;
        }
    }
}
