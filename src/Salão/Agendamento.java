/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salão;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;







 
public class Agendamento {
    
    private int codigo;
    private Cliente c;
    private Servico s;
    private Profissional p;
    private String datahora;
    
    //int cont = 0;

    public Agendamento() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Agendamento> lista(){
        ArrayList<Agendamento> lista = new ArrayList<Agendamento>();
        return lista;
    }
    
    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Servico getS() {
        return s;
    }

    public void setS(Servico s) {
        this.s = s;
    }

    public Profissional getP() {
        return p;
    }

    public void setP(Profissional p) {
        this.p = p;
    }

    public String getDatahora() {
        return datahora;
    }

    

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }
    
    
    
    
    
    
    
    
}

