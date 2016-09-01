package br.k19.calendario;
import java.util.Calendar;

public class Calendario {
    public static void main (String[] args){
        char b = 'F';
        
        Calendar atual = Calendar.getInstance();
        Calendar passado = Calendar.getInstance();
        
        passado.set(Calendar.YEAR, 1978);
    
    System.out.println (atual.get(Calendar.YEAR));
    System.out.println (passado.get(Calendar.YEAR));
    
    System.out.println (atual.get(Calendar.YEAR) - passado.get(Calendar.YEAR));
    System.out.println (b);
    
    }

    
    
}
