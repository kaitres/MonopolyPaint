/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import entes.Jugador;

/**
 *
 * @author IP-ROUTE
 */
public abstract class Terreno extends Casilla{
    public String nombre;
    public int precio;
    public Jugador duenio;

    public Terreno(String nombre, int precio , int x, int y) {
        super(x, y);
        this.nombre = nombre;
        this.precio = precio;
        
    }
    public void Comprar(Jugador duenio){
        this.duenio=duenio;
    }
}
