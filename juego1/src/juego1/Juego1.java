/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax .swing.JFrame;
public class Juego1  extends JPanel{  
   //metodo para crear las cuadriculas del laberinto;
    
    labrerinto  laberinto=new labrerinto();
    personaje   PERSONAJE=new personaje();
    
    
     @Override
     public void paint (Graphics pintor){
        // estas lienas integran el laberinto y el personaje ala grafica
      laberinto.paint(pintor);
      PERSONAJE.paint(pintor);
     }   
       public Juego1(){ 
    // el siguente metodo sirve para hacer acciones  de movimiento con el teclado
    addKeyListener( new KeyListener (){
        @Override
        public void keyTyped(KeyEvent e) {
        
        }

        @Override
        public void keyPressed(KeyEvent e) {
        
        }

        @Override
        public void keyReleased(KeyEvent e) { 
            PERSONAJE.tecla(e);
        
        }
    });
     setFocusable(true);
   {
  }
}
       
    public static void main(String[] args) {
        // TODO code application logic here
        //lineas para craear ventana
       JFrame ventana= new JFrame ("laberinto");
       Juego1 juego=new Juego1();
       ventana.add(juego);
       
       /// lineas para dar tamaño visibilidad y posicion
        ventana.setVisible(true);
        ventana.setSize(900,540);
        ventana.setLocation(300,200);
        ventana.setLocationRelativeTo(null);
        
       while(true){
           
           try {
               Thread.sleep(10);// esta linea genera los retrasos del tiempo
           } catch (InterruptedException ex) {
               Logger.getLogger(Juego1.class.getName()).log(Level.SEVERE, null, ex);
           } ventana.repaint();// esta linea muestra graficamnete el movimiento
       }
    }
    
}
