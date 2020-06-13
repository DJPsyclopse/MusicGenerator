/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switcherexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import jm.music.data.Part;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Read;
import jm.util.Write;

/**
 * FXML Controller class
 *
 * @author Derik Psyclopse Yeager
 */
public class BController extends Switchable implements Initializable {
 private static int[] tChord = {40, 42, 44, 45, 47, 49, 50};
    private static int[] bChord = {28, 30, 32, 33, 23, 25, 26};
    private static int[] violinChord = {52, 54, 56, 45, 47, 49, 50};
    private static int[] Cir5TChord = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private static int[] Cir5BChord = {28, 29, 30, 31, 32, 33, 34, 23, 24, 25, 26, 27};
    private static int[] Cir5ViolinChord = {52, 53, 54, 55, 56, 45, 46, 47, 48, 49, 50, 51};
    private static boolean[] maj = {true, false, false, true, true, false, false};
    private static int chordIndex;
    private Treble treble;
    private Bass bass;
    private Part keys, synth, trumpet, pipes, violin, slap;
    private Score tune;
    
    @FXML
    private TextField bText; 
    
    @FXML
    private TextField loadField;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             MusicModel modelB = new MusicModel();
        tune = modelB.runB();
     
    }
    
    @FXML
    private void handleGoToA(ActionEvent event) {
        Switchable.switchTo("A");
    }
    
    @FXML
    private void handleGoToC(ActionEvent event) {   
        Switchable.switchTo("C");
    }
    
    @FXML
    private void handleText(ActionEvent event) {
        System.out.println("function is called");
        Write.midi(tune, bText.getText());
    }
    

 @FXML
    private void handleLoad(ActionEvent event){
        Read.midi(tune, loadField.getText());
        Play.midi(tune);
}
          
    }


