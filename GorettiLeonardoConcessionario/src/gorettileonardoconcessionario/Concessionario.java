/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gorettileonardoconcessionario;

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
}
