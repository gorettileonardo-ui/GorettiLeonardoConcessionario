/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gorettileonardoconcessionario;

import java.util.Scanner;

/**
 *
 * @author goretti.leonardo
 */
public class Concessionario {
    Auto[] Automobile;
    public Concessionario(){
        Automobile = new Auto[10];
    }
    
    public boolean rimuoviAuto(String targa){
        for (Auto a: Automobile){
            if (a.getTarga() == targa)
                //rimuovo l'auto dall'array
                return true;
        }
        return false;
    }
    
    public void creaAuto(){
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
