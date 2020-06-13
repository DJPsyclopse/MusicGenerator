/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switcherexample;

import jm.music.data.Part;
import jm.music.data.Score;
import jm.util.Play;

/**
 *
 * @author Derik Psyclopse Yeager
 */
public class MusicModel {
    private static int[] tChord = {40, 42, 44, 45, 47, 49, 50};
    private static int[] bChord = {28, 30, 32, 33, 23, 25, 27};
    private static int[] violinChord = {52, 54, 56, 45, 47, 49, 50};
    private static int[] Cir5TChord = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static int[] Cir5BChord = {28, 29, 30, 31, 32, 33, 34, 23, 24, 25, 26, 27};
    private static int[] Cir5ViolinChord = {52, 53, 54, 55, 56, 45, 46, 47, 48, 49, 50, 51};
    private static boolean[] maj = {true, false, false, true, true, false, false};
    private static int chordIndex;
    private Treble treble;
    private Bass bass;
    private Drum drum;
    private Part keys, synth, trumpet, pipes, violin, slap, bDrum;
    private Score tune;
    
    Score runA(){
        treble = new Treble();
        bass = new Bass();
        drum = new Drum();
        keys = new Part("Piano", 0, 0);
        synth = new Part("Synth", 38, 1);
        trumpet = new Part("Trumpet", 56, 2);
        pipes = new Part("Pipes", 19, 3);
        violin = new Part("violin", 40, 4);
        slap = new Part("Slap", 36, 5);
        bDrum = new Part("Thump", 36, 9);

        //Part bass = new Part("Bass", 36, 5);
        tune = new Score("music");
        
        
        chordIndex = 1;
        
        treble.play(keys, tChord[chordIndex], 0.0f, 18, maj[chordIndex]);
        treble.play(trumpet, tChord[chordIndex], 0.0f, 18, maj[chordIndex]);
        bass.play(slap, bChord[chordIndex], 0.0f, 18, maj[chordIndex]);
        drum.play(bDrum, 36, 0.0f, 116, true);
        
        chordIndex = (int)(Math.random() * 7);

        treble.play(synth, tChord[chordIndex], 3.60f, 22, maj[chordIndex]);
        treble.play(pipes, tChord[chordIndex], 3.60f, 22, maj[chordIndex]);
         bass.play(slap, bChord[chordIndex], 3.6f, 22, maj[chordIndex]);
         
        chordIndex = (int)(Math.random() * 7);
//        treble.play(keys, tChord[chordIndex], 8.10f, 22, maj[chordIndex]);
//        treble.play(synth, tChord[chordIndex], 8.10f, 22, maj[chordIndex]);
        treble.play(trumpet, tChord[chordIndex], 8.10f, 22, maj[chordIndex]);
//        treble.play(pipes, tChord[chordIndex], 57, 8.10f, 22, maj[chordIndex]);
         treble.play(violin, tChord[chordIndex], 8.10f, 22, maj[chordIndex]);
          bass.play(slap, bChord[chordIndex], 8.1f, 22, maj[chordIndex]);
        
            chordIndex = (int)(Math.random() * 7);
        treble.play(keys, tChord[chordIndex], 12.6f, 22, maj[chordIndex]);
        treble.play(synth, tChord[chordIndex], 12.60f, 22, maj[chordIndex]);
//        treble.play(trumpet, tChord[chordIndex], 12.60f, 22, maj[chordIndex]);
//        treble.play(pipes, tChord[chordIndex], 12.60f, 22, maj[chordIndex]);
//        treble.play(violin, tChord[chordIndex], 12.60f, 22, maj[chordIndex]);
        bass.play(slap, bChord[chordIndex], 12.6f, 22, maj[chordIndex]);

        chordIndex = 5;
        treble.play(pipes, tChord[chordIndex], 17.10f, 22, maj[chordIndex]);
        treble.play(violin, tChord[chordIndex], 17.10f, 22, maj[chordIndex]);
        bass.play(slap, bChord[chordIndex], 17.1f, 22, maj[chordIndex]);
        
        chordIndex = 1;
        treble.play(synth, tChord[chordIndex], 21.60f, 22, maj[chordIndex]);
        treble.play(trumpet, tChord[chordIndex], 21.60f, 22, maj[chordIndex]);
        bass.play(slap, bChord[chordIndex], 21.6f, 22, maj[chordIndex]);
        
//        tune.addPart(keys);
//        tune.addPart(synth);
//        tune.addPart(trumpet);
//        tune.addPart(pipes);
//        tune.addPart(violin);
//        tune.addPart(slap);
        tune.addPart(bDrum);
        
        Play.midi(tune);
        return tune;
    }
    Score runB(){
        treble = new Treble();
        bass = new Bass();
        keys = new Part("Piano", 0, 0);
        synth = new Part("Synth", 38, 1);
        trumpet = new Part("Trumpet", 56, 2);
        pipes = new Part("Pipes", 19, 3);
        violin = new Part("violin", 40, 4);
        slap = new Part("Slap", 36, 5);
        bDrum = new Part("Thump", 36, 9);

        //Part bass = new Part("Bass", 36, 5);
        tune = new Score("music");
        
        
        chordIndex = 0;
        
        treble.play(keys, Cir5TChord[chordIndex], 0.0f, 18, true);
//        treble.play(synth, Cir5TChord[chordIndex], 0.0f, 18, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 0.0f, 18, true);
//        treble.play(pipes, 28, 0.0f, 18, true);
//        treble.play(violin, 52, 0.0f, 18, true);
        bass.play(slap, Cir5BChord[chordIndex], 0.0f, 18, true);
        //drum.play(bDrum, 36, 0.0f, 122, true);
        
        chordIndex = 7;

//        treble.play(keys2, Cir5TChord[chordIndex], 3.6f, 22true);
        treble.play(synth, Cir5TChord[chordIndex], 3.60f, 22, true);
//        treble.play(trumpet, Cir5TChord[chordIndex], 3.60f, 22, true);
        treble.play(pipes, Cir5TChord[chordIndex], 3.60f, 22, true);
//        treble.play(violin2, Cir5ViolinChord[chordIndex], 3.60f, 22, true);
         bass.play(slap, Cir5BChord[chordIndex], 3.6f, 22, true);
         
        chordIndex = 2;
//        treble.play(keys, Cir5TChord[chordIndex], 8.10f, 22, true);
//        treble.play(synth, Cir5TChord[chordIndex], 8.10f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 8.10f, 22, true);
//        treble.play(pipes, Cir5TChord[chordIndex], 57, 8.10f, 22, true);
         treble.play(violin, Cir5ViolinChord[chordIndex], 8.10f, 22, true);
          bass.play(slap, Cir5BChord[chordIndex], 8.1f, 22, true);
        
            chordIndex = 9;
        treble.play(keys, Cir5TChord[chordIndex], 12.6f, 22, true);
        treble.play(synth, Cir5TChord[chordIndex], 12.60f, 22, true);
//        treble.play(trumpet, Cir5TChord[chordIndex], 12.60f, 22, true);
//        treble.play(pipes, Cir5TChord[chordIndex], 12.60f, 22, true);
//        treble.play(violin, Cir5TChord[chordIndex], 12.60f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 12.6f, 22, true);

        chordIndex = 4;
        treble.play(pipes, Cir5TChord[chordIndex], 17.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 17.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 17.1f, 22, true);
        
        chordIndex = 11;
        treble.play(synth, Cir5TChord[chordIndex], 21.60f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 21.60f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 21.6f, 22, true);
        
        chordIndex = 6;
        treble.play(keys, Cir5TChord[chordIndex], 26.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 26.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 26.1f, 22, true);
        
        chordIndex = 1;
        treble.play(pipes, Cir5TChord[chordIndex], 30.6f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 30.60f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 30.6f, 22, true);
        
        chordIndex = 8;
        treble.play(keys, Cir5TChord[chordIndex], 35.10f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 35.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 35.1f, 22, true);
        
        chordIndex = 3; 
        treble.play(keys, Cir5TChord[chordIndex], 39.60f, 22, true);
        treble.play(pipes, Cir5TChord[chordIndex], 39.60f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 39.6f, 22, true);
        
        chordIndex = 10;
        treble.play(synth, Cir5TChord[chordIndex], 44.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 44.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 44.1f, 22, true);
        
        chordIndex = 5;
        treble.play(pipes, Cir5TChord[chordIndex], 45.60f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 45.60f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 45.6f, 22, true);
        
        chordIndex = 0;
        treble.play(pipes, Cir5TChord[chordIndex], 50.1f, 22, true);
        treble.play(synth, Cir5TChord[chordIndex], 50.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 50.1f, 22, true);
        
        
        tune.addPart(keys);
        tune.addPart(synth);
        tune.addPart(trumpet);
        tune.addPart(pipes);
        tune.addPart(violin);
        tune.addPart(slap);
       // tune.addPart(bDrum);

        //keys2.play(Cir5TChord[chordIndex], 0.2f, 22, true);
        Play.midi(tune);
        return tune;
    }
    Score runC(){
        treble = new Treble();
        bass = new Bass();
        keys = new Part("Piano", 0, 0);
        synth = new Part("Synth", 38, 1);
        trumpet = new Part("Trumpet", 56, 2);
        pipes = new Part("Pipes", 19, 3);
        violin = new Part("violin", 40, 4);
        slap = new Part("Slap", 36, 5);
        //bDrum = new Part("Thump", 35, 9);

        //Part bass = new Part("Bass", 36, 5);
        tune = new Score("music");
        
        
        chordIndex = 0;
        
        treble.play(keys, Cir5TChord[chordIndex], 0.0f, 18, true);
//        treble.play(synth, Cir5TChord[chordIndex], 0.0f, 18, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 0.0f, 18, true);
//        treble.play(pipes, 28, 0.0f, 18, true);
//        treble.play(violin, 52, 0.0f, 18, true);
        bass.play(slap, Cir5BChord[chordIndex], 0.0f, 18, true);
       // drum.play(bDrum, 36, 0.0f, 122, true);
        
        chordIndex = 7;

//        treble.play(keys2, Cir5TChord[chordIndex], 3.6f, 22, false);
        treble.play(synth, Cir5TChord[chordIndex], 3.60f, 22, false);
//        treble.play(trumpet, Cir5TChord[chordIndex], 3.60f, 22, false);
        treble.play(pipes, Cir5TChord[chordIndex], 3.60f, 22, false);
//        treble.play(violin2, Cir5ViolinChord[chordIndex], 3.60f, 22, false);
         bass.play(slap, Cir5BChord[chordIndex], 3.6f, 22, false);
         
        chordIndex = 2;
//        treble.play(keys, Cir5TChord[chordIndex], 8.10f, 22, true);
//        treble.play(synth, Cir5TChord[chordIndex], 8.10f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 8.10f, 22, true);
//        treble.play(pipes, Cir5TChord[chordIndex], 57, 8.10f, 22, true);
         treble.play(violin, Cir5ViolinChord[chordIndex], 8.10f, 22, true);
          bass.play(slap, Cir5BChord[chordIndex], 8.1f, 22, true);
        
            chordIndex = 9;
        treble.play(keys, Cir5TChord[chordIndex], 12.6f, 22, false);
        treble.play(synth, Cir5TChord[chordIndex], 12.60f, 22, false);
//        treble.play(trumpet, Cir5TChord[chordIndex], 12.60f, 22, false);
//        treble.play(pipes, Cir5TChord[chordIndex], 12.60f, 22, false);
//        treble.play(violin, Cir5TChord[chordIndex], 12.60f, 22, false);
        bass.play(slap, Cir5BChord[chordIndex], 12.6f, 22, false);

        chordIndex = 4;
        treble.play(pipes, Cir5TChord[chordIndex], 17.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 17.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 17.1f, 22, true);
        
        chordIndex = 11;
        treble.play(synth, Cir5TChord[chordIndex], 21.60f, 22, false);
        treble.play(trumpet, Cir5TChord[chordIndex], 21.60f, 22, false);
        bass.play(slap, Cir5BChord[chordIndex], 21.6f, 22, false);
        
        chordIndex = 6;
        treble.play(keys, Cir5TChord[chordIndex], 26.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 26.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 26.1f, 22, true);
        
        chordIndex = 1;
        treble.play(pipes, Cir5TChord[chordIndex], 30.6f, 22, false);
        treble.play(violin, Cir5ViolinChord[chordIndex], 30.60f, 22, false);
        bass.play(slap, Cir5BChord[chordIndex], 30.6f, 22, false);
        
        chordIndex = 8;
        treble.play(keys, Cir5TChord[chordIndex], 35.10f, 22, true);
        treble.play(trumpet, Cir5TChord[chordIndex], 35.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 35.1f, 22, true);
        
        chordIndex = 3; 
        treble.play(keys, Cir5TChord[chordIndex], 39.60f, 22, false);
        treble.play(pipes, Cir5TChord[chordIndex], 39.60f, 22, false);
        bass.play(slap, Cir5BChord[chordIndex], 39.6f, 22, false);
        
        chordIndex = 10;
        treble.play(synth, Cir5TChord[chordIndex], 44.10f, 22, true);
        treble.play(violin, Cir5ViolinChord[chordIndex], 44.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 44.1f, 22, true);
        
        chordIndex = 5;
        treble.play(pipes, Cir5TChord[chordIndex], 45.60f, 22, false);
        treble.play(trumpet, Cir5TChord[chordIndex], 45.60f, 22, false);
        bass.play(slap, Cir5BChord[chordIndex], 45.6f, 22, false);
        
        chordIndex = 0;
        treble.play(pipes, Cir5TChord[chordIndex], 50.1f, 22, true);
        treble.play(synth, Cir5TChord[chordIndex], 50.10f, 22, true);
        bass.play(slap, Cir5BChord[chordIndex], 50.1f, 22, true);
        
        
        tune.addPart(keys);
        tune.addPart(synth);
        tune.addPart(trumpet);
        tune.addPart(pipes);
        tune.addPart(violin);
        tune.addPart(slap);
      //  tune.addPart(bDrum);


        //keys2.play(Cir5TChord[chordIndex], 0.2f, 22, true);
        Play.midi(tune);
        return tune;
    }
    
    
}
