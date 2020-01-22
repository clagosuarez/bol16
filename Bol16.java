/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bol16;

/**
 *
 * @author clagosuarez
 */
public class Bol16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPodeCantar persoa = new Persoa(){};
        IPodeCantar canario = new Canario(){};
        IPodeCantar galo = new Galo(){};
        IPodeCantar tenor = new Tenor(){};
        persoa.cantar();
        canario.cantar();
        galo.cantar();
        tenor.cantar();
    }

}
