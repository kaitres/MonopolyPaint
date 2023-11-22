/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmomopoli1807;

import entes.Juego;
import entes.Jugador;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author IP-ROUTE
 */
public class JugadoresFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private AnchorPane sceneJugadores;
    
    @FXML
    private Pane anchorJugador1;
    @FXML
    private Pane anchorJugador2;
    @FXML
    private Pane anchorJugador3;
    @FXML
    private Pane anchorJugador4;
    
    @FXML
    private Button butonListo;
    
    @FXML
    private TextField nomJug1;
    @FXML
    private TextField nomJug2;
    @FXML
    private TextField nomJug3;
    @FXML
    private TextField nomJug4;
    
    @FXML
    private void dosJugadores(ActionEvent event){
        
        anchorJugador1.setVisible(true);
        anchorJugador2.setVisible(true);
        
        anchorJugador3.setVisible(false);
        anchorJugador4.setVisible(false);
        
        butonListo.setVisible(true);
    }
    @FXML
    private void tresJugadores(ActionEvent event){
        anchorJugador1.setVisible(true);
        anchorJugador2.setVisible(true);
        anchorJugador3.setVisible(true);
        
        anchorJugador4.setVisible(false);
        
        butonListo.setVisible(true);
        
    }
    @FXML
    private void cuatroJugadores(ActionEvent event){
        anchorJugador1.setVisible(true);
        anchorJugador2.setVisible(true);
        anchorJugador3.setVisible(true);
        anchorJugador4.setVisible(true);
        
        butonListo.setVisible(true);
    }
    @FXML
    private void listo(ActionEvent event) {
        int largoNom1= nomJug1.getText().length();
        int largoNom2= nomJug2.getLength();
        int largoNom3= nomJug3.getLength();
        int largoNom4= nomJug4.getLength();
        Alert dialogoAlerta =  new Alert(AlertType.INFORMATION);
        dialogoAlerta.setHeaderText("Compruebe las casillas");
        dialogoAlerta.setTitle("Aviso");
        dialogoAlerta.setContentText("Rellene cada uno de los nombres de jugadores <3");
        dialogoAlerta.initStyle(StageStyle.UTILITY);
        if(anchorJugador1.isVisible() && anchorJugador2.isVisible() && anchorJugador3.isVisible() && anchorJugador4.isVisible()){
            if(largoNom1>0 && largoNom2>0 && largoNom3>0 && largoNom4>0){
                Jugador j1 = new Jugador(nomJug1.getText());
                Jugador j2 = new Jugador(nomJug2.getText());
                Jugador j3 = new Jugador(nomJug3.getText());
                Jugador j4 = new Jugador(nomJug4.getText());
                
                Elmomopoli1807.juego.aniadirJugador(j1);
                Elmomopoli1807.juego.aniadirJugador(j2);
                Elmomopoli1807.juego.aniadirJugador(j3);
                Elmomopoli1807.juego.aniadirJugador(j4);
                
                SceneHandler.CargarVista(sceneJugadores, getClass().getResource("TableroFXML.fxml"));
            }else{
                dialogoAlerta.show();
            }
            
        }else{
            if(anchorJugador1.isVisible() && anchorJugador2.isVisible() && anchorJugador3.isVisible()){
                if(largoNom1>0 && largoNom2>0 && largoNom3>0){
                    Jugador j1 = new Jugador(nomJug1.getText());
                    Jugador j2 = new Jugador(nomJug2.getText());
                    Jugador j3 = new Jugador(nomJug3.getText());
                    
                    Elmomopoli1807.juego.aniadirJugador(j1);
                    Elmomopoli1807.juego.aniadirJugador(j2);
                    Elmomopoli1807.juego.aniadirJugador(j3);
                    
                    SceneHandler.CargarVista(sceneJugadores, getClass().getResource("TableroFXML.fxml"));
                }else{
                    dialogoAlerta.show();
                }
            }else{
                if(anchorJugador1.isVisible() && anchorJugador2.isVisible()){
                    if(largoNom1>0 && largoNom2>0){
                        Jugador j1 = new Jugador(nomJug1.getText());
                        Jugador j2 = new Jugador(nomJug2.getText());
                        
                        Elmomopoli1807.juego.aniadirJugador(j1);
                        Elmomopoli1807.juego.aniadirJugador(j2);
                        
                        SceneHandler.CargarVista(sceneJugadores, getClass().getResource("TableroFXML.fxml"));
                    }else{
                        dialogoAlerta.show();
                    }
                }
                
            }
                        
        }
    }
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
