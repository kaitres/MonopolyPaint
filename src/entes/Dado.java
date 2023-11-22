/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entes;

/**
 *
 * @author IP-ROUTE
 */
public class Dado {
    public static int lanzamiento(){
        return (int) Math.floor(Math.random()*(5)+1);
    }
    public static boolean dobleDado(int x, int y){
        if (x==y) {
            return true;
        }
        return false;
    }
}
