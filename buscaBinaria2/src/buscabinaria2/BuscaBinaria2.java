package buscabinaria2;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class BuscaBinaria2 {
    // Inteiros
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int A[] = new int[5], x, pesq;
        String resp;
        int i, j, meio, comeco, fim;
        boolean achou;
        
        //Entrada de dados
        
        for (i = 0; i < A.length; i++) {
            System.out.println("Entre com a " + (i + 1) + "º número: ");
            A[i] = scan.nextInt();
        }
        
        //Ordenação
        
        /*for (i = 0; i < A.length - 1; i++){
            for (j = 0; j <= A.length - 2; j++) {   
                if ((A[j + 1].compareTo(A[j]) < 0 )){   
                    x = A[j];  
                    A[j] = A[j + 1];
                    A[j + 1] = x;
                }
            }    
        }*/
        
        Arrays.sort(A);
        //System.out.println(Arrays.toString(A));
        
        //Exibição
        
        System.out.println();
        
        for (i = 0; i < A.length; i++) {
            System.out.println((i + 1) + "º número: " + A[i]);
            
        }
        
        // Pesquisa
        
        do {
            System.out.println();
            System.out.println("Entre com o número a ser pesquisado: ");
            pesq = scan.nextInt();
            comeco = 0;
            fim = A.length;
            meio = 0;
            achou = false;
            
            // Laço da divisão do vetor
            while(comeco <= fim & achou == false){
                meio = (comeco + fim) / 2; 
                if(pesq == A[meio]){
                    achou = true;
                }
                else {
                    if(pesq  < A[meio]){
                        fim = meio - 1;
                    }
                    else {
                        comeco = meio + 1;
                    }
                }
            }
            
            if(achou == true){
                System.out.println(pesq + " está na posição " + (meio + 1));
            }
            else {
                System.out.println(pesq + " não foi localizado.");
            }
            
            System.out.println("Deseja pesquisar outra palavra? ([S] / [N]");
            
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                resp = br.readLine();
            } catch(Exception e){
                resp = "";
            }
            
            resp = resp.toUpperCase();
            
            
            
        } while(resp.compareTo("S") == 0);
        
        
        
        
    }
}
