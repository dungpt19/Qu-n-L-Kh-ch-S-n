/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTO_Phong;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class pnl_LoaiPhong extends javax.swing.JPanel {

    /**
     * Creates new form pnl_LoaiPhong
     */
    public static pnl_LoaiPhong form;

    public pnl_LoaiPhong() {
        initComponents();
        BLL.BLL_LoaiPhong.DoDuLieuBang(tbl_LoaiPhong);
        form = this;
    }

    public static DTO.DTO_Phong LP = new DTO_Phong();

    private void GanThongTin() {
        LP.setMaLoaiPhong(txt_MaLoaiPhong.getText());
        LP.setTenLoaiPhong(txt_TenLoaiPhong.getText());
        LP.setGiaTheoGio(txt_GiaGio.getText());
        LP.setGiaTheoNgay(txt_GiaNgay.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_MaLoaiPhong = new javax.swing.JLabel();
        lbl_TenLoaiPhong = new javax.swing.JLabel();
        lbl_GiaGio = new javax.swing.JLabel();
        lbl_GiaNgay = new javax.swing.JLabel();
        txt_MaLoaiPhong = new javax.swing.JTextField();
        txt_TenLoaiPhong = new javax.swing.JTextField();
        txt_GiaGio = new javax.swing.JTextField();
        txt_GiaNgay = new javax.swing.JTextField();
        pnl2 = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_LoaiPhong = new javax.swing.JTable();
        btn_LamMoi = new javax.swing.JButton();
        lbl_Nen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(null);

        lbl_MaLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_MaLoaiPhong.setText("ID Room Type");
        add(lbl_MaLoaiPhong);
        lbl_MaLoaiPhong.setBounds(10, 33, 130, 17);

        lbl_TenLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TenLoaiPhong.setText("Room Type");
        add(lbl_TenLoaiPhong);
        lbl_TenLoaiPhong.setBounds(10, 74, 140, 17);

        lbl_GiaGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_GiaGio.setText("PriceByHours");
        add(lbl_GiaGio);
        lbl_GiaGio.setBounds(10, 115, 120, 17);

        lbl_GiaNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_GiaNgay.setText("PriceByDays");
        add(lbl_GiaNgay);
        lbl_GiaNgay.setBounds(10, 156, 100, 17);

        txt_MaLoaiPhong.setBackground(new java.awt.Color(153, 153, 153));
        txt_MaLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txt_MaLoaiPhong);
        txt_MaLoaiPhong.setBounds(145, 30, 148, 30);

        txt_TenLoaiPhong.setBackground(new java.awt.Color(153, 153, 153));
        txt_TenLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txt_TenLoaiPhong);
        txt_TenLoaiPhong.setBounds(145, 71, 148, 30);

        txt_GiaGio.setBackground(new java.awt.Color(153, 153, 153));
        txt_GiaGio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_GiaGio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_GiaGioKeyReleased(evt);
            }
        });
        add(txt_GiaGio);
        txt_GiaGio.setBounds(145, 112, 148, 30);

        txt_GiaNgay.setBackground(new java.awt.Color(153, 153, 153));
        txt_GiaNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_GiaNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_GiaNgayKeyReleased(evt);
            }
        });
        add(txt_GiaNgay);
        txt_GiaNgay.setBounds(145, 153, 148, 30);

        pnl2.setBackground(new java.awt.Color(51, 204, 255));

        btn_Them.setBackground(new java.awt.Color(255, 255, 255));
        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Them.setText("Add");
        btn_Them.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Xoa.setBackground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Xoa.setText("Delete");
        btn_Xoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Xoa.setEnabled(false);
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_Sua.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Sua.setText("Edit");
        btn_Sua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Sua.setEnabled(false);
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Them))
                .addContainerGap())
        );

        add(pnl2);
        pnl2.setBounds(9, 220, 280, 58);

        tbl_LoaiPhong.setBackground(new java.awt.Color(153, 153, 153));
        tbl_LoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_LoaiPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Type", "By Hours", "By Days"
            }
        ));
        tbl_LoaiPhong.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_LoaiPhong.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tbl_LoaiPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_LoaiPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_LoaiPhong);

        add(jScrollPane1);
        jScrollPane1.setBounds(311, 11, 452, 510);

        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/Icon_Reload.png"))); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        add(btn_LamMoi);
        btn_LamMoi.setBounds(770, 480, 57, 33);

        lbl_Nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HinhAnh/CLEAN-BLUE-GRADIENT.png"))); // NOI18N
        lbl_Nen.setPreferredSize(new java.awt.Dimension(865, 525));
        add(lbl_Nen);
        lbl_Nen.setBounds(0, -70, 870, 660);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        GanThongTin();
        if (BLL.BLL_LoaiPhong.KT_Them(LP)) {
            DAO.DAO_LoaiPhong.Them(LP);
            BLL.BLL_LoaiPhong.DoDuLieuBang(tbl_LoaiPhong);
        } else {
        }

    }//GEN-LAST:event_btn_ThemActionPerformed

    private void tbl_LoaiPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_LoaiPhongMouseClicked
        if (tbl_LoaiPhong.getSelectedRowCount() == 1) {
            btn_Sua.setEnabled(true);
            btn_Xoa.setEnabled(true);
        }
        int vitri = tbl_LoaiPhong.getSelectedRow();
        GanTTVaoTxt(vitri);
        txt_MaLoaiPhong.setFocusable(false);
    }//GEN-LAST:event_tbl_LoaiPhongMouseClicked

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        int nutbam = JOptionPane.showConfirmDialog(new JFrame(), "Do you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (nutbam == JOptionPane.YES_OPTION) {
            int cacdong[] = tbl_LoaiPhong.getSelectedRows();
            for (int i = 0; i < cacdong.length; i++) {
                String MaLoaiPhong = tbl_LoaiPhong.getValueAt(cacdong[i], 0).toString();
                if (BLL.BLL_LoaiPhong.KT_Xoa(MaLoaiPhong)) {
                    DAO.DAO_LoaiPhong.Xoa(MaLoaiPhong);
                }

            }
            LamMoi();
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        LamMoi();
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        if (tbl_LoaiPhong.getSelectedRowCount() != 1) {
            thongbao.thongbao("Choose a row to delete", "");
        } else {

            GanThongTin();
            if (BLL.BLL_LoaiPhong.KT_Sua(LP)) {
                DAO.DAO_LoaiPhong.Sua(LP);
                LamMoi();
            }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void txt_GiaGioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GiaGioKeyReleased
        try {
            double so = ChuyenDoi.ChuyenSangSo(txt_GiaGio.getText());
            String sotien = ChuyenDoi.DinhDangSo(so);
            txt_GiaGio.setText(sotien);
        } catch (Exception e) {
            txt_GiaGio.setText("0");
        }
    }//GEN-LAST:event_txt_GiaGioKeyReleased

    private void txt_GiaNgayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_GiaNgayKeyReleased
         try {
            double so = ChuyenDoi.ChuyenSangSo(txt_GiaNgay.getText());
            String sotien = ChuyenDoi.DinhDangSo(so);
            txt_GiaNgay.setText(sotien);
        } catch (Exception e) {
            txt_GiaNgay.setText("0");
        }
    }//GEN-LAST:event_txt_GiaNgayKeyReleased
    private void LamMoi() {
        frm_QLPhong frm = frm_QLPhong.form;
        pnl_LoaiPhong pnl = new pnl_LoaiPhong();
        frm.tab.remove(this);
        frm.tab.add("Room Type", pnl);
        frm.tab.setSelectedComponent(pnl);
    }

    private void GanTTVaoTxt(int vitri) {
        String MaLoaiPhong = tbl_LoaiPhong.getValueAt(vitri, 0).toString();
        ResultSet rs = DAO.DAO_LoaiPhong.LayLoaiTheoMa(MaLoaiPhong);
        try {
            if (rs.next()) {
                txt_MaLoaiPhong.setText(rs.getString("MaLoaiPhong"));
                txt_TenLoaiPhong.setText(rs.getString("TenLoaiPhong"));
                txt_GiaGio.setText(ChuyenDoi.DinhDangSo(rs.getDouble("GiaTheoGio")));
                txt_GiaNgay.setText(ChuyenDoi.DinhDangSo(rs.getDouble("GiaTheoNgay")));
            }
        } catch (SQLException ex) {

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_GiaGio;
    private javax.swing.JLabel lbl_GiaNgay;
    private javax.swing.JLabel lbl_MaLoaiPhong;
    private javax.swing.JLabel lbl_Nen;
    private javax.swing.JLabel lbl_TenLoaiPhong;
    private javax.swing.JPanel pnl2;
    private javax.swing.JTable tbl_LoaiPhong;
    private javax.swing.JTextField txt_GiaGio;
    private javax.swing.JTextField txt_GiaNgay;
    private javax.swing.JTextField txt_MaLoaiPhong;
    private javax.swing.JTextField txt_TenLoaiPhong;
    // End of variables declaration//GEN-END:variables
}
