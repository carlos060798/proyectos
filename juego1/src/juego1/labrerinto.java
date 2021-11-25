/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author usuario
 */
public class labrerinto {
     private int columna=0;
      private int fila=0;
       private int Ncolumna=23;
      private int Nfila=13; 
       private int Balto=40;
      private int Bancho=40;
    
     public void paint (Graphics pintor){ 
          int [][]laberinto=obtenerlaberinto();
         // estos ciclos recorren la matriz
         for (fila = 0; fila < Nfila; fila++) {
             for (columna = 0; columna < Ncolumna; columna++) {
                 // los 1 representan muros los 0 espacios vacios el siguiente ciclo for pregunta cada esácio de la matriz y si es 1  su valor pinta y si es cero no
           if (laberinto[fila][columna] == 1) {
               pintor.setColor(Color.blue);
               pintor.fillRect(columna * 40, fila * 40, Bancho, Balto);
               pintor.setColor(Color.black);
               pintor.drawRect(columna * 40, fila * 40, Bancho, Balto);
           }
        }     
      }
   }
      //metodo que crea el laberinto  medinate una matris
    public int[][] obtenerlaberinto() {
       int laberinto[][]=
     {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
     { 1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1},
     { 1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1},
     { 1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1},
     { 1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,1},
     { 1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1},
     { 1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
     { 1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1},
     { 1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1},
     { 1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1},
     { 1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1},
     { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
     { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

         return laberinto; 
    }
         
   } 
   

         
            
