/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoffee.view.feature;

import java.awt.Font;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javacoffee.bus.Ban_BUS;
import javacoffee.bus.HoaDon_BUS;
import javacoffee.bus.KhachHang_BUS;
import javacoffee.bus.NhanVien_BUS;
import javacoffee.pojo.HoaDon_pojo;
import javacoffee.pojo.TaiKhoan_pojo;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kikkdt (KietDt)
 */
public class HoaDonGUI extends javax.swing.JPanel {

    private TaiKhoan_pojo account;
    private DefaultTableModel dtm;
    private static KhachHang_BUS khachhang = new KhachHang_BUS();
    private static NhanVien_BUS nhanvien = new NhanVien_BUS();
    private static Ban_BUS ban = new Ban_BUS();
    private static ArrayList<HoaDon_pojo> lstHoaDon;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public TaiKhoan_pojo getAccount() {
        return account;
    }

    public void setAccount(TaiKhoan_pojo account) {
        this.account = account;
    }

    public HoaDonGUI(TaiKhoan_pojo account) {
        initComponents();
        this.account = account;
        //If the user is an employee, only view today's bill
        if (account.getIdLoaiTK() == 2) {
            dateChooser.setEnabled(false);
        }
        try {
            String now = sdf.format(new Date());
            dateChooser.setDate(sdf.parse(now));
            String[] arrTmp = now.split("/");
            loadTableHoaDon(Integer.parseInt(arrTmp[0]), Integer.parseInt(arrTmp[1]), Integer.parseInt(arrTmp[2]));
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateChooser.getDateEditor().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if ("date".equals(evt.getPropertyName())) {
                String date = sdf.format(dateChooser.getDate());
                String[] arrTmp = date.split("/");
                loadTableHoaDon(Integer.parseInt(arrTmp[0]), Integer.parseInt(arrTmp[1]), Integer.parseInt(arrTmp[2]));
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogCTHoaDon = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        lblBan = new javax.swing.JLabel();
        txtBan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbKhuVuc = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnlHoaDon = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTongSo = new javax.swing.JLabel();

        dialogCTHoaDon.setTitle("Quản lý Bàn");
        dialogCTHoaDon.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logo-icon.png"))
        );
        dialogCTHoaDon.setMinimumSize(new java.awt.Dimension(400, 300));
        dialogCTHoaDon.setResizable(false);
        dialogCTHoaDon.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                dialogCTHoaDonWindowClosing(evt);
            }
        });

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(149, 87, 29), 2, true));

        lblBan.setBackground(new java.awt.Color(149, 87, 29));
        lblBan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBan.setForeground(new java.awt.Color(255, 255, 255));
        lblBan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBan.setText("Thêm Bàn");
        lblBan.setOpaque(true);

        txtBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBan.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 56, 19));
        jLabel13.setText("Tên bàn:");

        cbKhuVuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 56, 19));
        jLabel14.setText("Khu vực:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbKhuVuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblBan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnSave.setBackground(new java.awt.Color(149, 87, 29));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-24.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.setBorderPainted(false);
        btnSave.setIconTextGap(10);

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(96, 56, 19));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cancel-24.png"))); // NOI18N
        btnCancel.setText("Thoát");
        btnCancel.setIconTextGap(10);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogCTHoaDonLayout = new javax.swing.GroupLayout(dialogCTHoaDon.getContentPane());
        dialogCTHoaDon.getContentPane().setLayout(dialogCTHoaDonLayout);
        dialogCTHoaDonLayout.setHorizontalGroup(
            dialogCTHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogCTHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogCTHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogCTHoaDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)))
                .addContainerGap())
        );
        dialogCTHoaDonLayout.setVerticalGroup(
            dialogCTHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCTHoaDonLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(dialogCTHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        setMinimumSize(new java.awt.Dimension(1024, 500));
        setPreferredSize(new java.awt.Dimension(1024, 500));

        pnlHoaDon.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel3.setBackground(new java.awt.Color(149, 87, 29));
        jPanel3.setMinimumSize(new java.awt.Dimension(793, 45));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Xem hóa đơn ngày:");
        jLabel1.setToolTipText("Xem hóa đơn ngày");

        dateChooser.setDateFormatString("dd/MM/yyyy");
        dateChooser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        dateChooser.setIcon(new ImageIcon(getClass().getResource("/icons8-calendar-24.png")));
        dateChooser.setMaxSelectableDate(new Date());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(149, 87, 29)));

        jScrollPane2.setBorder(null);

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHoaDon.setOpaque(false);
        jScrollPane2.setViewportView(tblHoaDon);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-24.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(txtSearch);
        jLabel3.setText("Tìm Hóa đơn:");
        jLabel3.setToolTipText("Tìm Hóa đơn");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tổng số Hóa đơn:");

        txtTongSo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTongSo.setText("...");
        txtTongSo.setMaximumSize(new java.awt.Dimension(100, 20));
        txtTongSo.setMinimumSize(new java.awt.Dimension(100, 20));
        txtTongSo.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(247, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTongSo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTongSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlHoaDonLayout = new javax.swing.GroupLayout(pnlHoaDon);
        pnlHoaDon.setLayout(pnlHoaDonLayout);
        pnlHoaDonLayout.setHorizontalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlHoaDonLayout.setVerticalGroup(
            pnlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHoaDonLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if ("performed".equalsIgnoreCase(btnSave.getActionCommand()) || txtBan.getText().isBlank()) {
            dialogCTHoaDon.dispose();
        } else {
            int chosen = JOptionPane.showConfirmDialog(null, "Bàn chưa được lưu. Bạn có muốn lưu không?", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            if (chosen == JOptionPane.NO_OPTION) {
                dialogCTHoaDon.dispose();
            } else if (chosen == JOptionPane.YES_OPTION) {
                btnSave.doClick();
                if ("performed".equalsIgnoreCase(btnSave.getActionCommand())) {
                    dialogCTHoaDon.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void dialogCTHoaDonWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogCTHoaDonWindowClosing
        if ("performed".equalsIgnoreCase(btnSave.getActionCommand()) || txtBan.getText().isBlank()) {
            dialogCTHoaDon.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        } else {
            int chosen = JOptionPane.showConfirmDialog(null, "Bàn chưa được lưu. Bạn có muốn lưu không?", "Thông báo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            switch (chosen) {
                case JOptionPane.NO_OPTION:
                    dialogCTHoaDon.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    break;
                case JOptionPane.CANCEL_OPTION:
                    dialogCTHoaDon.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    break;
                case JOptionPane.YES_OPTION:
                    btnSave.doClick();
                    if ("performed".equals(btnSave.getActionCommand())) {
                        dialogCTHoaDon.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    }
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_dialogCTHoaDonWindowClosing

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String strSearch = "^.*" + txtSearch.getText().toLowerCase() + ".*$";
        dtm = (DefaultTableModel) tblHoaDon.getModel();
        dtm.setRowCount(0);
        if (lstHoaDon.isEmpty()) {
            return;
        }

        lstHoaDon.parallelStream().filter(hd -> String.valueOf(hd.getMaHD()).matches(strSearch) || nhanvien.getTenNhanVien(hd.getMaNV()).toLowerCase().matches(strSearch) || khachhang.getTenKH(hd.getMaKH()).toLowerCase().matches(strSearch) || ban.getTenBan(hd.getMaBan()).toLowerCase().matches(strSearch) || String.valueOf(hd.getNgayXuatHD()).matches(strSearch) || (hd.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán").toLowerCase().matches(strSearch)).forEach(hd -> {
            dtm.addRow(new Object[]{
                hd.getMaHD(),
                nhanvien.getTenNhanVien(hd.getMaNV()),
                khachhang.getTenKH(hd.getMaKH()),
                ban.getTenBan(hd.getMaBan()),
                hd.getNgayXuatHD(),
                hd.getThanhTien(),
                hd.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán"
            });
        });
    }//GEN-LAST:event_txtSearchKeyReleased

    private void loadTableHoaDon(int ngay, int thang, int nam) {
        tblHoaDon.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tblHoaDon.getTableHeader().setReorderingAllowed(false);
        tblHoaDon.setRowHeight(24);
        tblHoaDon.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblHoaDon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //Set DefaultTableModel & add header table
        tblHoaDon.setModel(new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        });
        tblHoaDon.getModel().addTableModelListener((e) -> {
            txtTongSo.setText(tblHoaDon.getRowCount() + "");
        });
        dtm = (DefaultTableModel) tblHoaDon.getModel();
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        dtm.addColumn("Mã HD");
        dtm.addColumn("Nhân viên");
        dtm.addColumn("Khách hàng");
        dtm.addColumn("Bàn");
        dtm.addColumn("Ngày xuất HD");
        dtm.addColumn("Thành tiền");
        dtm.addColumn("Trạng thái");

        //Setting column width & turn off resizable
        tblHoaDon.getColumnModel().getColumn(0).setMinWidth(100);
        tblHoaDon.getColumnModel().getColumn(0).setMaxWidth(100);
        for (int i = 0; i < 7; i++) {
            tblHoaDon.getColumnModel().getColumn(i).setResizable(false);
        }
        tblHoaDon.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        lstHoaDon = new HoaDon_BUS().getList(ngay, thang, nam);
        if (lstHoaDon.isEmpty()) {
            return;
        }

        lstHoaDon.forEach(hd -> {
            dtm.addRow(new Object[]{
                hd.getMaHD(),
                nhanvien.getTenNhanVien(hd.getMaNV()),
                khachhang.getTenKH(hd.getMaKH()),
                ban.getTenBan(hd.getMaBan()),
                hd.getNgayXuatHD(),
                String.format("%,.0f VNĐ", hd.getThanhTien()),
                hd.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán"
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    protected javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbKhuVuc;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JDialog dialogCTHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBan;
    private javax.swing.JPanel pnlHoaDon;
    private javax.swing.JTable tblHoaDon;
    protected javax.swing.JTextField txtBan;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtTongSo;
    // End of variables declaration//GEN-END:variables
}
