/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import tablero.ArcaComunal;
import tablero.*;



/**
 *
 * @author IP-ROUTE
 */
public class Juego {
    public ArrayList<Jugador> jugadores;
    public static ArrayList<Casilla> tablero;
    public Juego() {
        this.jugadores = new ArrayList<>();
        this.tablero= new ArrayList<>();
        

        
        Carcel carcel = new Carcel(0,7);
        Inicio inicioT = new Inicio(7,7);
        ParadaLibre parada = new ParadaLibre(0,0);
        VeALaCarcel veALaCarcel = new VeALaCarcel(7,0);
        
        Estacion estacion1 = new Estacion("estacion_1", 200, 4, 7);
        Estacion estacion2 = new Estacion("estacion_2", 200, 3, 0);
        
        Servicio servicioAgua = new Servicio("Agua_potable", 200, 7, 4);
        Servicio servicioLuz = new Servicio("Central_electrica", 200, 0, 3);
        
        ArcaComunal arca1 = new ArcaComunal(0,4);
        ArcaComunal arca2 = new ArcaComunal(7,3);
        
        Fortuna fortuna1 = new Fortuna(3,7);
        Fortuna fortuna2 = new Fortuna(4,0);        
        
        Propiedad a = new Propiedad(ColorMonopoli.CAFE , 50, "A", 200, 6, 7, 30, 30);
        Propiedad b = new Propiedad(ColorMonopoli.CAFE , 50, "B", 220, 5, 7, 33, 40);
        
        Propiedad c = new Propiedad(ColorMonopoli.CELESTE , 50, "C", 240, 2, 7, 35, 40);
        Propiedad d = new Propiedad(ColorMonopoli.CELESTE , 50, "D", 260, 1, 7, 38, 50);
        
        Propiedad e = new Propiedad(ColorMonopoli.ROSA , 100, "E", 300, 0, 6, 40, 70);
        Propiedad f = new Propiedad(ColorMonopoli.ROSA , 100, "F", 320, 0, 5, 43, 80);
        
        Propiedad g = new Propiedad(ColorMonopoli.NARANJO , 100, "G", 340, 0, 2, 45, 80);
        Propiedad h = new Propiedad(ColorMonopoli.NARANJO , 100, "H", 360, 0, 1, 48, 90);
        
        Propiedad i = new Propiedad(ColorMonopoli.ROJO , 150, "I", 400, 1, 0, 50, 120);
        Propiedad j = new Propiedad(ColorMonopoli.ROJO , 150, "J", 420, 2, 0, 53, 130);
        
        Propiedad k = new Propiedad(ColorMonopoli.AMARILLO , 150, "K", 440, 5, 0, 55, 130);
        Propiedad l = new Propiedad(ColorMonopoli.AMARILLO , 150, "L", 460, 6, 0, 58, 140);
        
        Propiedad m = new Propiedad(ColorMonopoli.VERDE , 200, "M", 500, 7, 1, 60, 170);
        Propiedad n = new Propiedad(ColorMonopoli.VERDE , 200, "N", 520, 7, 2, 63, 180);
        
        Propiedad nie = new Propiedad(ColorMonopoli.AZUL , 200, "NIE", 540, 7, 5, 68, 190);
        Propiedad o = new Propiedad(ColorMonopoli.AZUL , 200, "O", 600, 7, 6, 80, 200);
        
        
        
        this.tablero.add(inicioT);
        this.tablero.add(a);
        this.tablero.add(b);
        this.tablero.add(estacion1);
        this.tablero.add(fortuna1);
        this.tablero.add(c);
        this.tablero.add(d);
        this.tablero.add(carcel);
        this.tablero.add(e);
        this.tablero.add(f);
        this.tablero.add(arca1);
        this.tablero.add(servicioLuz);
        this.tablero.add(g);
        this.tablero.add(h);
        this.tablero.add(parada);
        this.tablero.add(i);
        this.tablero.add(j);
        this.tablero.add(estacion2);
        this.tablero.add(fortuna2);
        this.tablero.add(k);
        this.tablero.add(l);
        this.tablero.add(veALaCarcel);
        this.tablero.add(m);
        this.tablero.add(n);
        this.tablero.add(arca2);
        this.tablero.add(servicioAgua);
        this.tablero.add(nie);
        this.tablero.add(o);
        
        
    }
    
    public void aniadirJugador( Jugador jugador){
        this.jugadores.add(jugador);
    }
    public void aleatorizarJugadores(){
        ArrayList<Jugador> random = new ArrayList<>();  
        int cantidadDejugadores = this.jugadores.size();
        int valorDado;
        int i =0;
        
        while(i <= cantidadDejugadores-2) {
            valorDado = (int) Math.floor(Math.random()*(this.jugadores.size()));          
            random.add(this.jugadores.get(valorDado));
            this.jugadores.remove(valorDado);
            i+=1;
        }
        random.add(this.jugadores.get(0));
        this.jugadores=random;
    }
}
