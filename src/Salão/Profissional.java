/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salão;

/**
 *
 * @author DAVID
 */
public class Profissional {
    
    //atributos
    private int id;
    private String nome;
    private Servico servico;
    
    
    //metodos especiais

    public Profissional(int id, String nome, Servico s) {
        this.id = id;
        this.nome = nome;
        this.servico = s;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
