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
import javafx.scene.control.Alert;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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
public class AController extends Switchable implements Initializable {
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
    public TextField textField;
    @FXML
    private TextField loadField;
//    @FXML
//    private MenuBar about;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MusicModel modelA = new MusicModel();
        tune = modelA.runA();  
    }
    
    @FXML
    private void handleGoToB(ActionEvent event) {
         Switchable.switchTo("B");
    }
    
    @FXML
    private void handleGoToC(ActionEvent event) {
         Switchable.switchTo("C");

    }
    
    @FXML
    private void handleText(ActionEvent event) {
        System.out.println("function is called");
        Write.midi(tune, textField.getText());

    }
    
    @FXML
    private void handleLoad(ActionEvent event){
        Read.midi(tune, loadField.getText());
        Play.midi(tune);
}
    @FXML
   private void handleAbout(ActionEvent event){
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("About Dialog");
                alert.setHeaderText("About Dialog");
                alert.setContentText("This is a program which randomly generates music. It does so by three pardigms. The first sets the chord progrssion as"
                        + " beginning at the root of the key and progressing randomly for a certain number of chords until it is assigned the major fifth chord after which"
                        + " it progresses back to the root. The second paradigm cycles through every key in the diatonic scale by the circle of fifths.  The third paradigm"
                        + " cycles through the circle of fifths as well but alternates major and minor chords.");

                alert.showAndWait();
}
    }

   

