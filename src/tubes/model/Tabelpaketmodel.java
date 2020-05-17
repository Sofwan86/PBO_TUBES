/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.model;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tubes.entity.paket;

/**
 *
 * @author HP
 */
public class Tabelpaketmodel extends AbstractTableModel{
    
    private List<paket> list = new ArrayList<paket>();

    public void setList(List<paket> list) {
        this.list = list;
    }
    

    
    @Override
    public int getRowCount() {
       return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    public boolean add(paket e) {
        try {
            return list.add(e);
        } finally{
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public paket get(int index) {
        return list.get(index);
    }

    public paket set(int i, paket e) {
        try {
            return list.set(i, e);
        } finally{
            fireTableRowsUpdated(i, i);
        }
    }

    public paket remove(int i) {
        try {
            return list.remove(i);
        } finally{
            fireTableRowsDeleted(i, i);
        }
        
    }

    
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "NO RESI";
            case 1:
                return "NAMA PENGIRIM";
            case 2:
                return "TELEPON PENGIRIM";
            case 3:
                return "ALAMAT PENGIRIM";
            case 4:
                return "NAMA PAKET";
            case 5:
                return "BERAT PAKET";
            case 6:
                return "NAMA PENERIMA";
            case 7:
                return "TELEPON PENERIMA";
            case 8:
                return "ALAMAT PENERIMA";
            default:
                return null;
                
        }
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getNo_resi();
            case 1:
                return list.get(rowIndex).getNama_pengirim();
            case 2:
                return list.get(rowIndex).getTelepon_pengirim();
            case 3:
                return list.get(rowIndex).getAlamat_pengirim();
            case 4:
                return list.get(rowIndex).getNama_paket();
            case 5:
                return list.get(rowIndex).getBerat_paket();
            case 6:
                return list.get(rowIndex).getNama_penerima();
            case 7:
                return list.get(rowIndex).getTelepon_penerima();
            case 8:
                return list.get(rowIndex).getAlamat_penerima();
            default:
                return null;
                
        }
    }
    
}
