
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author asocc
 */
public class Telefono {

    private String numeroWhatsapp;
    private int prefisso;
    private String Modello;
    private String Nome;

    public void prefisso() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il tuo prefisso :  ");
        prefisso = scan.nextInt();
    }

    public void Numero() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il tuo numero :  ");
        numeroWhatsapp = scan.nextLine();
        System.out.println("il tuo numero : +" + prefisso + numeroWhatsapp);
    }

    public void Nome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il modello del tuo cellulare \n");
        Modello = scan.nextLine();
    }

    public void Stato() {
        Scanner scan = new Scanner(System.in);
        System.out.println("scrivi il tuo nome \n");
        Nome = scan.nextLine();
    }

    public void Nascita() {
    }
}
