package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args){
        System.out.println("Calling using instance of Veena:");
        Veena veena = new Veena();
        veena.play();
        
        System.out.println("\nCalling using instance of Saxophone:");
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println("\nCalling using Playable reference:");
        Playable playable = veena;
        playable.play();

        playable = saxophone;
        playable.play();
    }
}
