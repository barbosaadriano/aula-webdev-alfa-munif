package br.com.adrianob;

/**
 *
 * @author Administrador
 */
public class Jogo {
    
    public static void main(String[] args) {
        String nome;
        if (args.length==0) {
            nome = "Mundo";
        } else {
            nome = args[0];
        }
        System.out.println("Olá "+nome+"!!!");
        
    }
}
