/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.Tp4UI;

/**
 *
 * @author pc2
 */
public class Funcionario {
    public String nomecompleto;
    public String nome;
    public String sobrenome;
    
    public Funcionario(String nomecompleto){
        this.nomecompleto = nomecompleto;
        nome = nomecompleto.substring(0);
        sobrenome = nomecompleto.substring(1);
    }
    
    public String nome(){
        return nome;
    }
    
    public String sobrenome(){
        return sobrenome;
    }
    
    public String nomecompleto(){
        return nomecompleto;
    }
}
