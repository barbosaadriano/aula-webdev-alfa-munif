package br.com.munif.alfa.jogo;

import javax.swing.JOptionPane;

public class Jogo {
    
    public static void main(String [] args){
        Personagem matheus=new Personagem("Matheus");
        
        
          
        System.out.println(matheus);
        JOptionPane.showMessageDialog(null, matheus);
        

        Personagem renan=new Personagem("Renan");
        
        
          
        

        
    }
}



/**
    Esta é a classe Personagem que serve para 
*/
class Personagem{
    
    String nome; 
    /**
     * Se chegar a zero morreu
     */
    int energia;

    public Personagem() {
        System.out.println("Executando o construtor sem parâmetros de Personagem");
        nome="Sem nome";
        energia=100;
    }
    public Personagem(String nome) {
        System.out.println("Executando o construtor sem parâmetros de Personagem");
        this.nome=nome;
        energia=100;
    }
    
    
    public String toString(){
        String aRetornar;
        aRetornar=this.nome+" "+this.energia;
        return aRetornar;
    }
    
    
    
}