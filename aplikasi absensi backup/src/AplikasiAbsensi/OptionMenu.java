/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiAbsensi;

/**
 *
 * @author Asus
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenu() {
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

        absensi = new javax.swing.JButton();
        rekapHarianForm = new javax.swing.JButton();
        rekapMingguanFrom = new javax.swing.JButton();

        setTitle("OPTION MENU");

        absensi.setText("Absensi");
        absensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absensiActionPerformed(evt);
            }
        });

        rekapHarianForm.setText("Rekap Harian");
        rekapHarianForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapHarianFormActionPerformed(evt);
            }
        });

        rekapMingguanFrom.setText("Rekap Mingguan");
        rekapMingguanFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapMingguanFromActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(absensi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(rekapHarianForm, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(rekapMingguanFrom)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rekapHarianForm)
                    .addComponent(absensi)
                    .addComponent(rekapMingguanFrom))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rekapHarianFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapHarianFormActionPerformed
        // TODO add your handling code here:
        RekapHarian rekapHarian = new  RekapHarian();
        rekapHarian.setVisible(true);
        this.getDesktopPane().add(rekapHarian);
        this.dispose();
    }//GEN-LAST:event_rekapHarianFormActionPerformed

    private void absensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absensiActionPerformed
        // TODO add your handling code here:
        AbsensiForm absensiForm = new AbsensiForm();
        absensiForm.setVisible(true);
        this.getDesktopPane().add(absensiForm);
        this.dispose();
        
    }//GEN-LAST:event_absensiActionPerformed

    private void rekapMingguanFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapMingguanFromActionPerformed
        // TODO add your handling code here:
        RekapMingguan rekapMingguan = new  RekapMingguan();
        rekapMingguan.setVisible(true);
        this.getDesktopPane().add(rekapMingguan);
        this.dispose();                  
    }//GEN-LAST:event_rekapMingguanFromActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absensi;
    private javax.swing.JButton rekapHarianForm;
    private javax.swing.JButton rekapMingguanFrom;
    // End of variables declaration//GEN-END:variables
}
