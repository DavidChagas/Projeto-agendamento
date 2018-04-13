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
public class Profissional {
    
    //atributos
    private int id;
    private String nome;
    
    //metodos publicos
    
    public void mostrarProfissional(){
        System.out.println("id do profissional: "+ this.getId());
        System.out.println("Nome do profissional: "+ this.getNome());
    }
    
    //metodos especiais

    public Profissional(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
