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
public class ArcaComunal extends Casilla{
    public static int getSuerte(){
        return (int) (Math.random() * 7);
    }

    public ArcaComunal(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }
}
