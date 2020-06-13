/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switcherexample;

import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;

/**
 *
 * @author Derik Psyclopse Yeager
 */
public class Drum {
    
    private double rndRhythm;
    private Phrase phr1;
    private Note note;
  
    
     public void play(Part piano1, int low, float start, int notes, boolean maj){
        phr1 = new Phrase(start);
		for (int i=0; i< notes; i++) {
                       rndRhythm = (Math.random());
                       if (i % 4 == 0){
                           if (rndRhythm > 0.0 && rndRhythm <= 0.2){
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, 0.5);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.2 && rndRhythm <= 0.4){
                               note = new Note(low, 0.5);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.4 && rndRhythm <= 0.6){
                               note = new Note(low, .375);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, .375);
                               phr1.addNote(note);
                           }else{
                           note = new Note(low, 0.5);
                           phr1.addNote(note);
                           note = new Note(low, 0.5);
                           phr1.addNote(note);
                           }
                           if (i % 4 != 0){
                       
                           if (rndRhythm <= 0.2) {
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.2 && rndRhythm <= 0.3){
                               note = new Note(low, .375);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, .375);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.3 && rndRhythm <= 0.5){
                               note = new Note(low, 0.5);
                               phr1.addNote(note);
                               note = new Note(low, 0.125);
                               phr1.addNote(note);
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.5 && rndRhythm <= 0.6){
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                               note = new Note(low, 0.625);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.6 && rndRhythm <= 0.7){
                               note = new Note(low, .375);
                               phr1.addNote(note);
                               note = new Note(low, 0.25);
                               phr1.addNote(note);
                               note = new Note(low, .375);
                               phr1.addNote(note);
                           }else if (rndRhythm > 0.7 && rndRhythm <= 0.8){
                               note = new Note(low, 0.625);
                               phr1.addNote(note);
                               note = new Note(low, 0.375);
                               phr1.addNote(note);
                           }
                       }
                       }
		}
                piano1.addPhrase(phr1);
    }
}
