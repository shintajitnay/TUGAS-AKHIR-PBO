/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dapurkos;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginController implements Initializable {
    @FXML
    private Label coba;
    
    @FXML
    private JFXButton btnmasuk;
      @FXML
    private JFXTextField idUsername;

    @FXML
    private JFXTextField idPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prosesmasuk(ActionEvent event) {
        String username = "shinta";
        String password = "jitny";
        
       if (idUsername.getText().equals("") || idPassword.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Lengkapi data yang terisi");
       }
       else if(!(idUsername.getText().equals(username)) || !(idPassword.getText().equals(password))){
           JOptionPane.showMessageDialog(null, "Masukkan data yang benar");
       }
       else if (idUsername.getText().equals(username) || idPassword.getText().equals(password)){
       try {
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("hal1.fxml"));
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
    
}
