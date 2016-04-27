/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaDeContatos.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author freeman
 */
public class AgendaController implements Initializable {
    
    @FXML 
    private Button alterar;
    
    @FXML
    private void handleBtnAlterar(ActionEvent ac) throws IOException {
        Stage stage;
        Parent root;
        
        //get reference to the button's stage         
        stage = (Stage) alterar.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("AgendaDeContatos/view/AlterarView.fxml"));
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
