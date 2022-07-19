/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import static java.util.Collections.list;
import javax.swing.JOptionPane;

/**
 *
 * @author akank
 */
public class ATMHome extends javax.swing.JFrame {
    LinkedList list=new LinkedList();
           Customer cus;
    /**
     * Creates new form ATMHome
     */
    public ATMHome() {
        initComponents();
    }
        public ATMHome(Customer cus){
            initComponents();
            this.cus=cus;
        }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        Balance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\akank\\OneDrive\\Documents\\atmj.jfif")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(48, 66, 230, 225);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 60, 239, 156);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("  1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 240, 40, 33);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("  2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 240, 40, 33);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("  3");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 240, 40, 33);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setText("  4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(470, 280, 40, 33);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel8.setText("  5");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 280, 40, 33);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setText("  6");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 280, 40, 33);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setText("  7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 320, 40, 33);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setText("  8");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 320, 40, 33);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setText("  9");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 320, 40, 33);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("  0");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 360, 40, 33);

        clear.setBackground(new java.awt.Color(255, 204, 0));
        clear.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(615, 240, 100, 30);

        cancel.setBackground(new java.awt.Color(255, 0, 51));
        cancel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(610, 280, 120, 30);

        submit.setBackground(new java.awt.Color(51, 255, 51));
        submit.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(610, 320, 120, 30);

        withdraw.setBackground(new java.awt.Color(242, 242, 242));
        withdraw.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        withdraw.setText("Withdraw");
        withdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawMouseClicked(evt);
            }
        });
        getContentPane().add(withdraw);
        withdraw.setBounds(350, 80, 120, 32);

        Balance.setBackground(new java.awt.Color(242, 242, 242));
        Balance.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Balance.setText("Balance");
        Balance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BalanceMouseClicked(evt);
            }
        });
        Balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceActionPerformed(evt);
            }
        });
        getContentPane().add(Balance);
        Balance.setBounds(360, 130, 110, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        list.CheckBalance(cus);
        if(cus!=null){
            this.setVisible(false);
            new ATMHome(cus).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid card PIN or CARD #");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void BalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BalanceActionPerformed

    private void withdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Withdraw(cus).setVisible(true);
    }//GEN-LAST:event_withdrawMouseClicked

    private void BalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BalanceMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new CheckBalance(cus).setVisible(true);
    }//GEN-LAST:event_BalanceMouseClicked

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
            java.util.logging.Logger.getLogger(ATMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}