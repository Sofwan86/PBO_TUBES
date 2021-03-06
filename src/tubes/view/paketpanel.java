/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.view;

import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import tubes.controller.paketcontrol;
import tubes.database.tubesdatabase;
import tubes.entity.paket;
import tubes.error.tubesEx;
import tubes.event.paketlisten;
import tubes.model.Tabelpaketmodel;
import tubes.model.paketModel;
import tubes.service.tubesdao;

/**
 *
 * @author HP
 */
public class paketpanel extends javax.swing.JPanel implements paketlisten, ListSelectionListener {

     private Tabelpaketmodel tabelModel;
    private paketModel model;
    private paketcontrol controller;
    
    
    public paketpanel() {
        
        tabelModel = new Tabelpaketmodel();
        
        model = new paketModel();
        model.setListener(this);
        
        controller = new paketcontrol();
        controller.setModel(model);
        
        initComponents();
        tabelpaket.getSelectionModel().addListSelectionListener(this);
        tabelpaket.setModel(tabelModel);
    }

    public JTable getTabelpaket() {
        return tabelpaket;
    }

    public JTextField getTxtalpa() {
        return txtalpa;
    }

    public JTextField getTxtalpm() {
        return txtalpm;
    }

    public JTextField getTxtbept() {
        return txtbept;
    }

    public JTextField getTxtnapa() {
        return txtnapa;
    }

    public JTextField getTxtnapm() {
        return txtnapm;
    }

    public JTextField getTxtnapt() {
        return txtnapt;
    }

    public JTextField getTxtnore() {
        return txtnore;
    }

    public JTextField getTxttlpm() {
        return txttlpm;
    }

    public JTextField getTxtxtlpa() {
        return txtxtlpa;
    }

    /**
     * Creates new form paketpanel
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PAKETPANEL = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnore = new javax.swing.JTextField();
        txttlpm = new javax.swing.JTextField();
        txtnapm = new javax.swing.JTextField();
        txtalpm = new javax.swing.JTextField();
        txtnapt = new javax.swing.JTextField();
        txtbept = new javax.swing.JTextField();
        txtnapa = new javax.swing.JTextField();
        txtxtlpa = new javax.swing.JTextField();
        txtalpa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpaket = new javax.swing.JTable();
        btnreset = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        PAKETPANEL.setBackground(new java.awt.Color(52, 73, 94));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" NO RESI :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NAMA PENGIRIM :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TELEPON PENGIRIM :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NAMA PAKET :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(" BERAT PAKET :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("NAMA PENERIMA :");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ALAMAT PENGRIRIM :");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("TELEPON PENERIMA :");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("ALAMAT PENERIMA :");

        txtnore.setEditable(false);

        txtalpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalpmActionPerformed(evt);
            }
        });

        txtbept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbeptActionPerformed(evt);
            }
        });

        tabelpaket.setBackground(new java.awt.Color(24, 44, 97));
        tabelpaket.setBorder(new javax.swing.border.MatteBorder(null));
        tabelpaket.setFont(new java.awt.Font("Felix Titling", 1, 13)); // NOI18N
        tabelpaket.setForeground(new java.awt.Color(255, 255, 255));
        tabelpaket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelpaket);

        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\mover-truck (1).png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Menambah DATA");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout PAKETPANELLayout = new javax.swing.GroupLayout(PAKETPANEL);
        PAKETPANEL.setLayout(PAKETPANELLayout);
        PAKETPANELLayout.setHorizontalGroup(
            PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAKETPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PAKETPANELLayout.createSequentialGroup()
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnapa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtxtlpa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtalpa, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PAKETPANELLayout.createSequentialGroup()
                                .addComponent(btnreset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnubah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus))))
                    .addGroup(PAKETPANELLayout.createSequentialGroup()
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttlpm, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(txtnapm)
                            .addComponent(txtnore)
                            .addComponent(txtalpm)
                            .addComponent(txtnapt)
                            .addComponent(txtbept))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(PAKETPANELLayout.createSequentialGroup()
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PAKETPANELLayout.setVerticalGroup(
            PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAKETPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PAKETPANELLayout.createSequentialGroup()
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttlpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtalpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtnapt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtbept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtxtlpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtalpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PAKETPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(btnsimpan)
                    .addComponent(btnubah)
                    .addComponent(btnhapus))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PAKETPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PAKETPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        controller.deletepaket(this);
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        controller.updatepaket(this);
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        controller.insertpaket(this);
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        controller.resetpaket(this);
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtbeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbeptActionPerformed

    }//GEN-LAST:event_txtbeptActionPerformed

    private void txtalpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalpmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalpmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PAKETPANEL;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelpaket;
    private javax.swing.JTextField txtalpa;
    private javax.swing.JTextField txtalpm;
    private javax.swing.JTextField txtbept;
    private javax.swing.JTextField txtnapa;
    private javax.swing.JTextField txtnapm;
    private javax.swing.JTextField txtnapt;
    private javax.swing.JTextField txtnore;
    private javax.swing.JTextField txttlpm;
    private javax.swing.JTextField txtxtlpa;
    // End of variables declaration//GEN-END:variables

    @Override
   public void onChange(paketModel model) {
        txtnore.setText(model.getNo_resi() + "");
        txtnapm.setText(model.getNama_pengirim());
        txttlpm.setText(model.getTelepon_pengirim());
        txtalpm.setText(model.getAlamat_pengirim());
        txtnapt.setText(model.getNama_paket());
        txtbept.setText(model.getBerat_paket() + "");
        txtnapa.setText(model.getNama_penerima());
        txtxtlpa.setText(model.getTelepon_penerima());
        txtalpa.setText(model.getAlamat_penerima());
    }

    @Override
    public void onInsert(paket pakett) {
        tabelModel.add(pakett);
    }

    @Override
    public void onDelete() {
        int index;
        index = tabelpaket.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void onUpdate(paket pakett) {
        int index;
        index = tabelpaket.getSelectedRow();
        tabelModel.set(index, pakett);
    }
    
    public void valueChanged(ListSelectionEvent e){
        
        try {
            paket model = tabelModel.get(tabelpaket.getSelectedRow());
            txtnore.setText(model.getNo_resi() + "");
            txtnapm.setText(model.getNama_pengirim());
            txttlpm.setText(model.getTelepon_pengirim());
            txtalpm.setText(model.getAlamat_pengirim());
            txtnapt.setText(model.getNama_paket());
            txtbept.setText(model.getBerat_paket() + "");
            txtnapa.setText(model.getNama_penerima());
            txtxtlpa.setText(model.getTelepon_penerima());
            txtalpa.setText(model.getAlamat_penerima());
            
        } catch (IndexOutOfBoundsException ex) {
        }
    }
    
    public void loadDatabase() throws SQLException, tubesEx{
        tubesdao dao = tubesdatabase.gettubesdao();
        tabelModel.setList(dao.selectAllpaket());
        
    }
}
