/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Telas.Agendamento;
import Telas.Login;

/**
 *
 * @author DAVID
 */
public class Salao {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cliente c[] = new Cliente [6];
        c[0] = new Cliente (1,"João","Masculino");
        c[1] = new Cliente (2,"Maria","Feminino");
        c[2] = new Cliente (3,"Pedro","Masculino");
        c[3] = new Cliente (4,"Maicon","Masculino");
        c[4] = new Cliente (5,"Rebeca","Masculino");
        c[5] = new Cliente (6,"Bruna","Masculino");
        //c[0].mostrarCliente();
        
        Profissional p[] = new Profissional[3];
        p[0] = new Profissional (1,"Kaue");
        p[1] = new Profissional (2,"Julia");
        p[2] = new Profissional (3,"Luana");
        
        Servico s[] = new Servico[6];
        s[0] = new Servico (1,"Corte Masculino",p[0]);
        s[1] = new Servico (2,"Barba",p[0]);
        s[2] = new Servico (3,"Corte Feminino",p[1]);
        s[3] = new Servico (4,"Pintura",p[1]);
        s[4] = new Servico (5,"Unhas",p[2]);
        s[5] = new Servico (6,"Depilação",p[2]);
            
        
        Telas.Login tela1 = new Login();
        tela1.show();
        
    }

    public static void tela2() {
        Telas.Agendamento tela2 = new Agendamento();
        tela2.show();
    }
    
}
