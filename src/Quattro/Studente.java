/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quattro;

import java.util.Scanner;

/**
 *
 * @author asocc
 */
public class Studente {
    private String nome;
    private String cognome;
    private String codiceFis;
    public void AlunnoN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il tuo nome \n");
        nome = scan.nextLine();
    }
    public void AlunnoC() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il tuo cognome \n");
        cognome = scan.nextLine();
    }
    public void CF() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi la codice fiscale \n");
        codiceFis= scan.nextLine();
    }
    
}
