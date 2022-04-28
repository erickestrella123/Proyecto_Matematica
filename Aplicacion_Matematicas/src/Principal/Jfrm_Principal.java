/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

/**
 *
 * @author Erick
 */
public class Jfrm_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Jfrm_Principal
     */
    public Jfrm_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Jbtn_Medidas_Peso = new javax.swing.JButton();
        Jbtn_Porcentaje = new javax.swing.JButton();
        Jbtn_Medidas_Capacidad = new javax.swing.JButton();
        Jbnt_Numeracion_Romana = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matemáticas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel1.setText("Unidad Educativa Fiscomicional");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setText("Nuestra Señora de Pompeya");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setText("Matemáticas");

        Jbtn_Medidas_Peso.setBackground(new java.awt.Color(255, 255, 255));
        Jbtn_Medidas_Peso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Medidas_Peso.setText("Medidas de Peso");
        Jbtn_Medidas_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Medidas_PesoActionPerformed(evt);
            }
        });

        Jbtn_Porcentaje.setBackground(new java.awt.Color(255, 255, 255));
        Jbtn_Porcentaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Porcentaje.setText("Porcentaje");
        Jbtn_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_PorcentajeActionPerformed(evt);
            }
        });

        Jbtn_Medidas_Capacidad.setBackground(new java.awt.Color(255, 255, 255));
        Jbtn_Medidas_Capacidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbtn_Medidas_Capacidad.setText("Medidas de Capacidad");
        Jbtn_Medidas_Capacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_Medidas_CapacidadActionPerformed(evt);
            }
        });

        Jbnt_Numeracion_Romana.setBackground(new java.awt.Color(255, 255, 255));
        Jbnt_Numeracion_Romana.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jbnt_Numeracion_Romana.setText("Numeración Romana");
        Jbnt_Numeracion_Romana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbnt_Numeracion_RomanaActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setText("© Erick Estrella | Segundo Informática");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(Jbtn_Medidas_Peso)
                        .addGap(91, 91, 91)
                        .addComponent(Jbtn_Medidas_Capacidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(15, 15, 15))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Jbtn_Porcentaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jbnt_Numeracion_Romana)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_Medidas_Peso)
                    .addComponent(Jbtn_Medidas_Capacidad))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_Porcentaje)
                    .addComponent(Jbnt_Numeracion_Romana))
                .addGap(43, 43, 43)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

    private void Jbtn_Medidas_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Medidas_PesoActionPerformed
        Medidas_Peso.Jfrm_Mediadas_Peso Medidas_peso = new Medidas_Peso.Jfrm_Mediadas_Peso();
        Medidas_peso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jbtn_Medidas_PesoActionPerformed

    private void Jbtn_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_PorcentajeActionPerformed
        Porcentaje.Jfrm_Porcentaje Porcentaje = new Porcentaje.Jfrm_Porcentaje();
        Porcentaje.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jbtn_PorcentajeActionPerformed

    private void Jbtn_Medidas_CapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_Medidas_CapacidadActionPerformed
        Medidas_Capacidad.Jfrm_Medidas_Capacidad Medidas_Capacidad = new Medidas_Capacidad.Jfrm_Medidas_Capacidad();
        Medidas_Capacidad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jbtn_Medidas_CapacidadActionPerformed

    private void Jbnt_Numeracion_RomanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbnt_Numeracion_RomanaActionPerformed
        Numeracion_Romana.Jfrm_Numeracion_Romana Numeracion_Romana = new Numeracion_Romana.Jfrm_Numeracion_Romana();
        Numeracion_Romana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Jbnt_Numeracion_RomanaActionPerformed

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
            java.util.logging.Logger.getLogger(Jfrm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jfrm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jfrm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jfrm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jfrm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbnt_Numeracion_Romana;
    private javax.swing.JButton Jbtn_Medidas_Capacidad;
    private javax.swing.JButton Jbtn_Medidas_Peso;
    private javax.swing.JButton Jbtn_Porcentaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
