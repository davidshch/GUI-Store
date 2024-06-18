package davids.unitfour;

import java.awt.Dimension;
import java.awt.Toolkit;

/* Name: David Shcherbatykh 
 * Wednesday, Nov. 22
 * ICS3U 
 * Description: A simple POS terminal for a refurbished computer system store named TechRevive. You must login 
 * with the account password TR123! and the username of your account (up to the user) that is 18 characters or less.
 * The store has laptops and PCs and you can add them to your cart which is shown on the left and at checkout.
 * The hardware details of the computer systems are displayed below their respective images. A bundle is available
 * for purchase in the PC section that includes a PC, keyboard, and mouse that is on sale. You can remove items from 
 * your cart by selecting the item you wish to remove and pressing the remove button. If you wish to clear the items from
 * your cart you can press the clear button. Finally when you are ready to purchase you may press the checkout button to 
 * finalize your order that displays the number of items in your cart, subtotal, tax, and total of your purchase. To make
 * another purchase you may press the Back to Store button.
 */
public class TRLogin extends javax.swing.JFrame {

    /**
     * Creates new form TRLogin
     */
    public TRLogin() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        errorDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        errorDialog2 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        okBtn1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        logBtn = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();

        errorDialog1.setTitle("Incorrect Password");
        errorDialog1.setBackground(new java.awt.Color(255, 51, 51));
        errorDialog1.setResizable(false);
        errorDialog1.setSize(new java.awt.Dimension(400, 300));
        errorDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(35, 79, 86));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Incorrect Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("The password you entered is incorrect. ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Please try again.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 30));

        okBtn.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel2.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 60, 30));

        errorDialog1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        errorDialog2.setTitle("Incorrect Password");
        errorDialog2.setBackground(new java.awt.Color(255, 51, 51));
        errorDialog2.setResizable(false);
        errorDialog2.setSize(new java.awt.Dimension(400, 300));
        errorDialog2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(35, 79, 86));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("Invalid Username");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("The username you have entered is invalid.");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Max username length is 18 characters.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 340, 30));

        okBtn1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        okBtn1.setText("OK");
        okBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(okBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 60, 30));

        errorDialog2.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        errorDialog2.getAccessibleContext().setAccessibleName("Invalid Username");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 79, 86));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("HP Simplified", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("TechRevive");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 290, 40));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 100, -1));

        username.setBackground(new java.awt.Color(204, 255, 204));
        username.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 120, 30));

        logBtn.setBackground(new java.awt.Color(153, 255, 153));
        logBtn.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        logBtn.setText("Login");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 100, 40));

        pass.setBackground(new java.awt.Color(204, 255, 204));
        pass.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        pass.setText("-----------");
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
        });
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        String usrname = "";
        String password = "TR123!"; // Password for login

        // Retrieving the username from the JTextField
        if (username.getText().toString().length() > 18) { // Username can't be longer than 18 characters
            errorDialog2.setLocationRelativeTo(this); // center the dialog to "this" - JFrame that produces it
            errorDialog2.setVisible(true); // Username error dialog pops up
        }
        usrname = username.getText();

        // Check if the password is equal 
        if (password.equals(pass.getText())) { //Checks if password is valid
            TRStore insideFrame = new TRStore(usrname);
            insideFrame.setVisible(true); // Make store object
            this.dispose(); // Get rid of login screen
        } else {
            errorDialog1.setLocationRelativeTo(this); // center the dialog to "this" - JFrame that prodcues it
            errorDialog1.setVisible(true); //password is wrong, pop up
        }
    }//GEN-LAST:event_logBtnActionPerformed

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        pass.setText("");
    }//GEN-LAST:event_passMousePressed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        errorDialog1.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        pass.setText("");
    }//GEN-LAST:event_passFocusGained

    private void okBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtn1ActionPerformed
        errorDialog2.dispose();
    }//GEN-LAST:event_okBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(TRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog errorDialog1;
    private javax.swing.JDialog errorDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton okBtn;
    private javax.swing.JButton okBtn1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
