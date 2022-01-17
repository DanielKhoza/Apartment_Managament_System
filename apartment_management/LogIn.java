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
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.*;
import java.util.Vector;


/**
 *
 * @author Daniel Khoza
 */
public class LogIn extends javax.swing.JFrame {
    
    public LogIn login;
    public Dashboard_Page Dashboard;
    private int counter = 5;

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        
        initComponents();
        this.EyeClose.setVisible(false);
        String fp = "<html><u> Forgot Password? </u></html>";
        forgotPassword.setText(fp);
        Dashboard = new Dashboard_Page();
        
        seticonImage();
        
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
        txtUserName = new javax.swing.JTextField();
        EyeClose = new javax.swing.JLabel();
        EyeOpen = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();
        txtUserPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setResizable(false);

        jPanel1.setLayout(null);

        txtUserName.setBorder(null);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName);
        txtUserName.setBounds(40, 70, 230, 30);

        EyeClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/hidden.png"))); // NOI18N
        EyeClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EyeCloseMousePressed(evt);
            }
        });
        jPanel1.add(EyeClose);
        EyeClose.setBounds(270, 120, 20, 30);

        EyeOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/eye.png"))); // NOI18N
        EyeOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EyeOpenMousePressed(evt);
            }
        });
        jPanel1.add(EyeOpen);
        EyeOpen.setBounds(270, 120, 20, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/Background/icons8-user-48 (1).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 0, 50, 60);

        btnLogIn.setBackground(new java.awt.Color(0, 0, 0));
        btnLogIn.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogIn);
        btnLogIn.setBounds(40, 180, 100, 30);

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);
        btnCancel.setBounds(160, 180, 110, 30);

        forgotPassword.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassword.setText("Forgot Password?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(forgotPassword);
        forgotPassword.setBounds(40, 150, 90, 16);

        txtUserPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserPasswordFocusLost(evt);
            }
        });
        jPanel1.add(txtUserPassword);
        txtUserPassword.setBounds(40, 120, 230, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 54, 70, 20);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 104, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apartment_management/Background/pexels-artem-lysenko-3825673 (Background).jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 320, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        JOptionPane.showMessageDialog(this, "Please Contact the Management Team \n" + "To Confirm Your Identity \n" + "\n" + "Tell: 011-562" , "WARNING !!", 
                JOptionPane.WARNING_MESSAGE);
        txtUserName.setText(null);
        txtUserPassword.setText(null);
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        //Add if for username and password then else with exxecution
        if (txtUserName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"User Name Required");
            //lblUserName.setText("User Name Required");
            txtUserName.requestFocusInWindow();
            
        }
        else if (txtUserPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Password Required");
            txtUserPassword.requestFocusInWindow();
        } else
                {
        Scanner Login = new Scanner (System.in);
                
        String username = txtUserName.getText();
        String pass = txtUserPassword.getText();
        
        if(username.equals("Admin") && (pass.equals("12345")))
        {
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("icons8-checked-60.png"));
            JOptionPane.showMessageDialog(this, "Password Successful !! ", "SUCCESSFULL", JOptionPane.PLAIN_MESSAGE, Icon);
            Dashboard.setVisible(true);
            this.hide();
        }else 
        {
            txtUserName.setText(null);
            txtUserPassword.setText(null);
                    
            JOptionPane.showMessageDialog(null,"ERROR!! \n Invalid Password or Username! \n" + "Attempts left:" + counter, "ERROR", JOptionPane.ERROR_MESSAGE);
                      
            //Disable Btn
            counter--;
                if(counter == 0) {
                    JOptionPane.showMessageDialog(null,"NO MORE ATTEMPTS LEFT", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btnLogIn.setEnabled(false);
                    }
            login.setVisible(true);
        }
    }
        
                
        //Not In Use
       /*if (username.contains("Admin") && (pass.contains("12345"))){
            txtUserName.setText(null);
            txtUserPassword.setText(null);
                   
            systemExit();
            
            ImageIcon Icon = new javax.swing.ImageIcon(getClass().getResource("icons8-checked-60.png"));
            JOptionPane.showMessageDialog(this, "Password Successful !! ", "SUCCESSFULL", JOptionPane.PLAIN_MESSAGE, Icon);
             
            Dashboard.setVisible(true);
            this.hide();
            
                
        }
        else{
            txtUserName.setText(null);
            txtUserPassword.setText(null);
                    
            JOptionPane.showMessageDialog(null,"ERROR!! \n Invalid Password or Username! \n" + "Attempts left:" + counter, "ERROR", JOptionPane.ERROR_MESSAGE);
            
            //Disable Btn
            counter--;
                if(counter == 0) {
                    JOptionPane.showMessageDialog(null,"NO MORE ATTEMPTS LEFT", "ERROR", JOptionPane.ERROR_MESSAGE);
                    btnLogIn.setEnabled(false);
                    }
            login.setVisible(true);
        }
        this.toBack();
        Dashboard.toFront();
        */
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

       
        int response = JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Cancel? " , "CONFIRM", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        else if(response== JOptionPane.NO_OPTION){
            login.setVisible(true);
        }
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtUserPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserPasswordFocusGained
        
    }//GEN-LAST:event_txtUserPasswordFocusGained

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserPasswordFocusLost
        
    }//GEN-LAST:event_txtUserPasswordFocusLost

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void EyeOpenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EyeOpenMousePressed
        EyeClose.setVisible(true);
        EyeOpen.setVisible(false);
        txtUserPassword.setEchoChar((char)0);
    }//GEN-LAST:event_EyeOpenMousePressed

    private void EyeCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EyeCloseMousePressed
        EyeOpen.setVisible(true);
        EyeClose.setVisible(false);
        txtUserPassword.setEchoChar('*');
    }//GEN-LAST:event_EyeCloseMousePressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EyeClose;
    private javax.swing.JLabel EyeOpen;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JPasswordField txtUserPassword;
    // End of variables declaration//GEN-END:variables
  
    private void systemExit(){
    WindowEvent winClosing = new WindowEvent (this, WindowEvent.WINDOW_CLOSING); 
}

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void seticonImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icons8-building-50.png"))); 
    }
    
}


