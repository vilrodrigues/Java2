package heranca;

public class Heranca {

    public static void main(String[] args) {
        
        Veiculo v = new Veiculo("ABC-1234", "FIAT", "PALIO", "01234-5", 1975);
        Moto m = new Moto("CBA-4321", "YAMAHA", "FAZER", "54321-0", 2018, 150);
        
        Moto m1 = (Moto) v; // não pode
        
        Veiculo v2 = m;
        
    }
}
