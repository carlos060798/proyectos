
package juego1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
public class personaje{  
    labrerinto  lab=new labrerinto();
    //medidas del personaje
     private int x=40;
     private int y=40;
     private final int ancho=40;
     private final int alto=40;
     private final int movimiento=40;
    
            

    public void paint(Graphics pintor) {
        //lienas para crara ovalos pintados
        pintor.setColor(Color.red); // para dibujar el fondo
        pintor.fillOval(x, y, ancho, alto);
        pintor.setColor(Color.black);
        pintor.drawOval(x, y, ancho, alto); //para pintar el contorno

    }

    public void tecla(KeyEvent evento) {// este metodo es para programar el movimiento de la bolita por el laberinto con las teclas de direccion
        int[][] laberinto = lab.obtenerlaberinto();//se declara este nuevo objeto laberinto para blñoquear el movimiento por las celdas coloriadas
        if (evento.getKeyCode() == 37) {// esta liena programa el movimiento de la tecla izquiereda 
            if (laberinto[y / 40][x / 40 - 1] != 1) { // esta linea es para que cadavez que el usario oprima la tecla el circulo no se mueva por los bloque pintados
                x = x - movimiento;
            }
        }
        if (evento.getKeyCode() == 39) {// esta liena programa el movimiento de la tecla derecha 
            if (laberinto[y / 40][x / 40 + 1] != 1) {// lo mismo de bloqueo de cuadritos de arriba
                x = x + movimiento;
            }
        }
        if (evento.getKeyCode() == 40) {// esta liena programa el movimiento de la tecla abajo
            if (laberinto[(y / 40 + 1)][x / 40] != 1) {
                y = y + movimiento;
            }
        }
        if (evento.getKeyCode() == 38) {// esta liena programa el movimiento de la tecla arriba
            if (laberinto[(y / 40 - 1)][x / 40] != 1) {
                y = y - movimiento;
            }
        }
    }
}



