/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

/**
 *
 * @author IP-ROUTE
 */
public abstract class Casilla {
    public int posicionX ;
    public int posicionY ;

    public Casilla(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    
}
