/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.service;

import java.util.List;
import tubes.entity.paket;
import tubes.error.tubesEx;

/**
 *
 * @author HP
 */
public interface tubesdao {
    
    public void insertpaket(paket pakett )throws tubesEx;
    public void uppdatepaket(paket pakett )throws tubesEx;
    public void deletepaket(Integer no_resi )throws tubesEx;
    public paket getpaket(Integer no_resi )throws tubesEx;
    public List<paket> selectAllpaket() throws tubesEx; 
}
