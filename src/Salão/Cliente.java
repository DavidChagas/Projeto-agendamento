/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salão;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author DAVID
 */
public class Cliente {

    
    
    //atributos
    private int codigo;
    private String nome;
    private String sexo;
    
    //métodos publicos
        public void mostrarCliente(){
            System.out.println("codigo: "+ this.getCodigo());
            System.out.println("nome: "+ this.getNome());
        }
    
    //método contrutor

    public Cliente(int codigo, String nome, String sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
    }
    
    public ArrayList<Cliente> listaCliente(){
        
        return new ArrayList<Cliente>();
    }
    //getters e setters 
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public Cliente() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Cliente(String cliente) { nome = cliente;}
    
}
