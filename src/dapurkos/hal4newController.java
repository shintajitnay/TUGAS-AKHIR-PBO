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
public class hal4newController implements Initializable {

    @FXML
    private JFXButton har;
    @FXML
    private TextField har1;
    @FXML
    private TextField har2;
    @FXML
    private TextField har3;
    @FXML
    private TextField har4;
    @FXML
    private TextField har5;
    @FXML
    private TextField har6;
    @FXML
    private TextField har7;
    @FXML
    private TextField har8;
    @FXML
    private TextField tot;
    @FXML
    private JFXButton subtot;
    @FXML
    private JFXButton kemb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proseshar(ActionEvent event) {
         int Harga1=1500,Harga2=2000,Harga3=5000,Harga4=2000,Harga5=2000,Harga6=6000,Harga7=2000,Harga8=4000;
        har1.setText(valueOf(Harga1));
        har2.setText(valueOf(Harga2));
        har3.setText(valueOf(Harga3));
        har4.setText(valueOf(Harga4));
        har5.setText(valueOf(Harga5));
        har6.setText(valueOf(Harga6));
        har7.setText(valueOf(Harga7));
        har8.setText(valueOf(Harga8));
    }

    @FXML
    private void prosestot(ActionEvent event) {
         int sub,Harga1=1500,Harga2=2000,Harga3=5000,Harga4=2000,Harga5=2000,Harga6=6000,Harga7=2000,Harga8=4000;
        
        sub = Harga1+Harga2+Harga3+Harga4+Harga5+Harga6+Harga7+Harga8;
         tot.setText(valueOf(sub));
    }

    @FXML
    private void proseskemb(ActionEvent event) {
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
