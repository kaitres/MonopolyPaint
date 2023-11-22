/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elmomopoli1807;

import entes.Dado;
import entes.Jugador;
import entes.MyIcon;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author IP-ROUTE
 */
public class TableroFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Label labelJug1;
    @FXML
    private Label labelJug2;
    @FXML
    private Label labelJug3;
    @FXML
    private Label labelJug4;
    
    @FXML
    private Label labelDin1;
    @FXML
    private Label labelDin2;
    @FXML
    private Label labelDin3;
    @FXML
    private Label labelDin4;
    
    @FXML
    private Pane panelJug1;
    @FXML
    private Pane panelJug2;
    @FXML
    private Pane panelJug3;
    @FXML
    private Pane panelJug4;
    @FXML
    private Button butonComenzar;
    
    @FXML
    private void comenzarPartida(ActionEvent event) {
        butonComenzar.setVisible(false);
        boolean partida = true;
        String[] options = {"Lanzar dados"};
        while(partida){
            for(Jugador jugador : Elmomopoli1807.juego.jugadores) {
                Object seleccion = primeraInteraccion(jugador.nombre, options);

                if("0".equals(seleccion.toString())){
                    
                    int dado1= Dado.lanzamiento();
                    int dado2= Dado.lanzamiento();
                    Object seleccion1 = resultadoLanzamientoDeDados(dado1, dado2);
                      
                }
            }
            
            
        }
        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarJugadores();
        
        
            
            
            
            
            
            /**Object seleccion = JOptionPane.showInputDialog(
            null,
            "Seleccione opcion",
            "Selector de opciones",
            JOptionPane.QUESTION_MESSAGE,
            null,  // null para icono defecto
            new Object[] { "opcion 1", "opcion 2", "opcion 3" }, 
            "opcion 1");
            **/
            


        
        // TODO
    }    
    public Object primeraInteraccion(String x, String[] y){
        return JOptionPane.showOptionDialog(null, 
                "Turno de: "+x,
                "tutilo", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, y, "opcion 1");
    }
    public Object resultadoLanzamientoDeDados(int x, int y){
        String z;
        if (!Dado.dobleDado(x, y)) {
            z= "Ha salido "+x+" en el 1er dado"
                    +System.getProperty("line.separator")
                +"Ha salido "+y+" en el 2do dado";
        }else{
            z= "Ha salido "+x+" en el 1er dado"
                    +System.getProperty("line.separator")
                +"Ha salido "+y+" en el 2do dado"
                    +System.getProperty("line.separator")
                +"Dados dobles";
        }
        return JOptionPane.showConfirmDialog(
                null, 
                z,
                "Resultado lanzamiento", JOptionPane.DEFAULT_OPTION);
    }
    public void cargarJugadores(){
        Elmomopoli1807.juego.aleatorizarJugadores();
        labelJug1.setText(Elmomopoli1807.juego.jugadores.get(0).nombre);
        labelJug2.setText(Elmomopoli1807.juego.jugadores.get(1).nombre);
        
        labelDin1.setText(""+Elmomopoli1807.juego.jugadores.get(0).dinero);
        labelDin2.setText(""+Elmomopoli1807.juego.jugadores.get(1).dinero);
        
        
        
        if(Elmomopoli1807.juego.jugadores.size()>2){
            labelJug3.setText(Elmomopoli1807.juego.jugadores.get(2).nombre);
        
            labelDin3.setText(""+Elmomopoli1807.juego.jugadores.get(2).dinero);
            
            if (Elmomopoli1807.juego.jugadores.size()>3) {
                labelJug4.setText(Elmomopoli1807.juego.jugadores.get(3).nombre);
        
                labelDin4.setText(""+Elmomopoli1807.juego.jugadores.get(3).dinero);
            
            }else{
                panelJug4.setVisible(false);
            }
        }else{
            panelJug3.setVisible(false);
            panelJug4.setVisible(false);
        }
    }
}