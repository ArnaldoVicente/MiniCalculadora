/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho1;
import javax.swing.JFrame;


/**
 *
 * @author junio
 */
public class Trabalho1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
                
        // Define a operação de fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adiciona o NewJPanel ao JFrame
        frame.add(new Calculadora());
        
        // Define o tamanho e visibilidade do JFrame
        frame.setSize(400, 300); // Ajuste o tamanho conforme necessário
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    
    }
}
