/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.event;

import tubes.entity.paket;
import tubes.model.paketModel;

/**
 *
 * @author HP
 */
public interface paketlisten {
    
    public void onChange (paketModel model);
    
    public void onInsert (paket pakett);
    
    public void onDelete ();
    
    public void onUpdate (paket pakett);  

    
    
}
