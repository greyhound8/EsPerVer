/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tre;

import java.util.Scanner;

/**
 *
 * @author asocc
 */
public class Auto {
    private String Marca;
    private String Modello;
    private String Targa;
    private int anno;
    public void Proprietario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi la marca \n");
        Marca = scan.nextLine();
    }
    public void Modello() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il modello \n");
        Modello = scan.nextLine();
    }

    public void Indetificazione() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il targa \n");
        System.out.println(Targa);
   
    }
    public void Nascita() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi l'anno del acquisto \n");
        anno = scan.nextInt();
    }
}
