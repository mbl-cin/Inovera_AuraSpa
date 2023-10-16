/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fluxodecaixa;

/**
 *
 * @author User
 */
public class FluxoDeCaixa {

    public static void main(String[] args) {
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
    e.printStackTrace(); // ou qualquer outra ação apropriada
}
        
    }
}
