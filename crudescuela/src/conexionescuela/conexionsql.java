/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionescuela;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
;
        
        

/**
 *
 * @author usuario
 */
public class conexionsql {
    //para hacer la conexion
    
     Connection conexion=null;
     
     public Connection conexion(){
         
        //para  capturar errores
        
         try {
                Class.forName("com.mysql.jdbc.Driver");//url
                conexion=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/bd_escuela","root","");      
                JOptionPane.showMessageDialog(null,"conexion exitosa");
                
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"conexion erronea"+ e.getMessage());

        }  
         return conexion;
     }



}
