/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package movies_world;

/**
 *
 * @author Kunal Mehra
 */
public class Home_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Home_Screen
     */
    public Home_Screen() {
        initComponents();
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
        login_button = new javax.swing.JButton();
        Register_Form = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        login_button.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        login_button.setText("LOGIN");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(login_button);
        login_button.setBounds(1265, 10, 220, 70);

        Register_Form.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        Register_Form.setText("REGISTER");
        Register_Form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_FormActionPerformed(evt);
            }
        });
        jPanel1.add(Register_Form);
        Register_Form.setBounds(10, 10, 250, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1500, 80);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movies_world/registere.jpg"))); // NOI18N
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 390, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        dispose();
        LoginForm obj = new LoginForm();
        obj.setVisible(true);
    }//GEN-LAST:event_login_buttonActionPerformed

    private void Register_FormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_FormActionPerformed
        dispose();
        registered obj = new registered();
        obj.setVisible(true);
    }//GEN-LAST:event_Register_FormActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register_Form;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_button;
    // End of variables declaration//GEN-END:variables
}
