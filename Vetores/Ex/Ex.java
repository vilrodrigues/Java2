package ex;

import java.util.Scanner;

public class Ex {
   
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        // DECLARACAO DE ARRAY
 
//        int array [] = {1,2,3,4,5,6,7,8,9,0}; // declaracao
//        array = new int [10]; // cria o espaço para o array
//        System.out.printf("%s%8s\n", "index", "Value"); // %s%8s da o espaçamento da coluna
//       
//        for(int counter = 0; counter < array.length; counter++) //varrer e mostrar array
//        {
//            System.out.printf("%5d%8d\n", counter, array[counter]); // %5d%8d da o espaçamento da coluna
//        }
       
        //MANIPULANDO ARRAYS
       
        final int ARRAY_LENGTH = 10;
        int array2[] = new int[ARRAY_LENGTH];
       
        for(int counter2 = 0; counter2 < array2.length; counter2++) // preenchendo o array com numeros multiplos
        {
            array2[counter2] = 2 + 2 * counter2; 
        }
        
        System.out.printf("%s%8s\n", "index", "value"); // monta cabecalho
        
        for(int counter3 = 0; counter3 < array2.length; counter3++) // exibe array
        {
            System.out.printf("%5d%8d\n", counter3, array2[counter3]);
        }
        
    }    
}

