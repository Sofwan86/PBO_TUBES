/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.model;

import java.sql.SQLDataException;
import java.sql.SQLException;
import tubes.database.tubesdatabase;
import tubes.entity.paket;
import tubes.error.tubesEx;
import tubes.event.paketlisten;
import tubes.service.tubesdao;


/**
 *
 * @author HP
 */
public class paketModel {
    private int no_resi;
    private String nama_pengirim;
    private String telepon_pengirim;
    private String alamat_pengirim;
    private String nama_paket;
    private int berat_paket;
    private String nama_penerima;
    private String telepon_penerima;
    private String alamat_penerima;
    
    private paketlisten listener;

    public paketlisten getListener() {
        return listener;
    }

    public void setListener(paketlisten listener) {
        this.listener = listener;
    }
    
    

    public int getNo_resi() {
        return no_resi;
    }

    public void setNo_resi(int no_resi) {
        this.no_resi = no_resi;
        fireOnChange();
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
         fireOnChange();
    }

    public String getTelepon_pengirim() {
        return telepon_pengirim;
    }

    public void setTelepon_pengirim(String telepon_pengirim) {
        this.telepon_pengirim = telepon_pengirim;
         fireOnChange();
    }

    public String getAlamat_pengirim() {
        return alamat_pengirim;
    }

    public void setAlamat_pengirim(String alamat_pengirim) {
        this.alamat_pengirim = alamat_pengirim;
         fireOnChange();
    }

    public String getNama_paket() {
        return nama_paket;
    }

    public void setNama_paket(String nama_paket) {
        this.nama_paket = nama_paket;
         fireOnChange();
    }

    public int getBerat_paket() {
        return berat_paket;
    }

    public void setBerat_paket(int berat_paket) {
        this.berat_paket = berat_paket;
         fireOnChange();
    }

    public String getNama_penerima() {
        return nama_penerima;
    }

    public void setNama_penerima(String nama_penerima) {
        this.nama_penerima = nama_penerima;
         fireOnChange();
    }

    public String getTelepon_penerima() {
        return telepon_penerima;
    }

    public void setTelepon_penerima(String telepon_penerima) {
        this.telepon_penerima = telepon_penerima;
         fireOnChange();
    }

    public String getAlamat_penerima() {
        return alamat_penerima;
    }

    public void setAlamat_penerima(String alamaat_penerima) {
        this.alamat_penerima = alamaat_penerima;
         fireOnChange();
    }
    
    protected void fireOnChange(){
        if(listener!=null){
            listener.onChange(this);
        }
    }
    
    protected void fireOnInsert(paket pakett){
        if(listener!=null){
            listener.onInsert(pakett);
        }
    }
    
     protected void fireOnUpdate(paket pakett){
        if(listener!=null){
            listener.onUpdate(pakett);
        }
    }
     
      protected void fireOnDelete(){
        if(listener!=null){
            listener.onDelete();
        }
    }
      
    /**
     *
     */
    public void insertpaket() throws SQLDataException,tubesEx, SQLException{
          
        tubesdao dao = tubesdatabase.gettubesdao();
        paket pakett = new paket();
        pakett.setNama_pengirim(nama_pengirim);
        pakett.setTelepon_pengirim(telepon_pengirim);
        pakett.setAlamat_pengirim(alamat_pengirim);
        pakett.setNama_paket(nama_paket);
        pakett.setBerat_paket(berat_paket);
        pakett.setNama_penerima(nama_penerima);
        pakett.setTelepon_penerima(telepon_penerima);
        pakett.setAlamat_penerima(alamat_penerima);
        
        dao.insertpaket(pakett);
        fireOnInsert(pakett);
      }
    
     public void updatepaket() throws SQLDataException,tubesEx, SQLException{
          
        tubesdao dao = tubesdatabase.gettubesdao();
        paket pakett = new paket();
        pakett.setNama_pengirim(nama_pengirim);
        pakett.setTelepon_pengirim(telepon_pengirim);
        pakett.setAlamat_pengirim(alamat_pengirim);
        pakett.setNama_paket(nama_paket);
        pakett.setBerat_paket(berat_paket);
        pakett.setNama_penerima(nama_penerima);
        pakett.setTelepon_penerima(telepon_penerima);
        pakett.setAlamat_penerima(alamat_penerima);
        pakett.setNo_resi(no_resi);
        
        dao.uppdatepaket(pakett);
        fireOnUpdate(pakett);
      }
     
      public void deletepaket() throws SQLDataException,tubesEx, SQLException{
          
        tubesdao dao = tubesdatabase.gettubesdao();
        
        dao.deletepaket(no_resi);
        fireOnDelete();
      }
      
      public void resetpaket(){
          setNo_resi(0);
          setNama_pengirim("");
          setTelepon_pengirim("");
          setAlamat_pengirim("");
          setNama_paket("");
          setBerat_paket(0);
          setNama_penerima("");
          setTelepon_penerima("");
          setNama_penerima("");
          setAlamat_penerima("");
          
      }
    
}
