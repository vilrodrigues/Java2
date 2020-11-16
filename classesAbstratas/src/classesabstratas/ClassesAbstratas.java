package classesabstratas;

public class ClassesAbstratas {

    public static void main(String[] args) {
        
           Funcionario folha[] = new Funcionario[5];
           
           folha[0] = new Mensalista("1","JUCA", 3500);
           folha[1] = new Horista("2", "ZECA", 25);
           folha[2] = new Comissionado("3", "BIANCA", 6);
           folha[3] = new Mensalista("4", "ANA", 4300);
           folha[4] = new Horista("5", "ZELIA", 37);
           
           ((Horista) folha[1]).setHoras(86.5);
           ((Comissionado) folha[2]).setValorVendas(75000);
           ((Horista) folha[4]).setHoras(138.3);
           
           for(Funcionario f : folha) {
               System.out.format("%s - Sal: %.2f Desc: %.2f Liq: %.2f \n", f.getNome(), f.salBruto(), f.descontos(), f.salLiquido());
           }
           
           
    }
}
