/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Due;

/**
 *
 * @author asocc
 */
import java.util.Scanner;

public class Prodotto {

    //crea due variabili di tipo stringa la prima proprietaio la seconda nomeNegozio
    private String proprietario;
    private String nomeNegozio;
    
    /*public String getNomePropio() {
       return proprietario;
    }
    public String getNomeNegozio() {
        return nomeNegozio;
    }*/

    public void Proprietario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il nome del propriettaio \n");
        proprietario = scan.nextLine();
    }
     public void nomeNegozio() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il nome del Negozio \n");
        nomeNegozio = scan.nextLine();
    }
}
