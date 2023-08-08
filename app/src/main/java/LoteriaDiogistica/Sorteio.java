/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoteriaDiogistica;

import java.util.Random;

/**
 *
 * @author Diogo
 */
public class Sorteio {
       
    public String sorteiaNumero(){  
        String resultado = "";
      
        int numero, i, j;
        int[] mega = new int[6];
        //Faz a instanciação da Classe Random para gerar números aleatórios
        Random r = new Random();
        for (i = 0; i < mega.length; i++) {
            numero = r.nextInt(60) + 1;
            //Conferir e tirar os números repetidos
            for (j = 0; j < mega.length; j++) {
                if (numero == mega[j] && j != i) {
                    numero = r.nextInt(60) + 1;
                } else {
                    mega[i] = numero;
                }
            }
        }
        //Loop responsável por fazer a ordenação de forma crescete dos números do vetor
        for (i = 0; i < mega.length; i++) {
            for (j = i + 1; j < mega.length; j++) {
                if (mega[i] > mega[j]) {
                    numero = mega[i];
                    mega[i] = mega[j];
                    mega[j] = numero;
                }

            }
        }
        //Apresentar na tela o resultado
        for (i = 0; i < mega.length; i++) {
            resultado = resultado + " " + mega[i];
        }
        
        return resultado;
    }
}
