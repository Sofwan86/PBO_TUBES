/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.main;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import tubes.database.tubesdatabase;
import tubes.entity.paket;
import tubes.error.tubesEx;
import tubes.service.tubesdao;
import tubes.view.MainView;

/**
 *
 * @author HP
 */
public class utama {
    
    
    public static void main(String[] args) throws SQLException, tubesEx {
       
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               try {
                   MainView Paket = new MainView();
                   Paket.loadDatabase();
                   Paket.setVisible(true);
               } catch (SQLException e) {
               } catch (tubesEx ex) {
                 Logger.getLogger(utama.class.getName()).log(Level.SEVERE, null, ex);
               }
               
           }
       });
        
        
       
        
    }
}

    
