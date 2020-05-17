/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.impl;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import tubes.entity.paket;
import tubes.error.tubesEx;
import tubes.service.tubesdao;

/**
 *
 * @author HP
 */
public class tubesdaoiml implements tubesdao {
    
    private Connection connection;
    
    private final String insertpaket = "INSERT INTO PAKET (NAMA_PENGIRIM,TELEPON_PENGIRIM,ALAMAT_PENGIRIM,NAMA_PAKET,BERAT_PAKET,NAMA_PENERIMA,TELEPON_PENERIMA,ALAMAT_PENERIMA) VALUES (?,?,?,?,?,?,?,?)";

    private final String updatepaket ="UPDATE PAKET SET NAMA_PENGIRIM=?,TELEPON_PENGIRIM=?,ALAMAT_PENGIRIM=?,NAMA_PAKET=?,BERAT_PAKET=?,NAMA_PENERIMA=?,TELEPON_PENERIMA=?,ALAMAT_PENERIMA=? WHERE NO_RESI=?";
    
    private final String deletepaket = "DELETE FROM PAKET WHERE NO_RESI=?";
    
    private final String getByno_resi = "SELECT * FROM PAKET WHERE NO_RESI=?";
    
    private final String selectAll = "SELECT * FROM PAKET ";
    
    public tubesdaoiml(Connection connection) {
        this.connection = connection;
    }
   
    @Override
    public void insertpaket(paket pakett) throws tubesEx {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertpaket, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, pakett.getNama_pengirim());
            statement.setString(2, pakett.getTelepon_pengirim());
            statement.setString(3, pakett.getAlamat_penerima());
            statement.setString(4, pakett.getNama_paket());
            statement.setInt(5, pakett.getBerat_paket());
            statement.setString(6, pakett.getNama_penerima());
            statement.setString(7, pakett.getTelepon_penerima());
            statement.setString(8, pakett.getAlamat_penerima());
            statement.executeUpdate();
            
            ResultSet result = statement.getGeneratedKeys();
            if(result.next()){
                pakett.setNo_resi(result.getInt(1));
            }
            
            connection.commit();
            
        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new tubesEx(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    
                }
            }
    }
        
    }

    @Override
    public void uppdatepaket(paket pakett) throws tubesEx {
        PreparedStatement statement = null;
        try {
             connection.setAutoCommit(false);
            statement = connection.prepareStatement(updatepaket);
            statement.setString(1, pakett.getNama_pengirim());
            statement.setString(2, pakett.getTelepon_pengirim());
            statement.setString(3, pakett.getAlamat_penerima());
            statement.setString(4, pakett.getNama_paket());
            statement.setInt(5, pakett.getBerat_paket());
            statement.setString(6, pakett.getNama_penerima());
            statement.setString(7, pakett.getTelepon_penerima());
            statement.setString(8, pakett.getAlamat_penerima());
            statement.setInt(9, pakett.getNo_resi());
            statement.executeUpdate();
            connection.commit();
        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new tubesEx(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    
                }
            }
    }
        
    }
    

    @Override
    public void deletepaket(Integer no_resi) throws tubesEx {
        PreparedStatement statement = null;
        try {
             connection.setAutoCommit(false);
            statement = connection.prepareStatement(deletepaket);
            statement.setInt(1, no_resi);
            statement.executeUpdate();
            connection.commit();
        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new tubesEx(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    
                }
            }
    }
    }

    @Override
    public paket getpaket(Integer no_resi) throws tubesEx {
        PreparedStatement statement = null;
        try {
             connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByno_resi);
            statement.setInt(1, no_resi);
            
            ResultSet result = statement.executeQuery();
            paket pakett = null;
            
            if(result.next()){
                pakett = new paket();
                pakett.setNo_resi(result.getInt("NO_RESI"));
                pakett.setNama_pengirim(result.getString("NAMA_PENGIRIM"));
                pakett.setTelepon_pengirim(result.getString("TELEPON_PENGIRIM"));
                pakett.setAlamat_pengirim(result.getString("ALAMAT_PENGIRIM"));
                pakett.setNama_paket(result.getString("NAMA_PAKET"));
                pakett.setBerat_paket(result.getInt("BERAT_PAKET"));
                pakett.setNama_penerima(result.getString("NAMA_PENERIMA"));
                pakett.setTelepon_penerima(result.getString("TELEPON_PENERIMA"));
                pakett.setAlamat_penerima(result.getString("ALAMAT_PENERIMA")); 
            }else{
                throw new tubesEx("Paket denfan no_resi "+no_resi+" tidak ditemukan");
            }
            connection.commit();
            return pakett;
        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new tubesEx(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    
                }
            }
    }
    }

    @Override
    public List<paket> selectAllpaket() throws tubesEx {
        
         Statement statement = null;
         List<paket> list = new ArrayList<paket>();
         
         try {
              connection.setAutoCommit(false);
            statement = connection.createStatement();
            
            
            ResultSet result = statement.executeQuery(selectAll);
            paket pakett = null;
            
            while(result.next()){
                pakett = new paket();
                pakett.setNo_resi(result.getInt("NO_RESI"));
                pakett.setNama_pengirim(result.getString("NAMA_PENGIRIM"));
                pakett.setTelepon_pengirim(result.getString("TELEPON_PENGIRIM"));
                pakett.setAlamat_pengirim(result.getString("ALAMAT_PENGIRIM"));
                pakett.setNama_paket(result.getString("NAMA_PAKET"));
                pakett.setBerat_paket(result.getInt("BERAT_PAKET"));
                pakett.setNama_penerima(result.getString("NAMA_PENERIMA"));
                pakett.setTelepon_penerima(result.getString("TELEPON_PENERIMA"));
                pakett.setAlamat_penerima(result.getString("ALAMAT_PENERIMA")); 
                list.add(pakett);
            }
            connection.commit();
            return list;
        }catch (SQLException e){
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new tubesEx(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement != null){
                try{
                    statement.close();
                }catch (SQLException e){
                    
                }
            }
    }
    
    }
}
