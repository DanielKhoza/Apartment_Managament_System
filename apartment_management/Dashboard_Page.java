/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment_management;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.BorderLayout;
import javax.swing.*;
import java.util.Vector;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Daniel Khoza
 */
public class Dashboard_Page extends javax.swing.JFrame {
    
    public Visitors_Capturing_Page VisitorsCapturing;
    public Settings_Page SettingsPage;
    DefaultTableModel model;

    /**
     * Creates new form Main_Page
     */
    public Dashboard_Page() {
        initComponents();
        
        VisitorsCapturing = new Visitors_Capturing_Page();
        SettingsPage = new Settings_Page();
        
        fileMenu();
        JMenuBarEvents();
        seticonImage();
    }
    
 
    
    javax.swing.JMenuBar mbMenuBar = new javax.swing.JMenuBar();
    javax.swing.JMenu mMenu = new javax.swing.JMenu("File");
    
    javax.swing.JMenuItem mMenuVisitorCapturing = new javax.swing.JMenuItem("Visitor's Capturing");
    javax.swing.JMenuItem mMenuSettings = new javax.swing.JMenuItem("Settings");
    javax.swing.JMenuItem mMenuAbout = new javax.swing.JMenuItem("About");

    javax.swing.JMenuItem mMenuExit = new javax.swing.JMenuItem("Exit");
    
    private void fileMenu(){
        
        mMenu.add(mMenuVisitorCapturing);
        mMenu.add(mMenuSettings);
        
        mMenu.add(mMenuAbout);
        
        mMenu.add(mMenuExit);
        mbMenuBar.add(mMenu);
        
        this.setJMenuBar(mbMenuBar);
    }
    
    private void JMenuBarEvents() {
        mMenuVisitorCapturing.addActionListener( new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            
            VisitorsCapturing.setVisible(true);
            VisitorsCapturing.toFront();
            VisitorsCapturing.pack();
            VisitorsCapturing.setLocationRelativeTo(null);
            VisitorsCapturing.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }

        });
        
        mMenuSettings.addActionListener( new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null,"This Section is for Changing User Name and Password Only");
             
            SettingsPage.setVisible(true);
            SettingsPage.toFront();
            SettingsPage.pack();
            SettingsPage.setLocationRelativeTo(null);
            SettingsPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }

                      
        });
        
        mMenuExit.addActionListener( new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            
        int response = JOptionPane.showConfirmDialog(null,"Do you want to Exit Application? " , "CONFIRM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        else if(response== JOptionPane.NO_OPTION){
            setVisible(true);
        }
            }
        });
         
        mMenuAbout.addActionListener( new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null,"Apartment \n"
                        + "Add Info \n"
                        + "Add Info \n"
                        + "Add Info \n"
                        + "Add Info\n \n"
                        + "Add Info \n"
                        + "Est.2020", " ABOUT REYAVAYA", JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
    
    public void search(String str) {
    model = (DefaultTableModel) TableDashboard.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<> (model);
    TableDashboard.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDashboard = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);

        jPanel1.setLayout(null);

        TableDashboard.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        TableDashboard.setForeground(new java.awt.Color(0, 0, 0));
        TableDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time", "Guest Name", "Phone Number", "Apartment Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDashboardMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableDashboard);
        if (TableDashboard.getColumnModel().getColumnCount() > 0) {
            TableDashboard.getColumnModel().getColumn(0).setResizable(false);
            TableDashboard.getColumnModel().getColumn(1).setResizable(false);
            TableDashboard.getColumnModel().getColumn(2).setResizable(false);
            TableDashboard.getColumnModel().getColumn(3).setResizable(false);
            TableDashboard.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 130, 780, 310);

        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch);
        txtSearch.setBounds(460, 70, 350, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/Background/icons8-search-20.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 60, 50, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(40, 50, 800, 10);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 50, 60, 30);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(630, 450, 100, 30);

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(740, 450, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/Background/pexels-artem-lysenko-3825673 (Background).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void AddRowToTable(Object[] dataRow){
        DefaultTableModel model = (DefaultTableModel)TableDashboard.getModel();
        model.addRow(dataRow);
    }
    
    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        
    }//GEN-LAST:event_txtSearchFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)TableDashboard.getModel();
        int selectedRowIndex = TableDashboard.getSelectedRow();
        
        String Date = tblModel.getValueAt(selectedRowIndex, 0). toString();
        String Time = tblModel.getValueAt(selectedRowIndex, 1). toString();
        String GuestName = tblModel.getValueAt(selectedRowIndex, 2). toString();
        String PhoneNumber = tblModel.getValueAt(selectedRowIndex, 3). toString();
        String ApartmentCode = tblModel.getValueAt(selectedRowIndex, 4). toString();
        
        String nwDate = JOptionPane.showInputDialog(this, "Update Date", Date);
        String nwTime = JOptionPane.showInputDialog(this, "Update Time", Time);
        String nwGuestName = JOptionPane.showInputDialog(this, "Update Guest Name", GuestName);
        String nwPhoneNumber = JOptionPane.showInputDialog(this, "Update Phone Number", PhoneNumber);
        String nwApartmentCode = JOptionPane.showInputDialog(this, "Update Apartment Code", ApartmentCode);
        
        TableDashboard.setValueAt(nwDate, selectedRowIndex, 0);
        TableDashboard.setValueAt(nwTime, selectedRowIndex, 1);
        TableDashboard.setValueAt(nwGuestName, selectedRowIndex, 2);
        TableDashboard.setValueAt(nwPhoneNumber, selectedRowIndex, 3);
        TableDashboard.setValueAt(nwApartmentCode, selectedRowIndex, 4);
        
        ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("icons8-checked-60.png"));
        JOptionPane.showMessageDialog(this, "Updated Successful !! ", "SUCCESSFULL", JOptionPane.PLAIN_MESSAGE, Icon);
        //add if statement and else statement
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void TableDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDashboardMouseClicked
        
    }//GEN-LAST:event_TableDashboardMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel)TableDashboard.getModel();
        if(TableDashboard.getSelectedRowCount()==1){
            tblModel.removeRow(TableDashboard.getSelectedRow());
            //call delete method 
            //mDeleteFromTable();
                   ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("icons8-checked-60.png"));
            JOptionPane.showMessageDialog(this, "Deleted Successful !! ", "SUCCESSFULL", JOptionPane.PLAIN_MESSAGE, Icon);
        }else{
            if(TableDashboard.getRowCount()==0){
               JOptionPane.showMessageDialog(null,"Nothing to Delete From The Table", "DASHBOARD", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Select Row to Delete From The Table", "DASHBOARD", JOptionPane.WARNING_MESSAGE);
            }
        }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchString = txtSearch.getText();
        search(searchString);
    }//GEN-LAST:event_txtSearchKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TableDashboard;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void seticonImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-building-50.png"))); 
    }
}
