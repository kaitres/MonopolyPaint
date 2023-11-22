/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

import java.util.ArrayList;
import tablero.*;

/**
 *
 * @author IP-ROUTE
 */
public class Jugador {
    public String nombre;
    public int posicion;
    public int dinero=1500;
    public ArrayList<Terreno> propiedades;
    public int cantLlavesSalida=0;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.propiedades = new ArrayList<>();
        
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
}
