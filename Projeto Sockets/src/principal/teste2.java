/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author admin
 */
public class teste2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String dados [] = new String[217];
        
        for(int c=0; c<=4; c++){
            //System.out.println("Digite um valor para a posição ["+c+"] do vetor");
            dados[c] = JOptionPane.showInputDialog("Digite um valor para a posição ["+c+"] do vetor");
            //dados[c] =input.nextInt();
        }
        
        
        for(int c=0; c<=4; c++){
            //JOptionPane.showMessageDialog(null,"O valor digitado na posição ["+c+"] do vetor é " +dados[c]);
            System.out.println("O valor digitado na posição ["+c+"] do vetor é " +dados[c]);
            
        }
        
        
        
        
    }

    
}
