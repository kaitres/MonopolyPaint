/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmomopoli1807;

import entes.Juego;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author IP-ROUTE
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private AnchorPane inicio;
    
    
    
    @FXML
    private void comenzar(ActionEvent event) throws IOException{
        Elmomopoli1807.juego = new Juego();
        SceneHandler.CargarVista(inicio, getClass().getResource("JugadoresFXML.fxml"));
    }
    @FXML
    private void cerrar(ActionEvent event) {
        Platform.exit();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}


    

