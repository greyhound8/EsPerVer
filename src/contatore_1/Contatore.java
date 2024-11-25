/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contatore_1;

import java.util.Scanner;

/**
 *
 * @author asocc
 */
public class Contatore {

    private int var;
    private int i;
    private int d;

    public void variabile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi un numero \n");
        var = scan.nextInt();
    }

    public void incrementa() {
        i = var++;
        System.out.println("valore dopo l'incremento " + i);
    }

    public void decrementa() {
        d = var--;
        System.out.println( "valore dopo l'incremento " + d);
    }
}
