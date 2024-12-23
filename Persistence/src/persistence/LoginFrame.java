/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Careen Emilza
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        pnlLGN = new javax.swing.JPanel();
        lblLGN = new javax.swing.JLabel();
        txtUSN = new javax.swing.JTextField();
        pwfPWD = new javax.swing.JPasswordField();
        lblUSN = new javax.swing.JLabel();
        lblPWD = new javax.swing.JLabel();
        btnLOG = new javax.swing.JButton();
        lblTNY = new javax.swing.JLabel();
        lblREG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLGN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLGN.setText("LOGIN");

        txtUSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUSNActionPerformed(evt);
            }
        });

        lblUSN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUSN.setText("Username");

        lblPWD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPWD.setText("Password");

        btnLOG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLOG.setText("LOGIN");
        btnLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOGActionPerformed(evt);
            }
        });

        lblTNY.setText("Belum punya akun?");

        lblREG.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblREG.setText("Registrasi");
        lblREG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblREGMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLGNLayout = new javax.swing.GroupLayout(pnlLGN);
        pnlLGN.setLayout(pnlLGNLayout);
        pnlLGNLayout.setHorizontalGroup(
            pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLGNLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLGNLayout.createSequentialGroup()
                        .addComponent(btnLOG)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLGNLayout.createSequentialGroup()
                        .addComponent(lblLGN)
                        .addGap(153, 153, 153))))
            .addGroup(pnlLGNLayout.createSequentialGroup()
                .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLGNLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUSN)
                            .addComponent(lblPWD))
                        .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlLGNLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtUSN, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addGroup(pnlLGNLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pwfPWD))))
                    .addGroup(pnlLGNLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblTNY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblREG)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        pnlLGNLayout.setVerticalGroup(
            pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLGNLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLGN)
                .addGap(38, 38, 38)
                .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSN))
                .addGap(39, 39, 39)
                .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwfPWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPWD))
                .addGap(41, 41, 41)
                .addComponent(btnLOG)
                .addGap(18, 18, 18)
                .addGroup(pnlLGNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTNY)
                    .addComponent(lblREG))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLGN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLGN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUSNActionPerformed

    private void btnLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOGActionPerformed
        if (txtUSN.getText().isEmpty() || String.valueOf(pwfPWD.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harap isi username dan password terlebih dahulu.");
        } else {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistencePU");
            EntityManager em = emf.createEntityManager();

            try {
                em.getTransaction().begin();

                String username = txtUSN.getText();
                String password = String.valueOf(pwfPWD.getPassword());

                Datalogin dataLogin = em.find(Datalogin.class, username);

                if (dataLogin == null) {
                    JOptionPane.showMessageDialog(null, "Username tidak ditemukan.");
                    txtUSN.requestFocus();
                } else if (dataLogin.getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "Selamat datang!");
                    MataKuliah p = new MataKuliah();
                    p.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Password salah!");
                }

                em.getTransaction().commit();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
                ex.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }
        }
    }//GEN-LAST:event_btnLOGActionPerformed

    private void lblREGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblREGMouseClicked
        RegistFrame yes = new RegistFrame();
        yes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblREGMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLOG;
    private javax.swing.JLabel lblLGN;
    private javax.swing.JLabel lblPWD;
    private javax.swing.JLabel lblREG;
    private javax.swing.JLabel lblTNY;
    private javax.swing.JLabel lblUSN;
    private javax.swing.JPanel pnlLGN;
    private javax.swing.JPasswordField pwfPWD;
    private javax.swing.JTextField txtUSN;
    // End of variables declaration//GEN-END:variables

//    private Object getPassword() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
