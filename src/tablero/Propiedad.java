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
public class Propiedad extends Terreno{
    public int valorHipoteca;
    public boolean estadoHipotecado;
    public ColorMonopoli color;
    public final int precioDeCasaCompra;
    public int cantidadDeCasa;
    public final int precioDeCasaVenta;
    public int renta;
    public int rentaConCasa;
    
    public Propiedad(ColorMonopoli color, int precioDeCasaCompra, String nombre, int precio, int x, int y, int renta, int rentaConCasa) {
        super(nombre, precio, x, y);
        this.valorHipoteca = precio/2;
        this.estadoHipotecado = false;
        this.color = color;
        this.precioDeCasaCompra = precioDeCasaCompra;
        this.cantidadDeCasa = 0;
        this.precioDeCasaVenta = precioDeCasaCompra/2;
        this.renta = renta;
        this.rentaConCasa = rentaConCasa;
    }

    

    
    
}
