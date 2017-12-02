/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapurkos;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import static java.lang.String.valueOf;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Hal3Controller implements Initializable {

    @FXML
    private TextField harga1;
    @FXML
    private TextField harga2;
    @FXML
    private TextField harga3;
    @FXML
    private TextField harga4;
    @FXML
    private TextField harga5;
    @FXML
    private TextField harga6;
    @FXML
    private TextField harga7;
    @FXML
    private TextField harga8;
    @FXML
    private TextField total;
    @FXML
    private JFXButton harga;
    @FXML
    private JFXButton subtotal;
    @FXML
    private JFXButton kembali;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prosesharga(ActionEvent event) {
        int Harga1=4000,Harga2=1000,Harga3=1000,Harga4=2000,Harga5=2000,Harga6=5000,Harga7=3000,Harga8=2000;
        harga1.setText(valueOf(Harga1));
        harga2.setText(valueOf(Harga2));
        harga3.setText(valueOf(Harga3));
        harga4.setText(valueOf(Harga4));
        harga5.setText(valueOf(Harga5));
        harga6.setText(valueOf(Harga6));
        harga7.setText(valueOf(Harga7));
        harga8.setText(valueOf(Harga8));
    }

    @FXML
    private void prosestotal(ActionEvent event) {
        int sub,Harga1=4000,Harga2=1000,Harga3=1000,Harga4=2000,Harga5=2000,Harga6=5000,Harga7=3000,Harga8=2000;
        
        sub = Harga1+Harga2+Harga3+Harga4+Harga5+Harga6+Harga7+Harga8;
         total.setText(valueOf(sub));
        
    }
    
    @FXML
       void proseskembali(ActionEvent event) {
        try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("hal2.fxml"));
            Scene scene;
           scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dapur Kos");
            stage.show();    
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
    }


    
}
