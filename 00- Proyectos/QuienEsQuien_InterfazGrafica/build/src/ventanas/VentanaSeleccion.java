/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author Postura
 */
public class VentanaSeleccion extends javax.swing.JFrame {

    
    public VentanaSeleccion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnCharizard = new javax.swing.JButton();
        btnRayquaza = new javax.swing.JButton();
        btnGroudon = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnOnix = new javax.swing.JButton();
        btnSteelix = new javax.swing.JButton();
        btnKyogre = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnLugia = new javax.swing.JButton();
        btnCharmander = new javax.swing.JButton();
        btnPikachu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccion de Pokemon");
        setAlwaysOnTop(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 1500));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCharizard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charizard.png"))); // NOI18N
        btnCharizard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharizardActionPerformed(evt);
            }
        });
        jPanel1.add(btnCharizard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 200));

        btnRayquaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rayquaza.jpg"))); // NOI18N
        btnRayquaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRayquazaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRayquaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 250, 200));

        btnGroudon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/groudon.png"))); // NOI18N
        btnGroudon.setText("Groudon");
        btnGroudon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroudonActionPerformed(evt);
            }
        });
        jPanel1.add(btnGroudon, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 250, 200));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 990, 200));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOnix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/onix.jpg"))); // NOI18N
        btnOnix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnixActionPerformed(evt);
            }
        });
        jPanel3.add(btnOnix, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 190));

        btnSteelix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/steelix.jpg"))); // NOI18N
        btnSteelix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSteelixActionPerformed(evt);
            }
        });
        jPanel3.add(btnSteelix, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 250, 190));

        btnKyogre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kyogre.jpg"))); // NOI18N
        btnKyogre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKyogreActionPerformed(evt);
            }
        });
        jPanel3.add(btnKyogre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 250, 190));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 990, 190));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1010, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 453, 1010, 10));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLugia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lugia.png"))); // NOI18N
        btnLugia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLugiaActionPerformed(evt);
            }
        });
        jPanel4.add(btnLugia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 200));

        btnCharmander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/charmander.jpg"))); // NOI18N
        btnCharmander.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharmanderActionPerformed(evt);
            }
        });
        jPanel4.add(btnCharmander, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 250, 200));

        btnPikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pikachu.jpg"))); // NOI18N
        btnPikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPikachuActionPerformed(evt);
            }
        });
        jPanel4.add(btnPikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 250, 200));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 990, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCharizardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharizardActionPerformed
        VentanaPreguntas VentanaPreguntas = new VentanaPreguntas();
        dispose();
        VentanaPreguntas.setLocationRelativeTo(null);
        VentanaPreguntas.setVisible(true);
        
        
    }//GEN-LAST:event_btnCharizardActionPerformed

    private void btnRayquazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRayquazaActionPerformed
        VentanaPreguntas1 VentanaPreguntas1 = new VentanaPreguntas1();
        dispose();
        VentanaPreguntas1.setLocationRelativeTo(null);
        VentanaPreguntas1.setVisible(true);
        
    }//GEN-LAST:event_btnRayquazaActionPerformed

    private void btnGroudonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroudonActionPerformed
         VentanaPreguntas2 VentanaPreguntas2 = new VentanaPreguntas2();
        dispose();
        VentanaPreguntas2.setLocationRelativeTo(null);
        VentanaPreguntas2.setVisible(true);
        
    }//GEN-LAST:event_btnGroudonActionPerformed

    private void btnOnixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnixActionPerformed
       VentanaPreguntas3 VentanaPreguntas3 = new VentanaPreguntas3();
        dispose();
        VentanaPreguntas3.setLocationRelativeTo(null);
        VentanaPreguntas3.setVisible(true);
        
        
    }//GEN-LAST:event_btnOnixActionPerformed

    private void btnSteelixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSteelixActionPerformed
        VentanaPreguntas6 VentanaPreguntas6 = new VentanaPreguntas6();
        dispose();
        VentanaPreguntas6.setLocationRelativeTo(null);
        VentanaPreguntas6.setVisible(true);
        
    }//GEN-LAST:event_btnSteelixActionPerformed

    private void btnKyogreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKyogreActionPerformed
         VentanaPreguntas5 VentanaPreguntas5 = new VentanaPreguntas5();
        dispose();
        VentanaPreguntas5.setLocationRelativeTo(null);
        VentanaPreguntas5.setVisible(true);
        
    }//GEN-LAST:event_btnKyogreActionPerformed

    private void btnLugiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLugiaActionPerformed
       VentanaPreguntas7 VentanaPreguntas7 = new VentanaPreguntas7();
        dispose();
        VentanaPreguntas7.setLocationRelativeTo(null);
        VentanaPreguntas7.setVisible(true);
        
    }//GEN-LAST:event_btnLugiaActionPerformed

    private void btnCharmanderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharmanderActionPerformed
        VentanaPreguntas8 VentanaPreguntas8 = new VentanaPreguntas8();
        dispose();
        VentanaPreguntas8.setLocationRelativeTo(null);
        VentanaPreguntas8.setVisible(true);
       
    }//GEN-LAST:event_btnCharmanderActionPerformed

    private void btnPikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPikachuActionPerformed
       VentanaPreguntas9 VentanaPreguntas9 = new VentanaPreguntas9();
        dispose();
        VentanaPreguntas9.setLocationRelativeTo(null);
        VentanaPreguntas9.setVisible(true);
       
    }//GEN-LAST:event_btnPikachuActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSeleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSeleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCharizard;
    private javax.swing.JButton btnCharmander;
    private javax.swing.JButton btnGroudon;
    private javax.swing.JButton btnKyogre;
    private javax.swing.JButton btnLugia;
    private javax.swing.JButton btnOnix;
    private javax.swing.JButton btnPikachu;
    private javax.swing.JButton btnRayquaza;
    private javax.swing.JButton btnSteelix;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
    
}

