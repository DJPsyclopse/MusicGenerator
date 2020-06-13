/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switcherexample;

/**
 *
 * @author Derik Psyclopse Yeager
 */
import jm.music.data.*;
import jm.util.Play;

public class Treble {
    private int[] major = {0, 4, 7, 12, 16, 19, 24, 28, 31, 36, 40, 43};
    private int[] minor = {0, 3, 7, 12, 15, 19, 24, 27, 31, 36, 39, 43};
    private double[] rhythm = {0.0625, 0.125, 0.1666666667, 0.25, 0.5};
    private int[] recur = {8, 4, 3, 2, 1};
    private int rnd1, rndRhythm;
    private Phrase phr1;
    private Note note;
    //private Part piano1;
    
    public void play(Part piano1, int low, float start, int notes, boolean maj){
        phr1 = new Phrase(start);
                note = new Note(low, 0.5f);
                phr1.addNote(note);
		for (int i=0; i< notes - 2; i++) {
                       rndRhythm = (int)(Math.random() * 5);
                      
                       try {
                       for(int j = 0; j < recur[rndRhythm]; j++){
                       rnd1 = (int)(Math.random() * 12);
                       if (maj)
                       note = new Note(low  + major[rnd1], rhythm[rndRhythm]);
                       else
                           note = new Note(low + minor[rnd1], rhythm[rndRhythm]);
                       }
                      
                        phr1.addNote(note);
                       }
                       catch (Exception e){
                           System.out.println("exceeded array index");
                       }
		}
                note = new Note(low, 0.5f);
                phr1.addNote(note);
               //piano1 = new Part("piano", 0, 0);
                piano1.addPhrase(phr1);
		//Play.midi(piano1);
    }
}
