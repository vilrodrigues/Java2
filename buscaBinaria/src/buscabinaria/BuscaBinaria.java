package buscabinaria;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class BuscaBinaria {
    // Strings
    public static void main(String[] args) {
        
        //Objetivo: Localizar um elemento X em uma lista.
        //Passos:
        // 1º Ordene  vetor.
        // 2º Encontre o meio do vetor. 
        // 3º O elemento é igual ao meio do vetor?
        // 4º Se sim, encontrou o elemento. Se não, ignora a metade maior ou menor que o elemento pesquisado.
        // 5º Encontre o meio do sub-vetor.
        // 6º O elemento é igual ao meio do vetor?
        // 7º Se sim, encontrou o elemento. Se não, ignora a metade maior ou menor que o elemento pesquisado.
        // 8º Repete novamente os passos 5 a 7, até encontrar o elemento.
        
        Scanner scan = new Scanner(System.in);
        String A[] = new String[5], x, pesq, resp;
        int i, j, meio, comeco, fim;
        boolean achou;
        
        //Entrada de dados
        
        for (i = 0; i < A.length; i++) {
            System.out.println("Entre com a " + (i + 1) + "º palavra: ");
            A[i] = scan.nextLine();
        }
        
        //Ordenação
        
        for (i = 0; i < A.length - 1; i++){
            for (j = 0; j <= A.length - 2; j++) {   
                if ((A[j + 1].compareTo(A[j]) < 0 )){   
                    x = A[j];  
                    A[j] = A[j + 1];
                    A[j + 1] = x;
                }
            }    
        }
        
        //Arrays.sort(A);
        //System.out.println(Arrays.toString(A));
        
        //Exibição
        
        for (i = 0; i < A.length; i++) {
            System.out.println((i + 1) + "º palavra: " + A[i]);
            
        }
        
        // Pesquisa
        
        do {
            System.out.println();
            System.out.println("Entre com a palavra a ser pesquisada: ");
            pesq = scan.nextLine();
            comeco = 0;
            fim = A.length;
            meio = 0;
            achou = false;
            
            // Laço da divisão do vetor
            while(comeco <= fim & achou == false){
                meio = (comeco + fim) / 2; 
                if(pesq.compareTo(A[meio]) == 0){
                    achou = true;
                }
                else {
                    if(pesq.compareTo(A[meio]) < 0){
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
