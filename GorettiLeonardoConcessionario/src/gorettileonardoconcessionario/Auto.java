/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gorettileonardoconcessionario;

/**
 *
 * @author goretti.leonardo
 */

import java.util.*;

public class Auto {
    private String modello;
    private int prezzo;
    private String condizioni;
    private String targa;
    private String marca;
    private int cilindrata;
    private int km;
    private int potenza;
    private  Alimentazione alimentazione;
    private String tipoMezzo;
    public Auto(String modello, int prezzo, String condizioni, String targa, String marca, int cilindrata, int km, int potenza, Alimentazione alimentazione, String tipoMezzo ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il modello dell'auto");
        modello = scanner.nextLine();
        System.out.println("Inserisci il prezzo");
        prezzo = scanner.nextInt();
        System.out.println("Inserisci le condizioni");
        condizioni = scanner.nextLine();
        System.out.println("Inserisci la targa");
        targa = scanner.nextLine();
        System.out.println("Inserisci la cilindrata");
        cilindrata = scanner.nextInt();
        System.out.println("Inserisci i chilometri");
        km = scanner.nextInt();
        System.out.println("Inserisci la potenza");
        potenza = scanner.nextInt();
        System.out.println("Inerisci il tipo di alimentazione");
        System.out.println("Seleziona una sezione:");
        Alimentazione[] opzioni = Alimentazione.values();
        for (int i = 0; i < opzioni.length; i++) {
            System.out.println(i + ". " + opzioni[i]);
        }
        int scelta = scanner.nextInt();
    }
}
