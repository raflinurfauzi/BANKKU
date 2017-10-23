/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author RAFLI NUR FAUZI P
 */
public class FXMLPinBankController implements Initializable {

    String pin = "";
    String PIN = "0000";
    int kesempatan = 3;
    int tmp;
    
    @FXML
    private JFXButton button1;
    @FXML
    private JFXButton button2;
    @FXML
    private JFXButton button3;
    @FXML
    private JFXButton button4;
    @FXML
    private JFXButton button5;
    @FXML
    private JFXButton button6;
    @FXML
    private JFXButton button7;
    @FXML
    private JFXButton button8;
    @FXML
    private JFXButton button9;
    @FXML
    private JFXButton buttonC;
    @FXML
    private JFXButton button0;
    @FXML
    private JFXButton buttonOK;
    @FXML
    private JFXPasswordField editpin;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    private void tekan2(ActionEvent event) {
     pin += "2";
        editpin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
     pin += "3";
        editpin.setText(pin);}

    @FXML
    private void tekan4(ActionEvent event) {
     pin += "4";
        editpin.setText(pin);}

    @FXML
    private void tekan5(ActionEvent event) {
     pin += "5";
        editpin.setText(pin);}

    @FXML
    private void tekan6(ActionEvent event) {
     pin += "6";
        editpin.setText(pin);}

    @FXML
    private void tekan7(ActionEvent event) {
     pin += "7";
        editpin.setText(pin);}

    @FXML
    private void tekan8(ActionEvent event) {
     pin += "8";
        editpin.setText(pin);}

    @FXML
    private void tekan9(ActionEvent event) {
     pin += "9";
        editpin.setText(pin);}

    @FXML
    private void tekanC(ActionEvent event) {
        pin="";
        editpin.setText(pin);
    }

    @FXML
    private void tekan0(ActionEvent event) {
     pin += "0";
        editpin.setText(pin);
    }

    @FXML
    private void tekanOK(ActionEvent event) {
        if(pin.equals(PIN)){
         try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLMainBank.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Bank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }else{
            kesempatan -=1;
            JOptionPane.showMessageDialog(null,"PIN SALAH \n Tersisa "+kesempatan+"kesempatan lagi");
            editpin.setText("");
            pin="";
            if(kesempatan==0){
                System.exit(0);
            }
            
                  
        
    }}}
    

