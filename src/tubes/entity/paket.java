/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.entity;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class paket {
    private Integer no_resi;
    private String nama_pengirim;
    private String telepon_pengirim;
    private String alamat_pengirim;
    private String nama_paket;
    private Integer berat_paket;
    private String nama_penerima;
    private String telepon_penerima;
    private String alamat_penerima;
    
    public paket(){
    }

    public paket(String nama_pengirim, String telepon_pengirim, String alamat_pengirim, String nama_paket, Integer berat_paket, String nama_penerima, String telepon_penerima, String alamat_penerima) {
        this.nama_pengirim = nama_pengirim;
        this.telepon_pengirim = telepon_pengirim;
        this.alamat_pengirim = alamat_pengirim;
        this.nama_paket = nama_paket;
        this.berat_paket = berat_paket;
        this.nama_penerima = nama_penerima;
        this.telepon_penerima = telepon_penerima;
        this.alamat_penerima = alamat_penerima;
    }
    
    

    public Integer getNo_resi() {
        return no_resi;
    }

    public void setNo_resi(Integer no_resi) {
        this.no_resi = no_resi;
    }

    public String getNama_pengirim() {
        return nama_pengirim;
    }

    public void setNama_pengirim(String nama_pengirim) {
        this.nama_pengirim = nama_pengirim;
    }

    public String getTelepon_pengirim() {
        return telepon_pengirim;
    }

    public void setTelepon_pengirim(String telepon_pengirim) {
        this.telepon_pengirim = telepon_pengirim;
    }

    public String getAlamat_pengirim() {
        return alamat_pengirim;
    }

    public void setAlamat_pengirim(String alamat_pengirim) {
        this.alamat_pengirim = alamat_pengirim;
    }

    public String getNama_paket() {
        return nama_paket;
    }

    public void setNama_paket(String nama_paket) {
        this.nama_paket = nama_paket;
    }

    public Integer getBerat_paket() {
        return berat_paket;
    }

    public void setBerat_paket(Integer berat_paket) {
        this.berat_paket = berat_paket;
    }

    public String getNama_penerima() {
        return nama_penerima;
    }

    public void setNama_penerima(String nama_penerima) {
        this.nama_penerima = nama_penerima;
    }

    public String getTelepon_penerima() {
        return telepon_penerima;
    }

    public void setTelepon_penerima(String telepon_penerima) {
        this.telepon_penerima = telepon_penerima;
    }

    public String getAlamat_penerima() {
        return alamat_penerima;
    }

    public void setAlamat_penerima(String alamat_penerima) {
        this.alamat_penerima = alamat_penerima;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.no_resi);
        hash = 73 * hash + Objects.hashCode(this.nama_pengirim);
        hash = 73 * hash + Objects.hashCode(this.telepon_pengirim);
        hash = 73 * hash + Objects.hashCode(this.alamat_pengirim);
        hash = 73 * hash + Objects.hashCode(this.nama_paket);
        hash = 73 * hash + Objects.hashCode(this.berat_paket);
        hash = 73 * hash + Objects.hashCode(this.nama_penerima);
        hash = 73 * hash + Objects.hashCode(this.telepon_penerima);
        hash = 73 * hash + Objects.hashCode(this.alamat_penerima);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final paket other = (paket) obj;
        if (!Objects.equals(this.nama_pengirim, other.nama_pengirim)) {
            return false;
        }
        if (!Objects.equals(this.telepon_pengirim, other.telepon_pengirim)) {
            return false;
        }
        if (!Objects.equals(this.alamat_pengirim, other.alamat_pengirim)) {
            return false;
        }
        if (!Objects.equals(this.nama_paket, other.nama_paket)) {
            return false;
        }
        if (!Objects.equals(this.nama_penerima, other.nama_penerima)) {
            return false;
        }
        if (!Objects.equals(this.telepon_penerima, other.telepon_penerima)) {
            return false;
        }
        if (!Objects.equals(this.alamat_penerima, other.alamat_penerima)) {
            return false;
        }
        if (!Objects.equals(this.no_resi, other.no_resi)) {
            return false;
        }
        if (!Objects.equals(this.berat_paket, other.berat_paket)) {
            return false;
        }
        return true;
    }
    
    
}
