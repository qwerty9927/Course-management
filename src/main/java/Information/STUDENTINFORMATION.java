/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Information;

/**
 *
 * @author MSIs
 */
public class STUDENTINFORMATION extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public STUDENTINFORMATION() {
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

        tieude = new javax.swing.JLabel();
        Lastname = new javax.swing.JLabel();
        Firstname = new javax.swing.JLabel();
        Enrollmentdate = new javax.swing.JLabel();
        nuAadd2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        nutDelete = new javax.swing.JButton();
        nutEdit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nutReset = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        nutsearch = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tieude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tieude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/3_1.png"))); // NOI18N
        tieude.setText("STUDENT INFORMATION");
        getContentPane().add(tieude, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 285, -1));

        Lastname.setBackground(new java.awt.Color(0, 153, 255));
        Lastname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lastname.setText("Last name:");
        getContentPane().add(Lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 176, 20));

        Firstname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Firstname.setText("First name:");
        getContentPane().add(Firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 20));

        Enrollmentdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Enrollmentdate.setText("EnrollmentDate:");
        getContentPane().add(Enrollmentdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, 20));

        nuAadd2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuAadd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/b.png"))); // NOI18N
        nuAadd2.setText("Add");
        nuAadd2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nuAadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuAadd2ActionPerformed(evt);
            }
        });
        getContentPane().add(nuAadd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 90, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 310, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 310, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 310, -1));

        nutDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nutDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/delete (2).png"))); // NOI18N
        nutDelete.setText("Delete");
        nutDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nutDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(nutDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 90, -1));

        nutEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nutEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/edit.png"))); // NOI18N
        nutEdit.setText("Edit");
        nutEdit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nutEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutEditActionPerformed(evt);
            }
        });
        getContentPane().add(nutEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 90, -1));

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student ID", "Last name", "First name", "EnrollmentDate"
            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 800, 342));

        nutReset.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nutReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/reset..png"))); // NOI18N
        nutReset.setText("Reset");
        nutReset.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nutReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutResetActionPerformed(evt);
            }
        });
        getContentPane().add(nutReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 90, -1));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 400, 30));

        nutsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/1_1.png"))); // NOI18N
        nutsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsearchActionPerformed(evt);
            }
        });
        getContentPane().add(nutsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 34, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/image/backgound.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(2000, 450));
        background.setPreferredSize(new java.awt.Dimension(1000, 450));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuAadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuAadd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuAadd2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void nutDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutDeleteActionPerformed

    private void nutEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutEditActionPerformed

    private void nutResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutResetActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void nutsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nutsearchActionPerformed

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
            java.util.logging.Logger.getLogger(STUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STUDENTINFORMATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STUDENTINFORMATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enrollmentdate;
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Lastname;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton nuAadd2;
    private javax.swing.JButton nutDelete;
    private javax.swing.JButton nutEdit;
    private javax.swing.JButton nutReset;
    private javax.swing.JButton nutsearch;
    private javax.swing.JTextField search;
    private javax.swing.JTable table;
    private javax.swing.JLabel tieude;
    // End of variables declaration//GEN-END:variables
}
