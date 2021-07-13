/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoffee.view.feature;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javacoffee.bus.KhachHang_BUS;
import javacoffee.bus.LoaiKhachHang_BUS;
import javacoffee.pojo.KhachHang_pojo;
import javacoffee.pojo.TaiKhoan_pojo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kikkdt (KietDt)
 */
public class MemberGUI extends javax.swing.JPanel {
    
    private TaiKhoan_pojo account;
    DefaultTableModel dtm;
    private ArrayList<KhachHang_pojo> lstKH = new KhachHang_BUS().getList();
    private static LoaiKhachHang_BUS loaiKH = new LoaiKhachHang_BUS();
    
    public TaiKhoan_pojo getAccount() {
        return account;
    }
    
    public void setAccount(TaiKhoan_pojo account) {
        this.account = account;
    }
    
    public MemberGUI(TaiKhoan_pojo account) {
        initComponents();
        this.account = account;
        //If the user is an employee, editing isn't allowed
        if (account.getIdLoaiTK() == 2) {
            btnXoa.setEnabled(false);
            btnSua.setEnabled(false);
        }
        loadTableKhachHang();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtTongSo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 500));

        jToolBar1.setBackground(new java.awt.Color(149, 87, 29));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(0, 50));
        jToolBar1.setMinimumSize(new java.awt.Dimension(1024, 50));
        jToolBar1.setPreferredSize(new java.awt.Dimension(1024, 50));

        btnThem.setBackground(new java.awt.Color(149, 87, 29));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-24.png"))); // NOI18N
        btnThem.setBorderPainted(false);
        btnThem.setFocusable(false);
        btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThem.setIconTextGap(10);
        btnThem.setLabel("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(100, 45));
        btnThem.setMinimumSize(new java.awt.Dimension(100, 45));
        btnThem.setPreferredSize(new java.awt.Dimension(100, 45));
        btnThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThem);

        btnSua.setBackground(new java.awt.Color(149, 87, 29));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-pencil-drawing-24.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderPainted(false);
        btnSua.setFocusable(false);
        btnSua.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSua.setIconTextGap(10);
        btnSua.setMaximumSize(new java.awt.Dimension(100, 45));
        btnSua.setMinimumSize(new java.awt.Dimension(100, 45));
        btnSua.setPreferredSize(new java.awt.Dimension(100, 45));
        btnSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSua);

        btnXoa.setBackground(new java.awt.Color(149, 87, 29));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-minus-24.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setBorderPainted(false);
        btnXoa.setFocusable(false);
        btnXoa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnXoa.setIconTextGap(10);
        btnXoa.setMaximumSize(new java.awt.Dimension(100, 45));
        btnXoa.setMinimumSize(new java.awt.Dimension(100, 45));
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 45));
        btnXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnXoa);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(149, 87, 29)));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tìm Khách hàng: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-24.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKhachHang);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tổng số Khách hàng:");

        txtTongSo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTongSo.setText("...");
        txtTongSo.setMaximumSize(new java.awt.Dimension(100, 20));
        txtTongSo.setMinimumSize(new java.awt.Dimension(100, 20));
        txtTongSo.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTongSo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTongSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadTableKhachHang() {
        tblKhachHang.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblKhachHang.getTableHeader().setReorderingAllowed(false);
        tblKhachHang.setRowHeight(24);
        tblKhachHang.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblKhachHang.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //Set DefaultTableModel & add header table
        tblKhachHang.setModel(new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        });
        tblKhachHang.getModel().addTableModelListener((e) -> {
            txtTongSo.setText(tblKhachHang.getRowCount() + "");
        });
        
        dtm = (DefaultTableModel) tblKhachHang.getModel();
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        dtm.addColumn("STT");
        dtm.addColumn("Mã KH");
        dtm.addColumn("Họ và Tên");
        dtm.addColumn("Số điện thoại");
        dtm.addColumn("Loại thành viên");
        dtm.addColumn("Điểm tích luỹ");

        //Setting column width & turn off resizable
        tblKhachHang.getColumnModel().getColumn(0).setMaxWidth(50);
        tblKhachHang.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblKhachHang.getColumnModel().getColumn(2).setPreferredWidth(200);
        for (int i = 0; i < 4; i++) {
            tblKhachHang.getColumnModel().getColumn(i).setResizable(false);
        }
        tblKhachHang.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        lstKH = new KhachHang_BUS().getList();
        if (lstKH.isEmpty()) {
            return;
        }
        int i = 0;
        for (KhachHang_pojo kh : lstKH) {
            dtm.addRow(new Object[]{
                ++i,
                kh.getMaKH(),
                kh.getTenKH(),
                kh.getSdt(),
                loaiKH.getTenLoaiKH(kh.getMaLoaiKH()),
                kh.getDiemTichLuy()
            });
        }
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DialogSignupMember dlg = new DialogSignupMember(null, true);
        dlg.cbLoaiKH.setSelectedIndex(0);
        if (account.getIdLoaiTK() == 2) {
            dlg.cbLoaiKH.setEnabled(false);
        }
        
        if (dlg.btnSave.getActionListeners().length != 0) {
            for (ActionListener item : dlg.btnSave.getActionListeners()) {
                dlg.btnSave.removeActionListener(item);
            }
        }
        dlg.btnSave.addActionListener((ActionEvent e) -> {
            int maLoaiKH = loaiKH.getMaLoaiKH(dlg.cbLoaiKH.getSelectedItem().toString());
            if (new KhachHang_BUS().insert(dlg.txtTenKH.getText().trim(), dlg.txtSDT.getText(), maLoaiKH) > 0) {
                JOptionPane.showMessageDialog(null, "Đăng ký thành viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                dlg.dispose();
                dlg.btnSave.setActionCommand("performed");
                loadTableKhachHang();
            }
        });
        
        dlg.getRootPane().setDefaultButton(dlg.btnSave);
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (tblKhachHang.getSelectedRowCount() > 1 || tblKhachHang.getSelectedRowCount() == 0)
            JOptionPane.showMessageDialog(null, "Vui lòng chọn 1 khách hàng để sửa thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/error.png")));
        else {
            int row = tblKhachHang.getSelectedRow();
            DialogSignupMember dlg = new DialogSignupMember(null, true);
            dlg.setTitle("Chỉnh sửa thông tin");
            dlg.lblTitle.setText("Chỉnh sửa thông tin");
            int maKH = Integer.parseInt(dtm.getValueAt(row, 1).toString());
            dlg.txtTenKH.setText(dtm.getValueAt(row, 2).toString());
            dlg.txtSDT.setText(dtm.getValueAt(row, 3).toString());
            dlg.cbLoaiKH.setSelectedItem(dtm.getValueAt(row, 4));
            //If the user is an employee, editing isn't allowed
            if (account.getIdLoaiTK() == 2) {
                dlg.cbLoaiKH.setEnabled(false);
            }
            
            if (dlg.btnSave.getActionListeners().length != 0) {
                for (ActionListener item : dlg.btnSave.getActionListeners()) {
                    dlg.btnSave.removeActionListener(item);
                }
            }
            dlg.btnSave.addActionListener((ActionEvent e) -> {
                int maLoaiKH = loaiKH.getMaLoaiKH(dlg.cbLoaiKH.getSelectedItem().toString());
                if (new KhachHang_BUS().update(maKH, dlg.txtTenKH.getText().trim(), dlg.txtSDT.getText(), maLoaiKH) > 0) {
                    JOptionPane.showMessageDialog(null, "Lưu thông tin thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    dlg.btnSave.setActionCommand("performed");
                    dlg.dispose();
                    loadTableKhachHang();
                }
            });
            
            dlg.getRootPane().setDefaultButton(dlg.btnSave);
            dlg.setLocationRelativeTo(null);
            dlg.setVisible(true);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int[] rowSelected = tblKhachHang.getSelectedRows();
        if (rowSelected.length == 0)
            JOptionPane.showMessageDialog(null, "Vui lòng chọn ít nhất 1 khách hàng để xoá.", "Lỗi", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("/error.png")));
        else {
            String msg = "";
            for (int i = 0; i < rowSelected.length; i++) {
                msg += dtm.getValueAt(rowSelected[i], 2).toString() + "[ID: " + dtm.getValueAt(rowSelected[i], 1).toString() + "]; ";
            }
            int chosen = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xoá " + rowSelected.length + " khách hàng: " + msg + " không?", "Thông báo", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
            if (chosen == JOptionPane.YES_OPTION) {
                int rowAffted = 0;
                for (int i = 0; i < rowSelected.length; i++) {
                    if (new KhachHang_BUS().delete(Integer.parseInt(dtm.getValueAt(rowSelected[i], 1).toString())) > 0) {
                        rowAffted++;
                    }
                }
                if (rowAffted == rowSelected.length) {
                    JOptionPane.showMessageDialog(null, "Xoá thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                loadTableKhachHang();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String strSearch = "^.*" + txtSearch.getText().toLowerCase() + ".*$";
        dtm.setRowCount(0);
        int i = 0;
        for (KhachHang_pojo kh : lstKH) {
            if (String.valueOf(kh.getMaKH()).matches(strSearch) || kh.getTenKH().toLowerCase().matches(strSearch) || kh.getSdt().matches(strSearch)) {
                dtm.addRow(new Object[]{
                    ++i,
                    kh.getMaKH(),
                    kh.getTenKH(),
                    kh.getSdt(),
                    loaiKH.getTenLoaiKH(kh.getMaLoaiKH()),
                    kh.getDiemTichLuy()
                });
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTongSo;
    // End of variables declaration//GEN-END:variables
}
