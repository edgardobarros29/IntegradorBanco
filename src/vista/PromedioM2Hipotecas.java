/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.LecturaArchivoInmueble;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Propiedad;

/**
 *
 * @author MultiRepair
 */
public class PromedioM2Hipotecas extends javax.swing.JFrame {

    /**
     * Creates new form PromedioM2Hipotecas
     */
    public PromedioM2Hipotecas() {
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

        contenedorPromedio = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonCargarDatosInmueble = new javax.swing.JButton();
        promedioPropiedad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedorPromedio.setBackground(new java.awt.Color(255, 255, 255));
        contenedorPromedio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jLabel1.setText("Promedio ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(349, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        contenedorPromedio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel3.setBackground(new java.awt.Color(0, 134, 190));

        botonVolver.setBackground(new java.awt.Color(0, 134, 190));
        botonVolver.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arrow_left_2.png"))); // NOI18N
        botonVolver.setMnemonic('\u0006');
        botonVolver.setText("  Volver");
        botonVolver.setBorder(null);
        botonVolver.setBorderPainted(false);
        botonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVolver.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonVolver.setMaximumSize(new java.awt.Dimension(179, 129));
        botonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVolverMouseClicked(evt);
            }
        });
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(660, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedorPromedio.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 800, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Promedio en m2 de casas y departamentos");
        contenedorPromedio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        botonCargarDatosInmueble.setBackground(new java.awt.Color(0, 134, 190));
        botonCargarDatosInmueble.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        botonCargarDatosInmueble.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarDatosInmueble.setText("Promedio");
        botonCargarDatosInmueble.setBorder(null);
        botonCargarDatosInmueble.setBorderPainted(false);
        botonCargarDatosInmueble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCargarDatosInmueble.setMargin(new java.awt.Insets(0, 0, 0, 0));
        botonCargarDatosInmueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCargarDatosInmuebleMouseClicked(evt);
            }
        });
        botonCargarDatosInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarDatosInmuebleActionPerformed(evt);
            }
        });
        contenedorPromedio.add(botonCargarDatosInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 140, 40));

        promedioPropiedad.setBackground(new java.awt.Color(187, 187, 187));
        promedioPropiedad.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        promedioPropiedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        promedioPropiedad.setToolTipText("");
        promedioPropiedad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contenedorPromedio.add(promedioPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 390, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVolverMouseClicked

    }//GEN-LAST:event_botonVolverMouseClicked

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.hide();
        Consultas h = new Consultas();
        h.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonCargarDatosInmuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCargarDatosInmuebleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCargarDatosInmuebleMouseClicked

    private void botonCargarDatosInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarDatosInmuebleActionPerformed

        HashMap<String, Propiedad> mapPropiedad = new HashMap<String, Propiedad>();

        LecturaArchivoInmueble a = new LecturaArchivoInmueble();

        mapPropiedad = a.propiedadCargadaMapa();

        Set<String> keys = mapPropiedad.keySet();

        double valorCubiertos = 0.0;
        double valor = 0.0;

        for (String key : keys) {
            if (key != null) {
                String tempCubiertos = mapPropiedad.get(key).getMetrosCuadradosCubiertos();
                valorCubiertos = valorCubiertos + Double.parseDouble(tempCubiertos);
            }
        }

        Integer sum = mapPropiedad.size() - 1;
        System.out.println(sum);
        valor = Math.round((valorCubiertos) / sum);

        promedioPropiedad.setText(Double.toString(valor));

    }//GEN-LAST:event_botonCargarDatosInmuebleActionPerformed

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
            java.util.logging.Logger.getLogger(PromedioM2Hipotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PromedioM2Hipotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PromedioM2Hipotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PromedioM2Hipotecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PromedioM2Hipotecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargarDatosInmueble;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel contenedorPromedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel promedioPropiedad;
    // End of variables declaration//GEN-END:variables
}
