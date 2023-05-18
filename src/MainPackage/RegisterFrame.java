/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import config.DBconnector;
import config.PasswordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rhai
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
    }
    
    Color hovbtn = new Color(69,60,240);
    Color defbtn = new Color(126,120,240);
    
    int validateRegister(){
         int result;
        if(regfname_inp.getText().isEmpty() || reglname_inp.getText().isEmpty() || regemail_inp.getText().isEmpty() || reguname_inp.getText().isEmpty() || regpass_inp.getText().isEmpty()){
            result = 0;
        }else{
            result = 1;
        }
        return result;
    }
     public boolean validation(){
  String name= regfname_inp.getText();
String email= regemail_inp.getText();
String usern= reguname_inp.getText();
String pwd= regpass_inp.getText();
 if (name.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER USERNAME");
 return false;
 }
 if(email.equals("") || !email.matches("^.+@.+\\..+$")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER VALID EMAIL");
 return false;
 }
if(usern.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER CONTACT NUMBER");
 return false;
 }     
 if(pwd.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER PASSWORD");
 return false;
 }    
     
   return true;  
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_pnl = new javax.swing.JPanel();
        Login_pnl = new javax.swing.JPanel();
        minimize_btn = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        regfname_inp = new javax.swing.JTextField();
        reglname_inp = new javax.swing.JTextField();
        regemail_inp = new javax.swing.JTextField();
        reguname_inp = new javax.swing.JTextField();
        regpass_inp = new javax.swing.JTextField();
        register_btn = new javax.swing.JPanel();
        register_lbl = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JPanel();
        cancel_lbl = new javax.swing.JLabel();
        login_lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Apprhai_ico = new javax.swing.JLabel();
        BG_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG_pnl.setPreferredSize(new java.awt.Dimension(850, 550));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_pnl.setBackground(new java.awt.Color(204, 202, 240));
        Login_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_btn.setText("—");
        minimize_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_btnMouseClicked(evt);
            }
        });
        Login_pnl.add(minimize_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        Login_pnl.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));

        regfname_inp.setBackground(new java.awt.Color(204, 202, 240));
        regfname_inp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regfname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        regfname_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regfname_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(regfname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 320, 50));

        reglname_inp.setBackground(new java.awt.Color(204, 202, 240));
        reglname_inp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reglname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        reglname_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reglname_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(reglname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 320, 50));

        regemail_inp.setBackground(new java.awt.Color(204, 202, 240));
        regemail_inp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regemail_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        regemail_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regemail_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(regemail_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, 50));

        reguname_inp.setBackground(new java.awt.Color(204, 202, 240));
        reguname_inp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reguname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        reguname_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reguname_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(reguname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 320, 50));

        regpass_inp.setBackground(new java.awt.Color(204, 202, 240));
        regpass_inp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regpass_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        regpass_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpass_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(regpass_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 320, 50));

        register_btn.setBackground(new java.awt.Color(126, 120, 240));
        register_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_btnMouseExited(evt);
            }
        });

        register_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        register_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_lbl.setText("REGISTER");

        javax.swing.GroupLayout register_btnLayout = new javax.swing.GroupLayout(register_btn);
        register_btn.setLayout(register_btnLayout);
        register_btnLayout.setHorizontalGroup(
            register_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(register_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        register_btnLayout.setVerticalGroup(
            register_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(register_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Login_pnl.add(register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 140, 50));

        cancel_btn.setBackground(new java.awt.Color(126, 120, 240));
        cancel_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel_btnMouseExited(evt);
            }
        });

        cancel_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel_lbl.setText("CANCEL");

        javax.swing.GroupLayout cancel_btnLayout = new javax.swing.GroupLayout(cancel_btn);
        cancel_btn.setLayout(cancel_btnLayout);
        cancel_btnLayout.setHorizontalGroup(
            cancel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        cancel_btnLayout.setVerticalGroup(
            cancel_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Login_pnl.add(cancel_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, 50));

        login_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        login_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_lbl.setText("Already have an Account? Click Here to Login");
        login_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_lblMouseClicked(evt);
            }
        });
        Login_pnl.add(login_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 460, 50));

        BG_pnl.add(Login_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 460, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFE MANAGEMENT SYSTEM");
        BG_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 390, -1));

        Apprhai_ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apprhai_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/caffee.png"))); // NOI18N
        BG_pnl.add(Apprhai_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        BG_img.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BG_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/full backg.jpg"))); // NOI18N
        BG_pnl.add(BG_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimize_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btnMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimize_btnMouseClicked

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_close_btnMouseClicked

    private void reguname_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reguname_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reguname_inpActionPerformed

    private void reglname_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reglname_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reglname_inpActionPerformed

    private void regfname_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regfname_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regfname_inpActionPerformed

    private void regpass_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpass_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regpass_inpActionPerformed

    private void regemail_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regemail_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regemail_inpActionPerformed

    private void register_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_btnMouseClicked
       
        if(validation() == true){
            

                String pass;
            try {
                pass = PasswordHasher.hashPassword(regpass_inp.getText());
          
        
            DBconnector dbc = new DBconnector();
            int result = dbc.insertData("INSERT INTO tbl_user (user_fname, user_lname, user_email, user_uname, user_pass) "
                    + "VALUES ('"+regfname_inp.getText()+"', '"+reglname_inp.getText()+"', '"+regemail_inp.getText()+"', '"+reguname_inp.getText()+"', '"+pass+"')");
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Successfully Registered!");
                    LoginFrame  lf = new LoginFrame();
                    this.dispose();
                    lf.setVisible(true);
              
                    
            }
            else{
                 System.out.println("Saving Data Failed!");
            }
              } catch (NoSuchAlgorithmException ex) {
                System.out.println(""+ex);
            }
          
        }
    }//GEN-LAST:event_register_btnMouseClicked

    private void register_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_btnMouseEntered
        register_btn.setBackground(hovbtn);
    }//GEN-LAST:event_register_btnMouseEntered

    private void register_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_btnMouseExited
        register_btn.setBackground(defbtn);
    }//GEN-LAST:event_register_btnMouseExited

    private void cancel_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_btnMouseClicked
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancel_btnMouseClicked

    private void cancel_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_btnMouseEntered
        cancel_btn.setBackground(hovbtn);
    }//GEN-LAST:event_cancel_btnMouseEntered

    private void cancel_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel_btnMouseExited
        cancel_btn.setBackground(defbtn);
    }//GEN-LAST:event_cancel_btnMouseExited

    private void login_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_lblMouseClicked
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_login_lblMouseClicked

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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apprhai_ico;
    private javax.swing.JLabel BG_img;
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JPanel Login_pnl;
    private javax.swing.JPanel cancel_btn;
    private javax.swing.JLabel cancel_lbl;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JLabel minimize_btn;
    private javax.swing.JTextField regemail_inp;
    private javax.swing.JTextField regfname_inp;
    private javax.swing.JPanel register_btn;
    private javax.swing.JLabel register_lbl;
    private javax.swing.JTextField reglname_inp;
    private javax.swing.JTextField regpass_inp;
    private javax.swing.JTextField reguname_inp;
    // End of variables declaration//GEN-END:variables
}
