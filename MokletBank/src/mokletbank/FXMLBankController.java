/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mokletBank;

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

/**
 * FXML Controller class
 *
 * @author Kandos
 */
public class FXMLBankController implements Initializable {
     String pin = "";
    String PIN = "12345";
    int kesempatan = 3;
    int tmp;

    @FXML
    private JFXPasswordField editpin;
    @FXML
    private JFXButton btn1;
    @FXML
    private JFXButton btn2;
    @FXML
    private JFXButton btn3;
    @FXML
    private JFXButton btn4;
    @FXML
    private JFXButton btn5;
    @FXML
    private JFXButton btn6;
    @FXML
    private JFXButton btn7;
    @FXML
    private JFXButton btn8;
    @FXML
    private JFXButton btn9;
    @FXML
    private JFXButton btnc;
    @FXML
    private JFXButton btn0;
    @FXML
    private JFXButton btnok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void klik1(ActionEvent event) {
        pin += "1";
        editpin.setText(pin);
    }

    @FXML
    private void klik2(ActionEvent event) {
        pin += "2";
        editpin.setText(pin);
    }

    @FXML
    private void klik3(ActionEvent event) {
        pin += "3";
        editpin.setText(pin);
    }

    @FXML
    private void klik4(ActionEvent event) {
        pin += "4";
        editpin.setText(pin);
    }

    @FXML
    private void klik5(ActionEvent event) {
        pin += "5";
        editpin.setText(pin);
    }

    @FXML
    private void klik6(ActionEvent event) {
        pin += "6";
        editpin.setText(pin);
    }

    @FXML
    private void klik7(ActionEvent event) {
        pin += "7";
        editpin.setText(pin);
    }

    @FXML
    private void klik8(ActionEvent event) {
         pin += "8";
         editpin.setText(pin);
    }

    @FXML
    private void klik9(ActionEvent event) {
        pin += "9";
        editpin.setText(pin);
    }

    @FXML
    private void clear(ActionEvent event) {
        editpin.setText("");
    }

    @FXML
    private void klik0(ActionEvent event) {
        pin += "0";
        editpin.setText(pin);
    }

    @FXML
    private void ok(ActionEvent event) {
        if(pin.equalsIgnoreCase(pin) && pin.equalsIgnoreCase(pin)){
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLNominal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("MokletBank");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
    
}
