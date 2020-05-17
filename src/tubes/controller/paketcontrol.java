/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.controller;

import javax.swing.JOptionPane;
import tubes.model.paketModel;

import tubes.view.paketpanel;

/**
 *
 * @author HP
 */
public class paketcontrol {
    
    private paketModel model;

    public void setModel(paketModel model) {
        this.model = model;
    }
    
    public void resetpaket(paketpanel view){
        
        model.resetpaket();
    }
    
    public void insertpaket(paketpanel view){
        
        String nama_pengirim = view.getTxtnapm().getText();
        String telepon_pengirim = view.getTxttlpm().getText();
        String alamat_pengirim = view.getTxtalpm().getText();
        String nama_paket = view.getTxtnapt().getText();
        Integer berat_paket = Integer.parseInt(view.getTxtbept().getText());
        String nama_penerima = view.getTxtnapa().getText();
        String telepon_penerima= view.getTxtxtlpa().getText();
        String alamat_penerima = view.getTxtalpa().getText();
        
        if(nama_pengirim.trim().equals("") || nama_paket.trim().equals("") || nama_penerima.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kososng");
        }else if(nama_pengirim.length()>255 || nama_paket.length()>255 || nama_penerima.length()>255){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
        }else if(telepon_pengirim.length()>12 || telepon_penerima.length()>12){
            JOptionPane.showMessageDialog(view, "Telepon tidak boleh lebih dari 12 digit");
        }else{
            model.setNama_pengirim(nama_pengirim);
            model.setTelepon_pengirim(telepon_pengirim);
            model.setAlamat_pengirim(alamat_pengirim);
            model.setNama_paket(nama_paket);
            model.setBerat_paket(berat_paket);
            model.setNama_penerima(nama_penerima);
            model.setTelepon_penerima(telepon_penerima);
            model.setAlamat_penerima(alamat_penerima);
            
            try {
                model.insertpaket();
                JOptionPane.showMessageDialog(view, "Data paket berhasil ditambah");
                model.resetpaket();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[] {"Terjadi Error di database dengan pesan ",throwable.getMessage()});
            }
            
        }
        
    }
    
    public void updatepaket(paketpanel view){
    
        if(view.getTabelpaket().getSelectedColumn()==0){
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang ingin diubah");
            return;
        }
        
        Integer no_resi = Integer.parseInt(view.getTxtnore().getText());
        String nama_pengirim = view.getTxtnapm().getText();
        String telepon_pengirim = view.getTxttlpm().getText();
        String alamat_pengirim = view.getTxtalpm().getText();
        String nama_paket = view.getTxtnapt().getText();
        Integer berat_paket = Integer.parseInt(view.getTxtbept().getText());
        String nama_penerima = view.getTxtnapa().getText();
        String telepon_penerima= view.getTxtxtlpa().getText();
        String alamat_penerima = view.getTxtalpa().getText();
        
        if(nama_pengirim.trim().equals("")&&nama_paket.trim().equals("")&&nama_penerima.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kososng");
        }else if(nama_pengirim.length()>255&&nama_paket.length()>255&&nama_penerima.length()>255){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
        }else if(telepon_pengirim.length()>12&&telepon_penerima.length()>12){
            JOptionPane.showMessageDialog(view, "Telepon tidak boleh lebih dari 12 digit");
        }else{
            model.setNo_resi(no_resi);
            model.setNama_pengirim(nama_pengirim);
            model.setTelepon_pengirim(telepon_pengirim);
            model.setAlamat_pengirim(alamat_pengirim);
            model.setNama_paket(nama_paket);
            model.setBerat_paket(berat_paket);
            model.setNama_penerima(nama_penerima);
            model.setTelepon_penerima(telepon_penerima);
            model.setAlamat_penerima(alamat_penerima);
            
            try {
                model.updatepaket();
                JOptionPane.showMessageDialog(view, "Data paket berhasil diubah");
                model.resetpaket();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[] {"Terjadi Error di database dengan pesan ",throwable.getMessage()});
            }
            
        }
    }
    
    public void deletepaket(paketpanel view){
        
        if(view.getTabelpaket().getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(view, "Silahkan pilih data yang ingin diubah");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(view, "Anda yakin ingin menghapus data ini ?")==JOptionPane.OK_OPTION){
            Integer no_resi = Integer.parseInt(view.getTxtnore().getText());
            model.setNo_resi(no_resi);
            
            try {
                model.deletepaket();
                JOptionPane.showMessageDialog(view, "Data paket berhasil diubah");
                model.resetpaket();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[] {"Terjadi Error di database dengan pesan ",throwable.getMessage()});
            }
        }
    }
    
}
