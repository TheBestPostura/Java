/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import metodos.QuienEsQuien;


/**
 *
 * @author Postura
 */
public class VentanaPreguntas1 extends javax.swing.JFrame {

    
    public VentanaPreguntas1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTipo = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        btnLegendario = new javax.swing.JButton();
        btnVolador = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnTerrestre = new javax.swing.JButton();
        btnAdivinar = new javax.swing.JButton();
        btnAcuatico = new javax.swing.JButton();
        labelRayquaza = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¿Adivinaras el Pokemon? :D");
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnTipo.setBackground(new java.awt.Color(153, 153, 153));
        btnTipo.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnTipo.setForeground(new java.awt.Color(255, 255, 255));
        btnTipo.setText("¿De que tipo es el pokemon seleccionado?");
        btnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoActionPerformed(evt);
            }
        });

        btnColor.setBackground(new java.awt.Color(153, 153, 153));
        btnColor.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnColor.setForeground(new java.awt.Color(255, 255, 255));
        btnColor.setText("¿De que color es el pokemon seleccionado?");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        btnLegendario.setBackground(new java.awt.Color(153, 153, 153));
        btnLegendario.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnLegendario.setForeground(new java.awt.Color(255, 255, 255));
        btnLegendario.setText("¿Es legendario el pokemon seleccionado?");
        btnLegendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLegendarioActionPerformed(evt);
            }
        });

        btnVolador.setBackground(new java.awt.Color(153, 153, 153));
        btnVolador.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnVolador.setForeground(new java.awt.Color(255, 255, 255));
        btnVolador.setText("¿Es volador el pokemon seleccionado?");
        btnVolador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoladorActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(153, 153, 153));
        btnPre.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnPre.setForeground(new java.awt.Color(255, 255, 255));
        btnPre.setText("¿Tiene preevolucion el pokemon seleccionado?");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnTerrestre.setBackground(new java.awt.Color(153, 153, 153));
        btnTerrestre.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnTerrestre.setForeground(new java.awt.Color(255, 255, 255));
        btnTerrestre.setText("¿Es terrestre el pokemon seleccionado?");
        btnTerrestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerrestreActionPerformed(evt);
            }
        });

        btnAdivinar.setBackground(new java.awt.Color(102, 255, 102));
        btnAdivinar.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnAdivinar.setText("Adivinar pokemon");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });

        btnAcuatico.setBackground(new java.awt.Color(153, 153, 153));
        btnAcuatico.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        btnAcuatico.setForeground(new java.awt.Color(255, 255, 255));
        btnAcuatico.setText("¿Es acuatico el pokemon seleccionado?");
        btnAcuatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcuaticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTerrestre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLegendario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnAdivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnAcuatico, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLegendario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolador, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnTerrestre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnAdivinar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(463, Short.MAX_VALUE)
                    .addComponent(btnAcuatico, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 310, 600));

        labelRayquaza.setBackground(new java.awt.Color(255, 255, 255));
        labelRayquaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RayquazaPreguntas.jpeg"))); // NOI18N
        labelRayquaza.setText("jLabel1");
        jPanel1.add(labelRayquaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoActionPerformed
    String tipoUsuario = JOptionPane.showInputDialog(null, "Introduce el tipo del pokemon seleccionado:");
    tipo = rayquaza.getTipo();
        if (tipoUsuario.equalsIgnoreCase(tipo)) {
            JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado coincide con el " + tipo);
            JOptionPane.showMessageDialog(null, "Solo te queda un pokemon con esa caracteristica en la lista");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado no coincide con el color verde", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "Te quedan 6 preguntas aun para acertar al pokemon");
        }
        //btnTipo.setEnabled(false);
    }//GEN-LAST:event_btnTipoActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        String colorUsuario = JOptionPane.showInputDialog(null, "Introduce el color del pokemon seleccionado:");
        color = rayquaza.getColor();
        if (colorUsuario.equalsIgnoreCase(color)) {
            JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado coincide con el color verde ");
            JOptionPane.showMessageDialog(null, "Solo te queda un pokemon con esa caracteristica en la lista");
        } else {
            JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado no coincide con el tipo" + color, "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "Te quedan 5 preguntas aun para acertar al pokemon");
        }
        //btnColor.setEnabled(false);
    }//GEN-LAST:event_btnColorActionPerformed

    private void btnLegendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLegendarioActionPerformed
        
        legendario = rayquaza.getLegendario();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Es legendario el pokemon seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado es legendario ");
                JOptionPane.showMessageDialog(null, "Solo te quedan 3 pokemons con esas caracteristicas en la lista");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado no coincide con la rareza legendaria", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Te quedan 4 preguntas aun para acertar al pokemon");
    }     
            //btnLegendario.setEnabled(false);
    }//GEN-LAST:event_btnLegendarioActionPerformed

    private void btnVoladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoladorActionPerformed
        volador = rayquaza.getVolador();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Es volador el pokemon seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado puede volar ");
                JOptionPane.showMessageDialog(null, "Solo te quedan 3 pokemons con esas caracteristicas en la lista");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado no puede volar", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Te quedan 3 preguntas aun para acertar al pokemon");
    }
            //btnVolador.setEnabled(false);
    }//GEN-LAST:event_btnVoladorActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Tiene preevolucion o evoluciona el pokemon seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado tiene preevolucion o puede evolucionar ");
                JOptionPane.showMessageDialog(null, "Solo te quedan 3 pokemons con esas caracteristicas en la lista");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado si tiene preevolucion o evoluciona", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Te quedan 2 preguntas aun para acertar al pokemon");
    }
            //btnPre.setEnabled(false);
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnTerrestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerrestreActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Tiene preevolucion o evoluciona el pokemon seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado puede no caminar ");
                JOptionPane.showMessageDialog(null, "Solo te quedan 7 pokemons con esas caracteristicas en la lista");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado si puede caminar", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Te quedan 1 preguntas aun para acertar al pokemon");
    }
            //btnTerrestre.setEnabled(false);
    }//GEN-LAST:event_btnTerrestreActionPerformed

    private void btnAcuaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcuaticoActionPerformed
         int opcion = JOptionPane.showConfirmDialog(null, "¿Puede nadar o bucear el pokemon seleccionado?", "Pregunta", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Has acertado la pregunta el pokemon seleccionado no puede nadar o bucear ");
                JOptionPane.showMessageDialog(null, "Solo te quedan 2 pokemons con esas caracteristicas en la lista");
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, el pokemon seleccionado si puede nadar o bucear", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Te quedan 0 preguntas aun para acertar al pokemon, tienes que adivinar ya!!");
    }
            //btnAcuatico.setEnabled(false);
    }//GEN-LAST:event_btnAcuaticoActionPerformed

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
         String adivinar = rayquaza.getNombre();
         int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres adivinar el pokemon?", "Adivinanza", JOptionPane.YES_NO_OPTION);
         String adivinarPokemon = JOptionPane.showInputDialog(null, "Introduce el color del pokemon seleccionado:");
        if (opcion == JOptionPane.YES_OPTION && adivinarPokemon.equalsIgnoreCase(adivinar) ) {
                JOptionPane.showMessageDialog(null, "Enhorabuena!!!!!!!!! has acertado el pokemon a adivinar que era..." + adivinar);
            } else {
                JOptionPane.showMessageDialog(null, "Has fallado, no era el pokemon a adivinar, sigue intentandolo crack", "Respuesta equivocada", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnAdivinarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaPreguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPreguntas1().setVisible(true);
            }
        });
    }
    
    
    QuienEsQuien rayquaza = new QuienEsQuien("Rayquaza", "Dragon", "Verde", true, false, true, false, false);
    String nombre = rayquaza.getNombre();
    String tipo = rayquaza.getTipo();
    String color = rayquaza.getColor();
    boolean legendario = rayquaza.getLegendario();
    boolean terrestre = rayquaza.getTerrestre();
    boolean volador = rayquaza.getVolador();
    boolean acuatico = rayquaza.getAcuatico();
    boolean preevolucion = rayquaza.getPreevolucion();
    
    String pokemonSeleccionado = nombre;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcuatico;
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnLegendario;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnTerrestre;
    private javax.swing.JButton btnTipo;
    private javax.swing.JButton btnVolador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelRayquaza;
    // End of variables declaration//GEN-END:variables
}
