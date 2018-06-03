/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salão;

import Salão.Cliente;
import Salão.TelaAgendamento;
import Salão.TelaLogin;






/**
 *
 * @author DAVID
 */
public class Main {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Salão.TelaLogin tela1 = new TelaLogin();
        tela1.show();
    }
   

    public static void tela2() {
        Salão.TelaAgendamento tela2 = new TelaAgendamento();
        tela2.show();
        
    }
    
    
    
    
}
