/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author DAVID
 */
public class Servico {
    
    //atributos
    private int codigo;
    private String nome;
    private Profissional profissional;

    
    //metodos publicos
     public void mostrarServico(){
         System.out.println("Codigo do serviço: "+ this.getCodigo());
         System.out.println("Nome do serviço: "+ this.getNome());
         System.out.println("Nome do profissional: "+ this.profissional.getNome());
     }
   
    //metodos especiais

    public Servico(int codigo, String nome, Profissional profissional) {
        this.codigo = codigo;
        this.nome = nome;
        this.profissional = profissional;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissional() {
        return profissional.getNome();
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
}
