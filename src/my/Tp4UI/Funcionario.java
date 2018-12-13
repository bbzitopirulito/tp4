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
    private static int counter;
    
    public Funcionario(String nomecompleto){
        this.nomecompleto = nomecompleto;
        nome = nomecompleto.substring(0);
        sobrenome = nomecompleto.substring(1);
        counter++;
    }
    
    public int getCounter(){
        return counter;
    }            
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getNomecompleto(){
        return nomecompleto;
    }
}
